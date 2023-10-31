/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class ContratoData {

    private String SQL = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ContratoData() {
    }

    public boolean isVigente(int idPropiedad) {
        SQL = "SELECT * FROM contrato WHERE contrato.idPropiedad = ? AND contrato.estado = 'VIGENTE'";
        boolean retornar = false;
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, idPropiedad);
            rs = ps.executeQuery();
            if (rs.next()) {
                retornar = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }

        return retornar;
    }

    public void crearContrato(Contrato nuevo) {
        SQL = "INSERT INTO contrato (idPropiedad, idInquilino, idGarante, idVendedor, "
                + "fechaContrato, fechaInicio, fechaFinalizacion, precio, estado, descripcion) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nuevo.getIdInmueble());
            ps.setInt(2, nuevo.getIdInquilino());
            ps.setInt(3, nuevo.getIdGarante());
            ps.setInt(4, nuevo.getIdVendedor());
            ps.setDate(5, Date.valueOf(nuevo.getFecha()));
            ps.setDate(6, Date.valueOf(nuevo.getFechaInicio()));
            ps.setDate(7, Date.valueOf(nuevo.getFechaFinalizacion()));
            ps.setInt(8, nuevo.getPrecio());
            ps.setString(9, nuevo.getEstado());
            ps.setString(10, nuevo.getDescripcion());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                nuevo.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato creado con exito.");

            } else {
                JOptionPane.showMessageDialog(null, "no se pudo crear el contrato");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }

    }

    public void elimminarContrato(Contrato borrar) {
        SQL = "UPDATE `contrato` SET `estado`='NO VIGENTE'WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, borrar.getId());
            int conseguido = ps.executeUpdate();
            if (conseguido > 0) {
                JOptionPane.showMessageDialog(null, "Contrato eliminado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Error en acceder a la tabla contratos");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }

    }

    public void editarContrato(Contrato editado) {
        SQL = "UPDATE `contrato` SET `idPropiedad`=?,`idInquilino`= ?,`idGarante`=?,"
                + "`idVendedor`=?,`fechaContrato`=?,`fechaInicio`=?,`fechaFinalizacion`=?,"
                + "`precio`=?,`estado`=?,`descripcion`= ? WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, editado.getIdInmueble());
            ps.setInt(2, editado.getIdInquilino());
            ps.setInt(3, editado.getIdGarante());
            ps.setInt(4, editado.getIdVendedor());
            ps.setDate(5, Date.valueOf(editado.getFecha()));
            ps.setDate(6, Date.valueOf(editado.getFechaInicio()));
            ps.setDate(7, Date.valueOf(editado.getFechaFinalizacion()));
            ps.setInt(8, editado.getPrecio());
            ps.setString(9, editado.getEstado());
            ps.setString(10, editado.getDescripcion());
            ps.setInt(11, editado.getId());
            int correcto = ps.executeUpdate();
            if (correcto > -1) {

                JOptionPane.showMessageDialog(null, "Contrato se edito con Correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Error en acceder a la tabla contratos");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }

    }

    public Contrato encontrarContrato(int id) {
        Contrato encontrado = new Contrato();
        SQL = "SELECT * FROM contrato WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                encontrado = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el contrato");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return encontrado;
    }

    public Contrato encontrarContratoXPropietario(int id) {
        Contrato encontrado = new Contrato();
        SQL = "SELECT contrato.* "
                + "FROM contrato "
                + "INNER JOIN inmueble ON contrato.idInmueble = inmueble.id "
                + "WHERE inmueble.idPropietario = ? ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                encontrado = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el contrato");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return encontrado;
    }

    public Contrato encontrarContratoXIdInmueble(int id) {
        Contrato regresado = null;
        SQL = "SELECT * FROM contrato WHERE estado <> 'NO VIGENTE' AND idPropiedad = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Contrato encontrado = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));
                regresado = encontrado;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el contrato");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(ContratoData.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return regresado;
    }

    public ArrayList<Contrato> listarContratos() {
        ArrayList<Contrato> contratos = new ArrayList<>();
        SQL = "SELECT * FROM contrato";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Contrato nuevo = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));
                contratos.add(nuevo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
        return contratos;
    }

    public ArrayList<Contrato> listarContratosXPropietario(int dni) {
        ArrayList<Contrato> contratos = new ArrayList<>();
        String dniInicio = String.valueOf(dni);
        SQL = "SELECT contrato.* "
                + "FROM contrato "
                + "INNER JOIN inmueble ON contrato.idPropiedad = inmueble.id "
                + "INNER JOIN personas ON inmueble.idPropietario = personas.id "
                + "WHERE personas.dni LIKE ? ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setString(1, dniInicio + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Contrato nuevo = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));
                contratos.add(nuevo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
        return contratos;
    }

    public ArrayList<Contrato> listarContratosXInquilno(int dni) {
        ArrayList<Contrato> contratos = new ArrayList<>();
        String dniInicio = String.valueOf(dni);
        SQL = "SELECT contrato.* "
                + "FROM contrato "
                + "INNER JOIN personas ON contrato.idInquilino = personas.id "
                + "WHERE personas.dni LIKE ? ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setString(1, dniInicio + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Contrato nuevo = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));
                contratos.add(nuevo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
        return contratos;
    }

    public ArrayList<Contrato> listarContratosXnombreUSuario(String nombre) {
        ArrayList<Contrato> contratos = new ArrayList<>();
        SQL = "SELECT contrato.* "
                + "FROM contrato "
                + "INNER JOIN usuarios ON contrato.idVendedor = usuarios.id "
                + "WHERE usuarios.nombre LIKE ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Contrato nuevo = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));
                contratos.add(nuevo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
        return contratos;
    }

    public ArrayList<Contrato> listarContratosXInmueble(int id) {
        ArrayList<Contrato> contratos = new ArrayList<>();
        String dniInicio = String.valueOf(id);
        SQL = "SELECT * FROM contrato WHERE idPropiedad LIKE ? ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setString(1, dniInicio + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Contrato nuevo = new Contrato(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getDate(6).toLocalDate(),
                        rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(),
                        rs.getInt(9), rs.getString(10), rs.getString(11));
                contratos.add(nuevo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        } finally {
            try {
                ps.close();
                rs.close();
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
        return contratos;
    }

}

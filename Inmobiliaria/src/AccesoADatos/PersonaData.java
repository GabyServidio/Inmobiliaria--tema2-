package AccesoADatos;

import Entidades.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Fernando Ariel Acevedo
 */
public class PersonaData {

    private String SQL = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public PersonaData() {
    }

    public void agregarPersona(Persona nueva) {
        SQL = "INSERT INTO `personas`(`nombre`, `apellido`, `dni`, `cuil`, `domicilio`, `telefono`, `eMail`, `estado`)"
                + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?) ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nueva.getNombre());
            ps.setString(2, nueva.getApellido());
            ps.setInt(3, nueva.getDni());
            ps.setLong(4, nueva.getCuil());
            ps.setString(5, nueva.getDomicilio());
            ps.setInt(6, nueva.getTelefono());
            ps.setString(7, nueva.getEmail());
            ps.setBoolean(8, nueva.isEstado());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                nueva.setId(rs.getInt(1)); //modifique para que tome el id generado

                JOptionPane.showMessageDialog(null, "persona creada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error en agregar persona ");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos." + ex);
            System.out.println(ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void eliminarPersona(Persona eliminar) {
        SQL = "UPDATE `personas` SET estado = FALSE WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, eliminar.getId());
            int confirmacion = ps.executeUpdate();
            if (confirmacion > -1) {
                JOptionPane.showMessageDialog(null, "eliminado correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void editarPersona(Persona editada) {

        SQL = "UPDATE `personas` SET nombre = ?, apellido = ?, dni = ?, cuil = ?, domicilio = ?, telefono = ?, eMail = ?, estado = ? WHERE personas.id = ? ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);

            ps.setString(1, editada.getNombre());
            ps.setString(2, editada.getApellido());
            ps.setInt(3, editada.getDni());
            ps.setLong(4, editada.getCuil());
            ps.setString(5, editada.getDomicilio());
            ps.setInt(6, editada.getTelefono());
            ps.setString(7, editada.getEmail());
            ps.setBoolean(8, editada.isEstado());
            ps.setInt(9, editada.getId());
            int resultado = ps.executeUpdate();
            if (resultado > -1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "La persona no existe");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }

    }

    public Persona encontrarPersona(int dni) {
        Persona encontrada = null;
        SQL = "SELECT * FROM personas WHERE dni = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                encontrada.setId(rs.getInt("id"));
                encontrada.setNombre(rs.getString("nombre"));
                encontrada.setApellido(rs.getString("apellido"));
                encontrada.setDni(rs.getInt("dni"));
                encontrada.setCuil(rs.getLong("cuil"));
                encontrada.setDomicilio(rs.getString("domicilio"));
                encontrada.setEmail(rs.getString("eMail"));
                encontrada.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese DNI");
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return encontrada;
    }

    public Persona encontrarInquilino(int dni) {
        Persona encontrada = null;
        SQL = "SELECT personas.* FROM personas INNER JOIN contrato ON personas.id = contrato.idInquilino "
                + " WHERE personas.dni = ?;";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                encontrada.setId(rs.getInt("id"));
                encontrada.setNombre(rs.getString("nombre"));
                encontrada.setApellido(rs.getString("apellido"));
                encontrada.setDni(rs.getInt("dni"));
                encontrada.setCuil(rs.getLong("cuil"));
                encontrada.setDomicilio(rs.getString("domicilio"));
                encontrada.setEmail(rs.getString("eMail"));
                encontrada.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese DNI");
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return encontrada;

    }

    public Persona encontrarGarante(int dni) {
        Persona encontrada = null;
        SQL = "SELECT personas.* FROM personas INNER JOIN contrato ON personas.id = contrato.idGarante "
                + " WHERE personas.dni = ?;";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                encontrada.setId(rs.getInt("id"));
                encontrada.setNombre(rs.getString("nombre"));
                encontrada.setApellido(rs.getString("apellido"));
                encontrada.setDni(rs.getInt("dni"));
                encontrada.setCuil(rs.getLong("cuil"));
                encontrada.setDomicilio(rs.getString("domicilio"));
                encontrada.setEmail(rs.getString("eMail"));
                encontrada.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese DNI");
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return encontrada;
    }

    public Persona econtrarPropietario(int dni) {
        Persona encontrada = null;
        SQL = "SELECT personas.* FROM personas INNER JOIN inmueble ON inmueble.idPropietario = personas.id  WHERE personas.dni = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                encontrada.setId(rs.getInt("id"));
                encontrada.setNombre(rs.getString("nombre"));
                encontrada.setApellido(rs.getString("apellido"));
                encontrada.setDni(rs.getInt("dni"));
                encontrada.setCuil(rs.getLong("cuil"));
                encontrada.setDomicilio(rs.getString("domicilio"));
                encontrada.setEmail(rs.getString("eMail"));
                encontrada.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese DNI");
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return encontrada;
    }

    public ArrayList<Persona> listarInquilinos(boolean estado) {
        ArrayList<Persona> inquilinos = new ArrayList<>();
        SQL = "SELECT * FROM personas  JOIN contrato WHERE personas.id= contrato.idInquilino AND estado = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setBoolean(1, estado);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona inquilino = new Persona();
                inquilino.setId(rs.getInt("id"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setDni(rs.getInt("dni"));
                inquilino.setCuil(rs.getLong("cuil"));
                inquilino.setDomicilio(rs.getString("domicilio"));
                inquilino.setEmail(rs.getString("eMail"));
                inquilino.setEstado(rs.getBoolean("estado"));
                inquilinos.add(inquilino);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return inquilinos;
    }

    public ArrayList<Persona> listarGarantes() {
        ArrayList<Persona> garantes = new ArrayList<>();
        SQL = "SELECT * FROM personas  JOIN contrato WHERE ? = contrato.idGarante";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona garante = new Persona();
                garante.setId(rs.getInt("id"));
                garante.setNombre(rs.getString("nombre"));
                garante.setApellido(rs.getString("apellido"));
                garante.setDni(rs.getInt("dni"));
                garante.setCuil(rs.getLong("cuil"));
                garante.setDomicilio(rs.getString("domicilio"));
                garante.setEmail(rs.getString("eMail"));
                garante.setEstado(rs.getBoolean("estado"));
                garantes.add(garante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return garantes;

    }

    public ArrayList<Persona> listarPropietarios() {
        ArrayList<Persona> propietarios = new ArrayList<>();
        SQL = "SELECT * FROM personas JOIN inmueble WHERE inmueble.idPropietario = personas.id";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona propietario = new Persona();
                propietario.setId(rs.getInt("id"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuil(rs.getLong("cuil"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEmail(rs.getString("eMail"));
                propietario.setEstado(rs.getBoolean("estado"));
                propietarios.add(propietario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return propietarios;

    }

}

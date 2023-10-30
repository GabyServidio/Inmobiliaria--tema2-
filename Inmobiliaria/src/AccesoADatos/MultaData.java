/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Inmueble;
import Entidades.Multa;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class MultaData {
    
    private String SQL = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public MultaData() {

    }

    public void GuardarMulta(Multa multa) {
        String sql = "INSERT INTO `multa`(`idInspeccion`, `idInquilino`, `fechaConfeccion`, `fechaPago`, `monto`) VALUES (?, ?, ?, ?, ?)";
        try {
            ps = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, multa.getIdInspeccion());
            ps.setInt(2, multa.getIdInquilino());
            ps.setDate(3, Date.valueOf(multa.getFechaConfeccion()));
            ps.setDate(4, Date.valueOf(multa.getFechaPago()));
            ps.setDouble(5, multa.getMonto());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                multa.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La multa se generó con exito.");

            }
        } catch (SQLException ex) {
            Logger.getLogger(MultaData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo generar la multa" + ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(MultaData.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
    }

    public Multa buscarMulta(int id) {

        Multa multa = null;
        String sql = "SELECT * FROM multa WHERE id = ?";
        ps = null;
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                multa = new Multa();
                multa.setId(rs.getInt("id"));
                multa.setIdInspeccion(rs.getInt("idInspeccion"));
                multa.setIdInquilino(rs.getInt("idInquilino"));
                multa.setFechaConfeccion(rs.getDate("fechaConfeccion").toLocalDate());
                multa.setFechaPago(rs.getDate("fechaPago").toLocalDate());
                multa.setMonto(rs.getDouble("monto"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la multa");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Multa " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return multa;
    }

    public List<Multa> listarMulta() {
        
        List<Multa> encontradas = new ArrayList<>();
        SQL = "SELECT * FROM multa";
        try {
            
            ps = Conexion.getConexion().prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Multa multa = new Multa();
                Date fecha = rs.getDate("fechaPago");
                multa.setId(rs.getInt("id"));
                multa.setIdInspeccion(rs.getInt("idInspeccion"));
                multa.setIdInquilino(rs.getInt("idInquilino"));
                multa.setFechaConfeccion(rs.getDate("fechaConfeccion").toLocalDate());
                if (fecha == null){
                    multa.setFechaPago(LocalDate.MIN);
                }else{
                    multa.setFechaPago(fecha.toLocalDate());
                }
                
                multa.setMonto(rs.getDouble("monto"));
                encontradas.add(multa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla multa " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return encontradas;

    }

    public void modificarMulta(Multa multa) {

        String sql = "UPDATE multa SET idInspeccion = ?,"
                + " idInquilino = ?, fechaConfeccion = ?, fechaPago = ?,"
                + " monto = ? WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, multa.getIdInspeccion());
            ps.setInt(2, multa.getIdInquilino());
            ps.setDate(3, Date.valueOf(multa.getFechaConfeccion()));
            ps.setDate(4, Date.valueOf(multa.getFechaPago()));
            ps.setDouble(5, multa.getMonto());
            ps.setInt(6, multa.getId());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "La multa no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Multa " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

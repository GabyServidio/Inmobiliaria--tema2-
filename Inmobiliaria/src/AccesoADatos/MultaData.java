/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import Entidades.Multa;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class MultaData {
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    private MultaData(){
    
    }
    
    public void GuardarMulta(Multa multa){
        String sql = "INSERT INTO multa (idInspeccion, idInquilino, fechaConfeccion, fechaPago, monto ) VALUES (?, ?, ?, ?, ?)";
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
        }catch(SQLException ex){
            Logger.getLogger(MultaData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo generar la multa" + ex);
        } finally{
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(MultaData.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error de conexion" + ex);
            }
        }
    }
}

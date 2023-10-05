/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Vendedor;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VendedorData {
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public VendedorData() {
    }

    public void RegistrarVendedor(Vendedor vendedor) {

        String sql = "INSERT INTO `vendedor`(`idPersona`, `usuario`, `contraseña`, `estado`)"
                + " VALUES (?,'?','?',?)";
        try {
            ps = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, vendedor.getIdPersona());
            ps.setString(2, vendedor.getUsuario());
            ps.setString(3, vendedor.getContraseña());
            ps.setBoolean(4, vendedor.isEstado()); 
            ps.executeUpdate(); 
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                vendedor.setId(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Vendedor registrado con exito.");
            }

        } catch (SQLException ex) {
            if (ex instanceof SQLIntegrityConstraintViolationException) { 
                JOptionPane.showMessageDialog(null, "Esta persona ya se encontraba registrada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor" + ex.getMessage());
            }
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        public Vendedor buscarVendedor(int id) {
        Vendedor vendedor = null;
        String sql = "SELECT idPersona, usuario, estado FROM vendedor WHERE id= ?";
        ps = null;
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                vendedor = new Vendedor();
                vendedor.setId(id);
                vendedor.setIdPersona(rs.getInt("idPersona"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Esta persona no es vendedor o no existe");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return vendedor;
    }
        public List<Vendedor> listarVendedoresActivos() {
        List<Vendedor> vendedores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vendedor WHERE estado = 1 ";
            ps = Conexion.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Vendedor vendedor = new Vendedor();
                vendedor.setId(rs.getInt("id"));
                vendedor.setIdPersona(rs.getInt("idPersona"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setEstado(rs.getBoolean("estado"));
                vendedores.add(vendedor);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Vendedor " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return vendedores;
    }
        public List<Vendedor> listarVendedoresDeBaja() {
        List<Vendedor> vendedores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vendedor WHERE estado = 0 ";
            ps = Conexion.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Vendedor vendedor = new Vendedor();
                vendedor.setId(rs.getInt("id"));
                vendedor.setIdPersona(rs.getInt("idPersona"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setEstado(rs.getBoolean("estado"));
                vendedores.add(vendedor);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Vendedor " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return vendedores;
}
        public void actualizarUsuario(Vendedor vendedor){
            
        String sql = "UPDATE vendedor SET usuario = ? WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, vendedor.getUsuario());
            ps.setInt(2, vendedor.getId());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente.");
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el nombre de usuario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
        public void actualizarContraseña(Vendedor vendedor){
            
        String sql = "UPDATE vendedor SET contraseña = ? WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, vendedor.getContraseña());
            ps.setInt(2, vendedor.getId());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contraseña modificada exitosamente.");
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la contraseña");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        public void bajaVendedor(Vendedor vendedor){
            String sql = "UPDATE vendedor SET estado = 0 WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, vendedor.getId());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Vendedor dado de baja exitosamente.");
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja al vendedor");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(VendedorData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        }
        

    


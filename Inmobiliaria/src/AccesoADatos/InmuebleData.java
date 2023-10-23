
package AccesoADatos;

import Entidades.Inmueble;
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

public class InmuebleData {
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public InmuebleData(){
        
    }
    
    public void GuardarInmueble(Inmueble inmueble){
        String sql = "INSERT INTO inmueble (superficie, cantAmbientes, canBaños,"
                + " fechaConstruccion, garage, estado, direccion, zona,"
                + " condicionesContrato, idPropietario, tipo ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inmueble.getSuperficie());
            ps.setInt(2, inmueble.getCantAmbientes());
            ps.setInt(3, inmueble.getCanBaños());
            ps.setDate(4, Date.valueOf(inmueble.getFechaConstruccion()));
            ps.setInt(5,inmueble.getGarage());
            ps.setString(6,inmueble.getEstadoInmueble());
            ps.setString(7, inmueble.getDireccion());
            ps.setString(8, inmueble.getZona());
            ps.setString(9, inmueble.getCondicionesContrato());
            ps.setInt(10, inmueble.getIdPropietario());
            ps.setString(11, inmueble.getTipo());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inmueble.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inmueble añadido con exito.");
                
            }
        }catch(SQLException ex){
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Inmueble buscarInmueble(int idPropietario) {
        Inmueble inmueble = null;
        String sql = "SELECT * FROM inmueble WHERE idPropietario = ?";
        ps = null;
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, idPropietario);
            rs = ps.executeQuery();
            if (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setId(rs.getInt("id"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setCanBaños(rs.getInt("canBaños"));
                inmueble.setFechaConstruccion(rs.getDate("fechaConstruccion").toLocalDate());
                inmueble.setGarage(rs.getInt("garage"));
                inmueble.setEstadoInmueble(rs.getString("estado"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setCondicionesContrato(rs.getString("condicionesContrato"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el inmueble");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return inmueble;
    }
    public Inmueble buscarInmuebleXId(int id) {
        Inmueble inmueble = null;
        String sql = "SELECT * FROM inmueble WHERE id = ?";
        ps = null;
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setId(rs.getInt("id"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setCanBaños(rs.getInt("canBaños"));
                inmueble.setFechaConstruccion(rs.getDate("fechaConstruccion").toLocalDate());
                inmueble.setGarage(rs.getInt("garage"));
                inmueble.setEstadoInmueble(rs.getString("estado"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setCondicionesContrato(rs.getString("condicionesContrato"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el inmueble");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return inmueble;
    }
    public List<Inmueble> listarInmueble() {
        List<Inmueble> inmuebles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inmueble";
            ps = Conexion.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                     
                inmueble.setId(rs.getInt("id"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setCanBaños(rs.getInt("canBaños"));
                inmueble.setFechaConstruccion(rs.getDate("fechaConstruccion").toLocalDate());
                inmueble.setGarage(rs.getInt("garage"));
                inmueble.setEstadoInmueble(rs.getString("estado"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setCondicionesContrato(rs.getString("condicionesContrato"));
                inmuebles.add(inmueble);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inmueble " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return inmuebles;
    }
    
    public void modificarInmueble(Inmueble inmueble) {

        String sql = "UPDATE inmueble SET superficie = ? , cantAmbientes = ?,"
                + " canBaños = ?, fechaConstruccion = ?, garage = ?,"
                + " estado = ?, direccion = ?, zona = ?, tipo = ?,"
                + " condicionesContrato = ? WHERE idPropietario = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, inmueble.getSuperficie());
            ps.setInt(2, inmueble.getCantAmbientes());
            ps.setInt(3, inmueble.getCanBaños());
            ps.setDate(4, Date.valueOf(inmueble.getFechaConstruccion()));
            ps.setInt(5, inmueble.getGarage());
            ps.setString(6, inmueble.getEstadoInmueble());
            ps.setString(7, inmueble.getDireccion());
            ps.setString(8, inmueble.getZona());
            ps.setString(9, inmueble.getTipo());
            ps.setString(10, inmueble.getCondicionesContrato());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
                
            } else {
                JOptionPane.showMessageDialog(null, "El inmueble no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void eliminarInmueble(int id) {

        try {
            String sql = "UPDATE inmueble SET estado = 'NO DISPONIBLE' WHERE id = ? ";
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Nuevo estado del inmueble: NO DISPONIBLE");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble");
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

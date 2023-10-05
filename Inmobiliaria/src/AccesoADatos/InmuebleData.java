
package AccesoADatos;

import Entidades.Inmueble;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InmuebleData {
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public InmuebleData(){
        
    }
    
    public void GuardarInmueble(Inmueble inmueble) throws SQLException{
        String sql = "INSERT INTO inmueble (superficie, cantAmbientes, canBaños,"
                + " fechaConstruccion, garage, estadoInmueble, direccion, zona,"
                + " condicionesContrato ) VALUES (?,?,?,?,?,?,?,?,?)";
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
    
}

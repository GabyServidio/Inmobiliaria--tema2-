package AccesoADatos;

import Entidades.Inspeccion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class InspeccionData {

    private String SQL = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public InspeccionData() {
    }

    public void crearInspeccion(Inspeccion nueva) {
        SQL = "INSERT INTO inspecciones (idInspector, idInmueble, fecha, descripcion) VALUES (?,?,?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nueva.getIdInspector());
            ps.setInt(2, nueva.getIdInmueble());
            ps.setDate(3, Date.valueOf(nueva.getFecha()));
            ps.setString(4, nueva.getDescripcion());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                nueva.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "inspeccion Creada Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "error al crear la inspeccion");

            }

        } catch (SQLException ex) {
            Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void editarInspeccion(Inspeccion editada) {
        SQL = "UPDATE inspecciones SET idInspector = ?, idInmueble = ?, fecha = ?, descripcion = ? WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, editada.getIdInspector());
            ps.setInt(2, editada.getIdInmueble());
            ps.setDate(3, Date.valueOf(editada.getFecha()));
            ps.setString(4, editada.getDescripcion());
            ps.setInt(5, editada.getId());
            int correcto = ps.executeUpdate();

            if (correcto > -1) {

                JOptionPane.showMessageDialog(null, "inspección Editada Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "error al editar la inspección");

            }
        } catch (SQLException ex) {
            Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Inspeccion buscarInspeccion(int id) {
        Inspeccion hallada = null;
        SQL = "SELECT * FROM inspecciones WHERE id = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Inspeccion encontrada = new Inspeccion(); 
                Date fecha = rs.getDate("fecha");
                encontrada.setId(rs.getInt("id"));
                encontrada.setIdInspector(rs.getInt("idInspector"));
                encontrada.setIdInmueble(rs.getInt("idInmueble"));
                encontrada.setFecha(fecha.toLocalDate());
                encontrada.setDescripcion(rs.getString("descripcion"));
                hallada=encontrada;
               
            } else {
                JOptionPane.showMessageDialog(null, "no se encontró la Inspección");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hallada;
    }

    public List<Inspeccion> listarInspeciones() {
    
        List<Inspeccion> encontrados = new ArrayList<>();
        SQL = "SELECT * FROM inspecciones ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Inspeccion encontrada = new Inspeccion(); 
                Date fecha = rs.getDate("fecha");
                encontrada.setId(rs.getInt("id"));
                encontrada.setIdInspector(rs.getInt("idInspector"));
                encontrada.setIdInmueble(rs.getInt("idInmueble"));
                encontrada.setFecha(fecha.toLocalDate());
                encontrada.setDescripcion(rs.getString("descripcion"));
                encontrados.add(encontrada);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(InspeccionData.class.getName()).log(Level.SEVERE, null, ex);
            }
           

        }
         return encontrados;
    }

}

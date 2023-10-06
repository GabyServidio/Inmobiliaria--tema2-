package AccesoADatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static String URL;
    private static String USER;
    private static String PASS;

    public static Connection getConexion() {
        Connection conexion = null;
        recuperar();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION CON EL SERVIDOR");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DRIVER");
        }
        return conexion;
    }

    public static void recuperar() {
        try {
            FileReader direccion = new FileReader("src/AccesoADatos/conexion.env");
            BufferedReader lector = new BufferedReader(direccion);
            Properties propiedades = new Properties();
            propiedades.load(lector);
            URL = propiedades.getProperty("DB_URL");
            USER = propiedades.getProperty("DB_USER");
            PASS = propiedades.getProperty("DB_PASS");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }

    }
}

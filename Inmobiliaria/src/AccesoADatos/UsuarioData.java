/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Usuario;
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
public class UsuarioData {

    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public UsuarioData() {
    }

    public void RegistrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO `usuarios`(`idPersona`, `nombre`, `contrasenia`, `tipo`, `estado`)"
                + " VALUES (?, ?, ?, ?, ?)";

        try {
            ps = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, usuario.getIdPersona());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getContraseña());
            ps.setString(4, usuario.getTipo());
            ps.setBoolean(5, usuario.isEstado());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                usuario.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito.");
            }

        } catch (SQLException ex) {

            if (ex instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Esta persona ya tiene un usuario registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios" + ex.getMessage());
            }
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void actualizarUsuario(Usuario usuario) {

        String sql = "UPDATE `usuarios` SET `nombre`= ? ,`contrasenia`= ? , `tipo`= ? ,`estado`= ?  WHERE id = ?";

        ps = null;
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getTipo());
            ps.setBoolean(4, usuario.isEstado());
            ps.setInt(5, usuario.getId());
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Usuario Modificado Correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se modifico el usuario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    public List<Usuario> listarUsuariosActivos() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            String sql = "SELECT * FROM usuarios WHERE estado = 1 ";
            ps = Conexion.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setIdPersona(rs.getInt("idPersona"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setEstado(rs.getBoolean("estado"));
                usuarios.add(usuario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarios;
    }

    public List<Usuario> listarUsuariosDeBaja() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            String sql = "SELECT * FROM usuarios WHERE estado = 0 ";
            ps = Conexion.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setIdPersona(rs.getInt("idPersona"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setEstado(rs.getBoolean("estado"));
                usuarios.add(usuario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuarios " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarios;
    }

    public void actualizarContraseña(Usuario usuario) {

        String sql = "UPDATE usuarios SET contraseña = ? WHERE id = ?";

        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, usuario.getContraseña());
            ps.setInt(2, usuario.getId());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contraseña modificada exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la contraseña");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void bajaUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET estado = 0 WHERE id = ?";

        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Usuario dado de baja exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja al usuario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Usuario buscarUsuarioxIdPersona(int idPersona) {
        Usuario encontrado = null;
        String sql = "SELECT * FROM usuarios WHERE idPersona= ?";

        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, idPersona);
            rs = ps.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setIdPersona(rs.getInt("idPersona"));
                usuario.setUsuario(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contrasenia"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setEstado(rs.getBoolean("estado"));
                encontrado = usuario;
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return encontrado;
    }

    public Usuario buscarUsuario(String nombre) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuarios WHERE nombre = ?";
        ps = null;
        try {
            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setIdPersona(rs.getInt("idPersona"));
                usuario.setUsuario(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contrasenia"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Esta persona no es usuario o no existe");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios " + ex.getMessage());
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return usuario;
    }
    
    
}


package Entidades;

public class Vendedor {
     private int id;
    private int idPersona;
    private String usuario;
    private String contraseña;

    public Vendedor(int id, int idPersona, String usuario, String contraseña) {
        this.id = id;
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Vendedor(int idPersona, String usuario, String contraseña) {
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Vendedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
}
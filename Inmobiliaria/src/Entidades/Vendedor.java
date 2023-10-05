
package Entidades;

public class Vendedor {
    private int id;
    private int idPersona;
    private String usuario;
    private String contraseña;
    private boolean estado;

    public Vendedor(int id, int idPersona, String usuario, String contraseña, boolean estado) {
        this.id = id;
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public Vendedor(int idPersona, String usuario, String contraseña, boolean estado) {
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   

    
}
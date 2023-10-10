
package Entidades;

public class Usuario {
    private int id;
    private int idPersona;
    private String usuario;
    private String contraseña;
    private String tipo;
    private boolean estado;

    public Usuario(int id, int idPersona, String usuario, String contraseña, String tipo, boolean estado) {
        this.id = id;
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Usuario(int idPersona, String usuario, String contraseña, String tipo, boolean estado) {
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.estado = estado;
    }

       public Usuario() {
           
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", idPersona=" + idPersona + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
       
    }

   
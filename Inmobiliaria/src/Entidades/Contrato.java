
package Entidades;

import java.time.LocalDate;

/**
 * @author fernando
 */
public class Contrato {
    private int id;
    private int idInmueble;
    private int idInquilino;
    private int idGarante;
    private int idVendedor;
    private LocalDate fecha;
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;
    private int precio;
    private String estado;
    private String Descripcion;

    public Contrato(int id, int idInmueble, int idInquilino, int idGarante, int idVendedor, LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFinalizacion, int precio, String estado, String Descripcion) {
        this.id = id;
        this.idInmueble = idInmueble;
        this.idInquilino = idInquilino;
        this.idGarante = idGarante;
        this.idVendedor = idVendedor;
        this.fecha = fecha;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.precio = precio;
        this.estado = estado;
        this.Descripcion = Descripcion;
    }

    public Contrato(int idInmueble, int idInquilino, int idGarante, int idVendedor, LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFinalizacion, int precio, String estado, String Descripcion) {
        this.idInmueble = idInmueble;
        this.idInquilino = idInquilino;
        this.idGarante = idGarante;
        this.idVendedor = idVendedor;
        this.fecha = fecha;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.precio = precio;
        this.estado = estado;
        this.Descripcion = Descripcion;
    }

   
    public Contrato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public int getIdGarante() {
        return idGarante;
    }

    public void setIdGarante(int idGarante) {
        this.idGarante = idGarante;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
            
    
    
}

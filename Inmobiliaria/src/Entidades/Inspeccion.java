/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Inspeccion {
    private int id;
    private int idInspector;
    private int idInmueble;
    private LocalDate fecha;
    private String descripcion;

    public Inspeccion(int id, int idInspector, int idInmueble, LocalDate fecha, String descripcion) {
        this.id = id;
        this.idInspector = idInspector;
        this.idInmueble = idInmueble;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Inspeccion(int idInspector, int idInmueble, LocalDate fecha, String descripcion) {
        this.idInspector = idInspector;
        this.idInmueble = idInmueble;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Inspeccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Inspeccion{" + "id=" + id + ", idInspector=" + idInspector + ", idInmueble=" + idInmueble + ", fecha=" + fecha + ", descripcion=" + descripcion + '}';
    }
    
    
}

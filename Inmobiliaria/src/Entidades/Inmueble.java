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
public class Inmueble {
    private int id;
    private int idPropietario;
    private int superficie;
    private int cantAmbientes;
    private int canBaños;
    private LocalDate fechaConstruccion;
    private int garage;
    private String estadoInmueble;
    private String direccion;
    private String zona;
    private String tipo;
    private String condicionesContrato; 

    public Inmueble(int id, int idPropietario, int superficie, int cantAmbientes, int canBaños, LocalDate fechaConstruccion, int garage, String estadoInmueble, String direccion, String zona, String tipo, String condicionesContrato) {
        this.id = id;
        this.idPropietario = idPropietario;
        this.superficie = superficie;
        this.cantAmbientes = cantAmbientes;
        this.canBaños = canBaños;
        this.fechaConstruccion = fechaConstruccion;
        this.garage = garage;
        this.estadoInmueble = estadoInmueble;
        this.direccion = direccion;
        this.zona = zona;
        this.tipo = tipo;
        this.condicionesContrato = condicionesContrato;
    }

    public Inmueble(int idPropietario, int superficie, int cantAmbientes, int canBaños, LocalDate fechaConstruccion, int garage, String estadoInmueble, String direccion, String zona, String tipo, String condicionesContrato) {
        this.idPropietario = idPropietario;
        this.superficie = superficie;
        this.cantAmbientes = cantAmbientes;
        this.canBaños = canBaños;
        this.fechaConstruccion = fechaConstruccion;
        this.garage = garage;
        this.estadoInmueble = estadoInmueble;
        this.direccion = direccion;
        this.zona = zona;
        this.tipo = tipo;
        this.condicionesContrato = condicionesContrato;
    }

    public Inmueble() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public int getCanBaños() {
        return canBaños;
    }

    public void setCanBaños(int canBaños) {
        this.canBaños = canBaños;
    }

    public LocalDate getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(LocalDate fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    public String getEstadoInmueble() {
        return estadoInmueble;
    }

    public void setEstadoInmueble(String estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCondicionesContrato() {
        return condicionesContrato;
    }

    public void setCondicionesContrato(String condicionesContrato) {
        this.condicionesContrato = condicionesContrato;
    }
    
    
    
}

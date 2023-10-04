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
public class Multa {
    private int id;
    private int idInspeccion;
    private int idInquilino;
    private LocalDate fechaConfeccion;
    private LocalDate fechaPago;
    private Double monto;

    public Multa(int id, int idInspeccion, int idInquilino, LocalDate fechaConfeccion, LocalDate fechaPago, Double monto) {
        this.id = id;
        this.idInspeccion = idInspeccion;
        this.idInquilino = idInquilino;
        this.fechaConfeccion = fechaConfeccion;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public Multa(int idInspeccion, int idInquilino, LocalDate fechaConfeccion, LocalDate fechaPago, Double monto) {
        this.idInspeccion = idInspeccion;
        this.idInquilino = idInquilino;
        this.fechaConfeccion = fechaConfeccion;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public Multa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInspeccion() {
        return idInspeccion;
    }

    public void setIdInspeccion(int idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public LocalDate getFechaConfeccion() {
        return fechaConfeccion;
    }

    public void setFechaConfeccion(LocalDate fechaConfeccion) {
        this.fechaConfeccion = fechaConfeccion;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
    
}

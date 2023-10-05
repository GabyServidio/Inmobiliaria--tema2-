/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import AccesoADatos.Conexion;
import AccesoADatos.InmuebleData;
import Entidades.Inmueble;
import static java.awt.PageAttributes.MediaType.A;
import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Conexion.getConexion();
    
    InmuebleData nuevo = new InmuebleData();
    Entidades nue = new Entidades.Inmueble(5, 120, 5, , 2, activo, San Martin 789, A, Casa, condicionesContrato);
    }
    
}

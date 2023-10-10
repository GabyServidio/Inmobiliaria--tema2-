/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import AccesoADatos.*;
import Entidades.*;
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
        MultaData nuevo= new MultaData();
        Multa nue = new Multa(15, 10, LocalDate.now(), LocalDate.now(), 10000.00);
        
        nuevo.GuardarMulta(nue);
    }
    
}

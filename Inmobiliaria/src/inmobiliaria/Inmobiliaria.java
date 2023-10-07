/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import AccesoADatos.*;
import Entidades.*;

/**
 *
 * @author USUARIO
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  ContratoData contratoData = new ContratoData();

        for (Contrato listarContrato : contratoData.listarContratos()) {
            System.out.println(listarContrato.toString());
        }  
    }
    
}

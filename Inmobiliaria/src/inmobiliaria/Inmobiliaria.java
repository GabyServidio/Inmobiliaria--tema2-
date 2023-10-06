/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import AccesoADatos.Conexion;
import AccesoADatos.InmuebleData;
import Entidades.Inmueble;
import static java.awt.PageAttributes.MediaType.A;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InmuebleData nuevo = new InmuebleData();
        //Inmueble nue = new Inmueble(2, 122, 1, 1, LocalDate.now(), 0, "DISPONIBLE", "San martin 25", "CENTRO", "LOCAL", "Prueba");
      
            //nuevo.GuardarInmueble(nue);
        
//        nue.setEstadoInmueble("NODISPONIBLE");
//        nuevo.modificarInmueble(nue);
//        nuevo.eliminarInmueble(nue.getId());

          //System.out.println(nuevo.listarInmueble());
          
          nuevo.eliminarInmueble(5);

        
    }
    
}

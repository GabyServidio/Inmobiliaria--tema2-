package inmobiliaria;

import AccesoADatos.*;
import Entidades.*;
import java.time.LocalDate;

public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     InspeccionData insp = new InspeccionData();
     //Inspeccion nueva = new Inspeccion(1, 2, LocalDate.now(), "inspecion de prueba");
     
        for (Inspeccion inspe : insp.listarInspeciones()) {
            System.out.println(inspe.getDescripcion());
        }
     
    
    }
    
}

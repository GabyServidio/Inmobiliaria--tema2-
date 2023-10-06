
package inmobiliaria;

import AccesoADatos.*;
import Entidades.*;
import java.time.LocalDate;
/**
 *
 * @author USUARIO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contrato C1 = new Contrato(0, 0, 0, 0,
                LocalDate.now(), LocalDate.now(), LocalDate.now(), 
                0, "VIGENTE", "TEST");
        ContratoData contratoData = new ContratoData();
        contratoData.crearContrato(C1);
        C1.setDescripcion("probando la edicion");
        contratoData.editarContrato(C1);
        contratoData.elimminarContrato(C1);
    }
    
}

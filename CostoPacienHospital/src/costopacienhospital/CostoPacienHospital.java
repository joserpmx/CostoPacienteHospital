/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package costopacienhospital;

/**
 *
 * @author Jose
 */
import java.util.Scanner;
public class CostoPacienHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio
        //Comentario nuevo
        //Comentario 2
        Scanner lector=new Scanner(System.in);
        int TipoEnfermedad, dias;
        String sexo;
        float CostoTotal = 0;
        System.out.print("Dame el tipo de enfermedad (1-3): ");
        TipoEnfermedad=lector.nextInt();
        System.out.print("Dame los dias de Hospitalizacion: ");
        dias=lector.nextInt();
        System.out.print("Dame el sexo del paciente: ");
        sexo=lector.next().toString();
        
        switch (TipoEnfermedad)
        {
            case 1: if ("F".equals(sexo)) // if (sexo=="F")
                    {
                     CostoTotal=dias*220;
                    }
                    else
                    {
                     CostoTotal=dias * 200;
                    }
                    break;
            case 2: CostoTotal=dias * 350;
                    break;
            case 3: if ("M".equals(sexo)) // if (sexo=="M")
                    {
                     CostoTotal=dias*441;
                    }
                    else
                    {
                     CostoTotal=dias * 420;
                    }
                    break;
            default:System.out.print("Error no existe ese tipo de enfermedad");
                    break;
                    
        }  //fin switch 
        System.out.print("El costo por el paciente fue de: "+ CostoTotal);
    }
}

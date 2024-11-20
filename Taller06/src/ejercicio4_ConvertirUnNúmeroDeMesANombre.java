import java.util.Scanner;

/***
 * Convertir un número de mes a nombre. Dado un número del 1 al 12, que
 * representa un mes del año, muestra el nombre del mes correspondiente. Por
 * ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe
 * mostrar "Febrero", y así sucesivamente.
 * @author Luis
 */

public class ejercicio4_ConvertirUnNúmeroDeMesANombre {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numeroMes;
        System.out.print("Ingrese un número del 1 al 12 para que se refleje el nombre del mes: ");
        numeroMes = tcl.nextInt();
        String nombreMes;
        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Error, Número inválido";
                break;
        }
        System.out.println(nombreMes);
    }
}
/***
 * run: Ingrese un número del 1 al 12 para que se refleje el nombre del mes: 6
 * Junio 
 * BUILD SUCCESSFUL (total time: 23 seconds)
 */

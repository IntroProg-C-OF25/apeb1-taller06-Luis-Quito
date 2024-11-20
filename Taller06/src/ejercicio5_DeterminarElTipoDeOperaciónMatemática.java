import java.util.Scanner;

/***
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que 
 * representa una operación matemática básica (suma, resta, multiplicación, 
 * división), muestra el nombre de la operación correspondiente. Por ejemplo, 
 * si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar 
 * "Resta", y así sucesivamente.
 * @author Luis
 */

public class ejercicio5_DeterminarElTipoDeOperaciónMatemática {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número del 1 al 4: ");
        numero = tcl.nextInt();
        String nombreOperacion;
        switch (numero) {
            case 1:
                nombreOperacion = "Suma";
                break;
            case 2:
                nombreOperacion = "Resta";
                break;
            case 3:
                nombreOperacion = "Multiplicación";
                break;
            case 4:
                nombreOperacion = "División";
                break;
            default:
                nombreOperacion = "Error, Número inválido";
                break;
        }
        System.out.println(nombreOperacion);
    }
}
/***
 * run:
 * Ingrese un número del 1 al 4: 4
 * División
 * BUILD SUCCESSFUL (total time: 13 seconds)
 */ 
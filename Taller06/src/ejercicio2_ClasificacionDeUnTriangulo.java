import java.util.Scanner;

/***
 * Clasificación de un triángulo Dado tres valores que representan las
 * longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:
 * Si todos los lados son iguales, mostrar "Triángulo equilátero". Si dos lados
 * son iguales, mostrar "Triángulo isósceles". Si todos los lados son
 * diferentes, mostrar "Triángulo escaleno". Si la suma de dos lados no es mayor
 * que el tercer lado, mostrar "No es un triángulo".
 *
 * @author Luis
 */

public class ejercicio2_ClasificacionDeUnTriangulo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.print("Ingrese los valores del primer, segundo y tercer lado del triángulo: ");
        lado1 = tcl.nextDouble();
        lado2 = tcl.nextDouble();
        lado3 = tcl.nextDouble();
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("No es un triángulo");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un Triángulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es un Triángulo isósceles");
        } else {
            System.out.println("Es un Triángulo escaleno");
        }
    }
}
/***
 * run: 
 * Ingrese los valores del primer, segundo y tercer lado del triángulo: 12, 12, 15 
 * Es un Triángulo isósceles. 
 * BUILD SUCCESSFUL (total time: 20 seconds)
 */

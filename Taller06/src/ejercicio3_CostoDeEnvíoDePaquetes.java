import java.util.Scanner;

/***
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas
 * según la región y el peso del paquete. Si el peso es menor de 5 kg y la
 * región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de
 * $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 * @author Luis
 */

public class ejercicio3_CostoDeEnvíoDePaquetes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso, costo;
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = tcl.nextDouble();
        System.out.print("Ingrese la región (local/nacional/otra): ");
        String region = tcl.next();
        costo = 15;
        if (peso < 5 && region.equals("local")) {
            costo = 5.0;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costo = 10.0;
        } else {
            costo = 15.0;
        }
        System.out.println("El costo de envío es: " + costo);
    }
}
/***
 * run: 
 * Ingrese el peso del paquete en kg: 19 
 * Ingrese la región (local/nacional/otra): nacional 
 * El costo de envío es: 15.0 
 * BUILD SUCCESSFUL (total time: 53 seconds)
 */

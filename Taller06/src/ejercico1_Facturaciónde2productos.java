import java.util.Scanner;

/***
 * Facturación de 2 productos: La empresa Amazon.com le contrata como
 * desarrollador de Sistemas Informáticos para programar su sistema de compras
 * online, el cual calcule el precio total de la compra para un cliente. Para
 * ello, se necesita utilizar estructuras secuenciales y de selección (if
 * simple, doble y/o anidadas), sin aplicar ciclos repetitivos. Requisitos: La
 * empresa inicialmente venderá solo 2 tipos de productos distintos, a costos
 * variantes. Al costo total de la factura, se debe incluir los gastos por
 * concepto de transporte/envío del paquete, del cual no se aplican ningún tipo
 * de descuentos o impuestos dada la excepción descrita en el punto 3.b. El
 * objetivo es presentar al usuario los detalles de su compra: costos,
 * impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el
 * subtotal de la compra (sin descuentos o gastos de envío), supera los $1000,
 * se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es
 * como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será
 * gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de
 * agregar cualquier tipo de descuesto o promoción.
 *
 * @author Luis
 */

public class ejercico1_Facturaciónde2productos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoProd1, costoProd2, costoEnvio, iva, descuento, subTotal, costoFinal = 0;
        System.out.print("Dame tres costos (2 del PROD + 1 ENVIO): ");
        costoProd1 = tcl.nextDouble();
        costoProd2 = tcl.nextDouble();
        costoEnvio = tcl.nextDouble();
        iva = (costoProd1 + costoProd2) * 0.10;
        subTotal = iva + (costoProd1 + costoProd2);
        descuento = subTotal * 0.05;
        if (subTotal < 1000) {
            descuento = 0;
            costoFinal = subTotal + costoEnvio;
        } else if (subTotal > 1000) {
            descuento = subTotal * 0.20;
            costoFinal = subTotal - descuento + costoEnvio;
        } else if (subTotal > 5000) {
            costoEnvio = 0;
            costoFinal = subTotal - descuento + costoEnvio;
        }
        System.out.println("El costo del primer producto: " + costoProd1);
        System.out.println("El costo del segundo producto: " + costoProd2);
        System.out.println("El IVA es: " + iva);
        System.out.println("El descuento que se aplica es: " + descuento);
        System.out.println("El costo final es: " + costoFinal);
    }
}

/***
 * run:
 * Dame tres costos (2 del PROD + 1 ENVIO): 545, 670, 120
 * El costo del primer producto: 545.0
 * El costo del segundo producto: 670.0
 * El IVA es: 121.5
 * El descuento que se aplica es: 267.3
 * El costo final es: 1189.2
 * BUILD SUCCESSFUL (total time: 15 seconds)
 */

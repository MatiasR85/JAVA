
package impuesto8;

import java.util.Scanner;

public class Impuesto8 {
     
    public static double calcularPrecioFinal(double preciobase, double impuesto, double descuento){
        double preciofinal = preciobase + (preciobase * impuesto ) - (preciobase * descuento);
        return preciofinal; 
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ingrese el precio base : ");
        double preciobase = input.nextDouble();
        
        System.out.println("ingrese el impuesto en porcentaje: (Ejemplo 10 para 10% ");
        double impuesto = input.nextDouble() / 100;
        
        System.out.println("ingrese el descuento en porcentaje: (Ejemplo 5 para 5% ");
        double descuento = input.nextDouble() / 100;
        
        double preciofinal = calcularPrecioFinal(preciobase, impuesto, descuento);
        
        System.out.println(" el precio final del producto es :" + preciofinal);
        
    }
     
}

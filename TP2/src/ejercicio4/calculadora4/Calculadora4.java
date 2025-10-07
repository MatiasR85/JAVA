
package calculadora4;

import java.util.Scanner;


public class Calculadora4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     double Precioinicial,PrecioFinal ; 
     double Desc = 0; 
        System.out.print("Ingrese el Precio de su compra:");
     Precioinicial = input.nextDouble();
     
     
        System.out.print("Ingrese la categoria del producto: (A, B, C )");
       String categoria = input.next().toUpperCase();
       
       if(categoria.equals("A")){
           Desc = 0.10;
       } else if (categoria.equals("B")){ 
           Desc = 0.15;
       } else if (categoria.equals("C")){
           Desc = 0.20;
       } else {
           System.out.println(" descuento ingresado no es valido ");
       }
    
       PrecioFinal = Precioinicial - (Precioinicial * Desc);
        
        System.out.println(" precio inicial " + Precioinicial);
        System.out.println(" Categoria " + categoria);
        System.out.println(" Descuento " + (Desc * 100) + "%");
        System.out.println(" Precio Final " + PrecioFinal);
        
        
    }
    
}

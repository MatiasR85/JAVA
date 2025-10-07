
package funcion9;

import java.util.Scanner;


public class Funcion9 {

 
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
         System.out.print(" ingrese el precio: ");
        double precio = input.nextDouble();
        
         System.out.print(" ingrese el peso del paquete: "); 
       double peso = input.nextDouble();
          input.nextLine();
        
           System.out.print(" ingrese zona de envio del paquete: ");
        String zona = input.nextLine();
         
        
        
        
        double costo= CalcularCostoenvio(peso, zona);
       
        double total = Calculartotalcompra(precio, peso, zona);
        
        System.out.println("el costo del envio es: " + costo);
        System.out.println("el total a pagar es: " + total);
        
    }
   public static double CalcularCostoenvio(double peso, String zona){
       
       if (zona.equalsIgnoreCase("Nacional")) {
           return peso * 5;
       }else{
           return peso * 10;
       }
      
      
       
    
       
   } 
   public static double Calculartotalcompra(double precioproducto ,double peso,String zona){
       
      double costoenvio = CalcularCostoenvio(peso, zona);
      return precioproducto + costoenvio;
      
     
   }
     
}

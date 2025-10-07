
package stock10;

import java.util.Scanner;


public class Stock10 {

   public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
      int  nuevostock = stockActual - cantidadVendida + cantidadRecibida;
         return nuevostock;
    } 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        
        System.out.println(" ingrese el stock actual del producto : ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println(" ingrese la cantidad vendida : ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println(" ingrese la cantidad recibida : ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
         
        int nuevostock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println(" El nuevo stock del producto es :" +nuevostock);
    }
    
}

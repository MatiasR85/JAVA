
package desc11;

import java.util.Scanner;


public class Desc11 {

    static double Descuento = 0.10;
    
    public static double CalcularDescuentoEspecial(double precio){
      
      return precio * Descuento;
    }
       public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
           System.out.println(" ingrese el precio del producto: ");
           double precio = input.nextDouble();
           
           double descuento = CalcularDescuentoEspecial(precio);
           double preciofinal = precio - descuento; 
           
           System.out.println(" Precio Original; " + precio);
           System.out.println(" Descuento aplicado " +descuento);
           System.out.println(" Precio final: " +preciofinal);
        
        
        
    }
    
}

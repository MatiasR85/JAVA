
package añobisiesto;

import java.util.Scanner;



public class Añobisiesto {

   
     
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int anio;
        System.out.print("ingrese el anio : ");
            anio = Integer.parseInt(input.nextLine());
            
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
        System.out.println(anio+    " Es un anio bisiesto ");
        } else{
           System.out.println(anio+ " no es un anio bisiesto ");
            }
         
         
           
    }
    
}

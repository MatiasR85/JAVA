
package Ejercicio3;

import java.util.Scanner;




public class Edad_Java {

   
  
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     String Nombre;
     int Edad;
     
        System.out.print("Ingrese Su Nombre: ");
        Nombre = input.nextLine();
     
        System.out.print("Ingrese su edad: ");
        Edad = Integer.parseInt(input.nextLine());
     
        
    System.out.println(" Mi nombre es " +Nombre + ";" + " Tengo " +Edad + " Anios " );
        
    
            
    
    }
    
}

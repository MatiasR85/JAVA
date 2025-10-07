
package edad;

import java.util.Scanner;


public class Edad {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      int edad; 
        System.out.print( "Ingrese su edad: ");
       edad = Integer.parseInt(input.nextLine());
        
       if (edad <= 12 ){
           System.out.println("es nino/a ");
       } else if (edad <= 17 ){
           System.out.println( " Es un adolescente ");
       } else if (edad >= 18 && edad <= 59 ){
           System.out.println(" es un adulto/a ");
       } else if (edad >= 60){
           System.out.println(" es una persona mayor ");
       }
       
      
      
        
    }
    
}

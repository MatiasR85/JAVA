
package validacion7;

import java.util.Scanner;


public class Validacion7 {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     
     int Nota;
       
           
     do{
         System.out.println(" Ingrese una nota (0 - 10) : ");
           Nota = Integer.parseInt(input.nextLine());
           
           if (Nota <= 0){
               System.out.println(" Nota invalida. Ingrese una nota entre 0 - 10 ");
           }else if ( Nota > 10){
               System.out.println(" Nota invalida. Ingrese una nota entre 0 - 10 ");
           }
        }while(Nota < 0 || Nota > 10);
     
        System.out.println(" Nota guardada Correctamente ");
               
    }       
}             
        
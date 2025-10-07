package suma;

import java.util.Scanner;


public class Suma {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
     int n1,n2,n3;
     
        System.out.print(" Ingrese el primer numero: ");
        n1 = Integer.parseInt(input.nextLine());
         System.out.print(" Ingrese el segundo numero: ");
        n2 = Integer.parseInt(input.nextLine());
         System.out.print(" Ingrese el tercer Numero: " );
        n3 = Integer.parseInt(input.nextLine());
       
      if ( n1 > n2 && n1 > n3){ 
          System.out.println(n1 + " es el numero mayor ");
      } else if ( n2 > n1 && n2 > n3){
          System.out.println(n2 + " es el numero mayor " );
      } else if ( n3 > n1 && n3 > n2){
          System.out.println(n3 + " es el numero mayor ");
      }
      
      
        
    }  
     
    }
    


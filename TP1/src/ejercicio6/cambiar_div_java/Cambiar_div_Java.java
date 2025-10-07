
package cambiar_div_java;

import java.util.Scanner;



public class Cambiar_div_Java {

    
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int N1, N2;
    double Division;
    
    System.out.print("Ingrese el primer numero: ");
    N1 = Integer.parseInt(input.nextLine());
        
    System.out.print("Ingrese el segundo numero: ");
    N2 = Integer.parseInt(input.nextLine());
        
    Division = ((double) N1 / N2); 
        System.out.println(Division);
    
    
    }
    
}


package operaciones_aritmeticas_java;

import java.util.Scanner;


public class Operaciones_Aritmeticas_java {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
    int N1, N2, Suma, Resta, Division, Multiplicacion;
        System.out.print("Ingrese el primer numero entero: ");
        N1 = Integer.parseInt(input.nextLine());
      
        System.out.print("Ingrese el segundo numero entero: ");
        N2 = Integer.parseInt(input.nextLine());
        
        Suma = N1 + N2;
        System.out.println(" La suma es: " +Suma);
        
        Resta = N1 - N2;
        System.out.println(" La Resta es: "  +Resta);
        
        Multiplicacion = N1 * N2;
        System.out.println(" La Multiplicacion es: "  +Multiplicacion);
        
        Division = N1 / N2;
        System.out.println(" La Division es: " +Division);
                
    }
    
}

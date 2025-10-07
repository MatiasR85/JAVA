
package suma5;

import java.util.Scanner;


public class Suma5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        System.out.print(" ingrese un numero (0 para terminar): ");
        
        numero = Integer.parseInt(input.nextLine());
        
        while(numero != 0){
            if (numero % 2 == 0){
                suma += numero;
            }
            System.out.print(" ingrese un numero(0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
        }
        System.out.println(" la suma de los numeros pares es: " + suma);
    }
    
}

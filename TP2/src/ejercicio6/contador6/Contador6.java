
package contador6;

import java.util.Scanner;


public class Contador6 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
      int Positivos = 0;
      int Negativos = 0;
      int Ceros = 0;
      
        System.out.println(" ingrese 10 numeros: ");
        
        for (int i = 1; i < 11; i++) {
            int numero = input.nextInt();
            
        if (numero > 0 ){
            Positivos++;
        } else if (numero < 0) {
            Negativos++;
        } else {
            Ceros++;
       
        }
    }
    
        System.out.println("\nResultados: ");
        System.out.println(Positivos + " Positivos ");
        System.out.println(Negativos + " Negativos");
        System.out.println(Ceros + " Ceros ");
      
}

}
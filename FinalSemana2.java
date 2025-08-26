
package finalsemana2;

import java.util.Scanner;


public class FinalSemana2 {

    
    public static void main(String[] args) {
    // Ejercicio1 
    
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
        
        
        
        
   /* EJERCICIO 2 
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
      
      */
        
   /* EJERICICIO 3
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
     
   */
   
    
     

    /* Ejercicio 4 
   package calculadora4;

import java.util.Scanner;


public class Calculadora4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     double Precioinicial,PrecioFinal ; 
     double Desc = 0; 
        System.out.print("Ingrese el Precio de su compra:");
     Precioinicial = input.nextDouble();
     
     
        System.out.print("Ingrese la categoria del producto: (A, B, C )");
       String categoria = input.next().toUpperCase();
       
       if(categoria.equals("A")){
           Desc = 0.10;
       } else if (categoria.equals("B")){ 
           Desc = 0.15;
       } else if (categoria.equals("C")){
           Desc = 0.20;
       } else {
           System.out.println(" descuento ingresado no es valido ");
       }
    
       PrecioFinal = Precioinicial - (Precioinicial * Desc);
        
        System.out.println(" precio inicial " + Precioinicial);
        System.out.println(" Categoria " + categoria);
        System.out.println(" Descuento " + (Desc * 100) + "%");
        System.out.println(" Precio Final " + PrecioFinal);
        
        
    }
    
}

   
   */
    
   /* Ejercicio 5 
    
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
    

    
    */
   
 /* Ejercico 6
    
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
    */  
    
 /* Ejercicio 7 
    
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
        
    */  
    
 /* Ejercicio 8
    
    package impuesto8;

import java.util.Scanner;

public class Impuesto8 {
     
    public static double calcularPrecioFinal(double preciobase, double impuesto, double descuento){
        double preciofinal = preciobase + (preciobase * impuesto ) - (preciobase * descuento);
        return preciofinal; 
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ingrese el precio base : ");
        double preciobase = input.nextDouble();
        
        System.out.println("ingrese el impuesto en porcentaje: (Ejemplo 10 para 10% ");
        double impuesto = input.nextDouble() / 100;
        
        System.out.println("ingrese el descuento en porcentaje: (Ejemplo 5 para 5% ");
        double descuento = input.nextDouble() / 100;
        
        double preciofinal = calcularPrecioFinal(preciobase, impuesto, descuento);
        
        System.out.println(" el precio final del producto es :" + preciofinal);
        
    }
     
}

    */
    
 /* Ejercicio 9
    
    
package funcion9;

import java.util.Scanner;


public class Funcion9 {

 
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
         System.out.print(" ingrese el precio: ");
        double precio = input.nextDouble();
        
         System.out.print(" ingrese el peso del paquete: "); 
       double peso = input.nextDouble();
          input.nextLine();
        
           System.out.print(" ingrese zona de envio del paquete: ");
        String zona = input.nextLine();
         
        
        
        
        double costo= CalcularCostoenvio(peso, zona);
       
        double total = Calculartotalcompra(precio, peso, zona);
        
        System.out.println("el costo del envio es: " + costo);
        System.out.println("el total a pagar es: " + total);
        
    }
   public static double CalcularCostoenvio(double peso, String zona){
       
       if (zona.equalsIgnoreCase("Nacional")) {
           return peso * 5;
       }else{
           return peso * 10;
       }
      
      
       
    
       
   } 
   public static double Calculartotalcompra(double precioproducto ,double peso,String zona){
       
      double costoenvio = CalcularCostoenvio(peso, zona);
      return precioproducto + costoenvio;
      
     
   }
     
}

    
    */
    
 /* Ejercicio 10
    package stock10;

import java.util.Scanner;


public class Stock10 {

   public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
      int  nuevostock = stockActual - cantidadVendida + cantidadRecibida;
         return nuevostock;
    } 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        
        System.out.println(" ingrese el stock actual del producto : ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println(" ingrese la cantidad vendida : ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println(" ingrese la cantidad recibida : ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
         
        int nuevostock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println(" El nuevo stock del producto es :" +nuevostock);
    }
    
}

    */
    
  /* Ejercicio 11
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

    */
   /* Ejercicio12
    
    
    package precios12;


public class Precios12 {

   
    public static void main(String[] args) {
    
      
     double [] precio = {199.5,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios Originales ");
        for (int i = 0; i < precio.length; i++) 
            System.out.println("precio "  +precio[i]);
           
            
         precio[2] = 250.2;
                 
            System.out.println("Precidos modificados");
            for (int j = 0; j < precio.length; j++) {
                System.out.println("Precio " +precio[j]);
                
            }
         }  
         
        }
        
    */
    
  /* Ejercicio13
    
    package recur13;


public class Recur13 {

    
    public static void main(String[] args) {
       double [] precio = {199.99,295.5,149.75,399.0,89.99};
        System.out.println(" LISTA ORIGINAL ");
      Mostrararrays(precio, 0);
      
      
        System.out.println(" LISTA MODIFICIADA ");
        precio[2] = 256.2;
        
     ModificarArrays(precio, 0);
    }

     public static void Mostrararrays (double[]precio, int indice){
         if (indice != precio.length){
             System.out.println(precio[indice]);
             Mostrararrays(precio, indice+1);
         }  
        
        
     }
    public static void ModificarArrays (double []precio, int indice){
         if (indice != precio.length){
             System.out.println(precio[indice]);
             Mostrararrays(precio, indice+1);
         }
    }     

}    

     
    
            
    
   

    */  
}    




        
      
    


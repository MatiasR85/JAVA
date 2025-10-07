
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
        
            
    

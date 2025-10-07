
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

     
    
            
    
   

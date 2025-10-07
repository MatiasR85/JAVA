
package principal2;


public class Principal2 {

  
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario(" Matias", 44489835);
   
        Bateria bateria1 = new Bateria("Bosch", "45%");
   
        Celular celular = new Celular(" Matias22@gmail.com "," Apple", " 16PRO", bateria1, usuario1);
   
        
      
            System.out.println(celular);
            
            
    
    }
   
   
    
}

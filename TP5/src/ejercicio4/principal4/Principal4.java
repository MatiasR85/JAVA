
package principal4;


public class Principal4 {

    
    public static void main(String[] args) {
       
       Banco banco = new Banco("BBVA", "20-4784638-6");
       Cliente cliente = new Cliente(" Matias ", 44489835);
       TarjetaC Tarjeta = new TarjetaC(108545215, "20/06/2027", cliente, banco);
       
       
         System.out.println(Tarjeta);
        
       
        
        
         Banco banco2 = new Banco("MACRO", "14-14851883-4");
         Cliente cliente2 = new Cliente(" Hernan", 45782189);
         TarjetaC Tarjeta2 = new TarjetaC(108545215, "20/06/2027", cliente2, banco2);
         System.out.println(Tarjeta2);
      
       
        
    }
    
        
    
}

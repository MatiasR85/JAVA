
package principal11;


public class Principal11 {

  
    public static void main(String[] args) {
        
      Usuario usuario = new Usuario(" MATIAS ", "MATIAS@GMAIL.COM");
      GeneradorQr qr = new GeneradorQr();
      
      qr.generar("CBU : 123123", usuario);
      
      
    }
    
}

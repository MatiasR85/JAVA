
package principal1;


public class Principal1 {

   
    public static void main(String[] args) {
        
     Foto foto = new Foto(" matias.fotopasaporte ", "JPG" );
     Titular titular = new Titular("MATIAS" , "44489835");
     Pasaporte pasaporte = new Pasaporte( " AR200358 ", " 10/08/2015" ,foto, titular);
      
     
        System.out.println(pasaporte);
     
     titular.setNombre("Hernan");
     
        System.out.println(pasaporte);
     
    }
    
}

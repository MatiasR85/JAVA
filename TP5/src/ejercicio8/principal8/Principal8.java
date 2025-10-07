
package principal8;


public class Principal8 {

   
    public static void main(String[] args) {
      
        Usuario usuario = new Usuario(" Matias ", "matias@gmail.com ");
        FirmaDigital firma = new FirmaDigital(" ASE485AW ", " 26/9/25", usuario);
        Documento doc = new Documento(" DNI ", " IDENTIFICACION ", firma);
        
        System.out.println(doc);
    }
    
}

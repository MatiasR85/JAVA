
package principal3;


public class Principal3 {

   
    public static void main(String[] args) {
      
      Editorial editorial = new Editorial(" Planeta", " Direccion la felicidad ");
      Autor autor = new Autor(" Gabriel Rolon ", " Argentina ");
      Libro libro = new Libro(" La felicidad", 1234587128, autor, editorial);
      
        System.out.println(libro);
        
        
    }
    
}


package principal111;


public class Principal111 {

   
    public static void main(String[] args) {
       Artista artista = new Artista( " DUKI ", "TRAP ");
       Cancion cancion = new Cancion( " GOTEO", artista);
       
       Reproductor repro = new Reproductor();
        repro.Reproducir(cancion);
        
        
        
    }
    
}

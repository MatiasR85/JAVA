
package principal111;


public class Reproductor {
    public void Reproducir(Cancion cancion){
       System.out.println(" REPRODUCIENDO..." + cancion.getTitulo() + " --" + cancion.getArtista().getNombre());
       // System.out.println(" REPRODUCIENDO... " + cancion);
    }
}

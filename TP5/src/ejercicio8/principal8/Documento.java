
package principal8;


public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

   

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }
    
    

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }

    

    
    
    
    }
   
    
            
 


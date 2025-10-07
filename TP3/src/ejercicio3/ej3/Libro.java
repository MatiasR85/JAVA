
package ej3;


public class Libro {

private String Titulo;    
private String Autor;    
private int anioPublicacion;

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    
    public void setAnoPublicacion(int anioPublicacion) {
        if ( anioPublicacion > 0 )
            System.out.println("aniopublicacion: " +anioPublicacion);
        else{
            System.out.println("Anio no valido ");
        }
    }


}

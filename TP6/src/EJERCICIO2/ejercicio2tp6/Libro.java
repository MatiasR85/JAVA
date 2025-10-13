
package ejercicio2tp6;


public class Libro {
    
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
     public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | ISBN: " + isbn + " | Año: " + anioPublicacion + " | Autor: " + autor.getNombre());

     }    
        
    @Override
    public String toString() {
        return  titulo + " (" + anioPublicacion + ") - " + autor.getNombre();

    }

    }
    
    


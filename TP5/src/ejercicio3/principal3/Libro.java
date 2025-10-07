
package principal3;


public class Libro {
    
    private String nombre;
    private int isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String nombre, int isbn, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", isbn=" + isbn + ", autor=" + autor + ", Editorial=" + editorial + '}';
    }
    
    
    
}

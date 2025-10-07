
package principal6;


public class Mesa {
    
    private String nombre;
    private int dni;

    public Mesa(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Mesa{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}

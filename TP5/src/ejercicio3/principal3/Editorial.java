
package principal3;


public class Editorial {
    
    private String nombre;
    private String Direccion;

    public Editorial(String nombre, String Direccion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", Direccion=" + Direccion + '}';
    }
    
    
    
}

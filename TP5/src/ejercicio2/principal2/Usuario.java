
package principal2;


public class Usuario {
    
    private String nombre;
    private int dni;
    private Celular celular;
    

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;   
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }

    
    

   


    
}

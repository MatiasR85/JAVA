
package ejercicio2tp6;


public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

   

    
    public void mostrarInfo() {
        System.out.println("Autor: ID=" + id + ", Nombre=" + nombre + ", Nacionalidad=" + nacionalidad);
    
    } 
    
}


package principal4;

public class Cliente {
    
    private String nombre;
    private int dni;
    private TarjetaC tarjeta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
        
    }

    void setTarjeta(TarjetaC tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + (tarjeta != null && tarjeta.getNumero() > 0 ? "Tarjeta Valida" : " Tarjeta Invalida ") + '}';
    }

   
    
    }
    
    
    


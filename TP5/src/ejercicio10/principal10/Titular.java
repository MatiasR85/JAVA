
package principal10;


public class Titular {
    
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
            
        
       
    }

          
   

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
        

   
  
    

 
    }

    

      
    

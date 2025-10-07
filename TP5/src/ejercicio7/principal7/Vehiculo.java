
package principal7;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        
       
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + conductor + '}';
    }
    
}

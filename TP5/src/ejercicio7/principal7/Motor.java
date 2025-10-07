
package principal7;


public class Motor {
    private String tipo;
    private String numeroDeSerie;
    

    public Motor(String tipo, String numeroDeSerie) {
        this.tipo = tipo;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

  

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroDeSerie=" + numeroDeSerie + '}';
    }

}


package principal5;



public class Computadora {
   
    private String marca;
    private int numeroDeSerie;
    private PlacaMadre placaMadre;
    private Propietario dueño;

        public Computadora(String marca, int numeroDeSerie, PlacaMadre placaMadre, Propietario dueño) {
            this.marca = marca;
            this.numeroDeSerie = numeroDeSerie;
            this.placaMadre = placaMadre;
            this.dueño = dueño;
        }

    public String getMarca() {
        return marca;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroDeSerie=" + numeroDeSerie + ", placaMadre=" + placaMadre + ", due\u00f1o=" + dueño + '}';
    }

    
    }

   
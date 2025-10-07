
package principal1;


public class Foto {
    
    private String numero;
    private String formato;

    public Foto(String numero, String formato) {
        this.numero = numero;
        this.formato = formato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "numero=" + numero + ", formato=" + formato + '}';
    }

   
    }
    
    



package principal1;



public class Pasaporte {
    
    private String numero;
    private String fechaDeEmision;
    private Foto FotoP;
    private Titular titular;

    public Pasaporte(String numero, String fechaDeEmision, Foto FotoP, Titular titular) {
        this.numero = numero;
        this.fechaDeEmision = fechaDeEmision;
        this.FotoP = FotoP;
        this.titular = titular;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(String fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public Foto getFotoP() {
        return FotoP;
    }

    public void setFotoP(Foto FotoP) {
        this.FotoP = FotoP;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaDeEmision=" + fechaDeEmision + ", FotoP=" + FotoP + ", titular=" + titular + '}';
    }

      
    
    
        }

    

 


        
   
    


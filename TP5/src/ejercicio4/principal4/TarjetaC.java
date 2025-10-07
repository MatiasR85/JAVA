
package principal4;


public class TarjetaC {
    
    private int numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaC(int numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        
        cliente.setTarjeta(this);
        
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNumero() {
        return numero;
    }

  
   

    @Override
    public String toString() {
        return "TarjetaC{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + ", banco=" + banco + '}';
    }
    
    
    
}

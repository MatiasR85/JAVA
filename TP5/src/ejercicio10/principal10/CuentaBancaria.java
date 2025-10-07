
package principal10;


 
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    
    
     public CuentaBancaria() {
        this.cbu = null;
        this.saldo = 0;
        this.clave = null; 
        this.titular = null;
                                


    
     }
     
     
    public CuentaBancaria( String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        
       
    }
    
        

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + '}';
    }
    
    
}


package principal10;


public class Principal10 {

    
    public static void main(String[] args) {
      
        Titular titular = new Titular(" Matias ", 44489835);
        ClaveSeguridad clave = new ClaveSeguridad( 2003, "MATIAS8 ( CAMBIO DE ALIAS ");
        CuentaBancaria cuenta = new CuentaBancaria ("257452873872", 20500, clave, titular);
        
        
        titular.setCuenta(cuenta);
        
        System.out.println(cuenta);
    }
    
}

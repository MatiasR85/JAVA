
package principal11;


public class GeneradorQr {
    
    public void generar(String valor, Usuario usuario){
        CodigoQr qr = new CodigoQr(valor, usuario);
        System.out.println(" QR GENERADO " + qr);
    }
    
}

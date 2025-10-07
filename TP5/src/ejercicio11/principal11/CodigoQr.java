
package principal11;


public class CodigoQr {
    
    private String valor;
    private Usuario usuario;

    public CodigoQr(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "CodigoQr{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }

   
    
    
}

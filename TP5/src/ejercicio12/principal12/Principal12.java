
package principal12;


public class Principal12 {

    
    public static void main(String[] args) {
       Contribuyente contribuyente = new Contribuyente( " Matias ", " 20-44489835-7");
       Impuesto impuesto = new Impuesto( 25000, contribuyente);
       
       Calculadora calcular = new Calculadora();
       calcular.calcular(impuesto);
       
       
    }
    
}


package herenciaej2;



public class HerenciaEj2 {

    
    public static void main(String[] args) {
        
        
       Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo( 5, "Círculo");
        figuras[1] = new Rectangulo(4, 6, "Rectángulo");

        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getNombre());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("------------------");
        }
    }

    }
    


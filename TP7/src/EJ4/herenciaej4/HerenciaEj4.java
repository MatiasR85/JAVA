
package herenciaej4;

import java.util.ArrayList;


public class HerenciaEj4 {

   
    public static void main(String[] args) {
       
    ArrayList<Animal> animales = new ArrayList<>();
    
    animales.add(new Perro());
    animales.add(new Gato());
    animales.add(new Vaca());
    
        for (Animal animale : animales) {
            animale.describirAnimal();
            animale.hacerSonido();
            System.out.println(" --------");
            
        }
    
    }
    
}

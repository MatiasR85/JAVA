
package ej4;

import java.util.Scanner;


public class EJ4 {

    
    public static void main(String[] args) {
     Gallina g1  = new Gallina(1,2);
     Gallina g2  = new Gallina(2,2);
     
     g1.ponerHuevo();
     g1.ponerHuevo();
     g1.envejecer();
     
     g2.ponerHuevo();
     g2.ponerHuevo();
     g2.envejecer();
     
     g1.mostrarEstados();
     g2.mostrarEstados();
     
    }
    
}

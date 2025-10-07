
package ej3;

import java.util.Scanner;


public class EJ3 {

    
    public static void main(String[] args) {
    Libro l = new Libro();
    
        System.out.println("Autor " + l.getAutor());
        System.out.println("Titulo " + l.getTitulo());

        
       l.setAnoPublicacion(1999);
       l.setAnoPublicacion(-10);
    }
    
}

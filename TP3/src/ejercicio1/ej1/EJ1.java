
package ej1;

import java.util.Scanner;


public class EJ1 {

    
    public static void main(String[] args) {
      
     Estudiantes e = new Estudiantes();   
        
     e.Nombre = " Matias ";
     e.Apellido = " Roda  ";
     e.Curso = " 2a ";
     e.Nota = 8 ;
     
     e.mostrarinfo();
     
     e.subirCalificacion(2);
     
     e.Nota = 6;
     
     
   
    }
    
}

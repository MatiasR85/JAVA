
package ej1;


public class Estudiantes {
    
 String Nombre;
 String Apellido;
 String Curso;
 double Nota;
        
  void mostrarinfo(){
      System.out.println(Nombre + " " + Apellido + " " +Curso + " " + Nota);
  }
    public void subirCalificacion(double puntos){
    Nota += puntos;
      System.out.println(" Su nota ha subido " + Nota);
     
  }
  public void bajarCalificacion(double puntos){
    Nota -= puntos;
    if (Nota < 0){
        Nota = 0;
    }
       
      System.out.println(" Su nota ha bajado " + Nota);
       
  }
   
}

   
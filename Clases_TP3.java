
package clases_tp3;


public class Clases_TP3 {

    public static void main(String[] args) {
        System.out.println(" CLASES TP 3 ");
        
  /* CLASE EJERCICIO 1 
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

        
        */   
  /* CLASE EJERCICIO 2 
  
package ej2;



public class Mascotaa {
    
 String Nombre;
 String Especie;
 int Edad;
 
  void mostrarDatos(){  
      System.out.println("Nombre: " + Nombre + "Especie: " + Especie +"Edad: " + Edad);
  }     
 
  void cumplirAnios(int anios){
      Edad += anios;
      
      System.out.println("Tu edad actualmente es: " + Edad);
  }
}
      
  

  
  */
  
  /*CLASE EJERCICIO3
  
package ej3;


public class Libro {

private String Titulo;    
private String Autor;    
private int anioPublicacion;

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    
    public void setAnoPublicacion(int anioPublicacion) {
        if ( anioPublicacion > 0 )
            System.out.println("aniopublicacion: " +anioPublicacion);
        else{
            System.out.println("Anio no valido ");
        }
    }


}

  
  */
  
  /*CLASE EJERCICIO4
  package ej4;


public class Gallina {
    
 int idgallina;
 int edad;
 int huevospuestos;
 
 public Gallina(int id, int edadInicial){
     idgallina = id;
     edad = edadInicial;
     huevospuestos = 0;
 }

 public void ponerHuevo(){
     huevospuestos++;
     System.out.println(" Gallina " + idgallina + " Puso un huevo ");
    
 }
 
  public void envejecer(){
      edad++;
      System.out.println(" Gallina " + idgallina + " ahora tiene " + edad + "anios ");
  }
  
 public void mostrarEstados(){
     System.out.println(" Estado de la gallina " + idgallina + " ");
     System.out.println(" Edad " + edad + " Anios ");
     System.out.println(" Huevos puestos: " + huevospuestos);
 
 }  
  
}

  
  */
  
  /*CLASE EJERCICIO5
  package ej5;


public class Nave {
 private String nombre;
  private int combustible; 

  public Nave(String name, int combustibleInicial){
      nombre = name;
      if (combustibleInicial > 100){
          combustible = 100;
      } else if (combustibleInicial < 0){
          combustible = 0;
      }else{
          combustible = combustibleInicial;
      }
          
      
  }
  
  public void despegar(){
      if(combustible >= 10){
          combustible -= 10;
          System.out.println(" La nave " + nombre + " ha despegado ");
      }
  }
  
  public void avanzar(int distancia){
   if (combustible >= distancia){
       combustible -= distancia;
       System.out.println(" La nave " + nombre + " Avanzo " + distancia + " KM ");
   }else{
         System.out.println(" No hay suficiente combustible para avanzar " + distancia + " KM ");
   }  
  }
  public void recargarCombustible(int cantidad){
      if (cantidad <= 0){
          System.out.println(" Cantidad invalidad  para recargar ");
          return ;
      }
      if (combustible + cantidad > 100){
            combustible = 100;
           System.out.println(" Tanque recargado al maximo (100) ");
  } else {
      combustible += cantidad;
          System.out.println(" Se recargaron " + cantidad + " Litros de combustible ");
  }
       
    }
  
  public void mostrarDatos(){
      System.out.println("   ESTADO DE LA NAVE ");
      System.out.println(" Nombre " + nombre );
      System.out.println(" Combustible " + combustible + "/100 ");
  }
}
        


  
  */
    }
    
}

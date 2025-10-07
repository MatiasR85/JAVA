
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
      
  




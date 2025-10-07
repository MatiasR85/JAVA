
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


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
        


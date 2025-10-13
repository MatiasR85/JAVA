
package principal.tp6;

import java.util.ArrayList;


public class Inventario {
    
   private ArrayList<Producto> productos;
   
  public Inventario(){
      
      productos = new ArrayList();
  }
  
  public void AgregarProducto(Producto p){
      
      productos.add(p);
    
}
 
  public void listarProducto(){
    
      if(productos.isEmpty()){
          System.out.println(" NO HAY PRODUCTOS EN EL INVENTARIO ");
          return;
      }
      for (Producto p : productos) {
          p.mostrarInfo();
          
      }
  }
  
  public Producto buscarProductoPorId(String id){
      for (Producto p : productos) {
          if(p.getId().equals(id)){
              
          }
            return p;  
          
      }
            return null;
      
  } 
       
   public void eliminarProducto(String id){
       
       Producto p = buscarProductoPorId(id);
       
       if(p != null){
           productos.remove(p);
       }
   }    

    public void actualizarStock(String id, int nuevaCantidad){
        
        Producto p = buscarProductoPorId(id);
         if(p != null){
           p.setCantidad(nuevaCantidad);
             System.out.println("Stock Actualizado para " + p.getNombre() + ": " + nuevaCantidad);
         }
         
    }
    
     public void filtrarPorCategoria(CategoriaProducto categoria){
         System.out.println(" Productos en la categoria " + categoria);
         
         for (Producto p : productos) {
             if (p.getCategoria() == categoria ){
                 
                 p.mostrarInfo();
                         
             }
             
         }
     }  
     
     public int obtenerTotalStock(){
         
       int total = 0;
         for (Producto p : productos) {
             total += p.getCantidad();
             
             
         }
         return total;
     }
     
     public Producto obtenerProductoConMayorStock(){
        
         if(productos.isEmpty()) return null;
         
         Producto max = productos.get(0);
         for (Producto p : productos) {
             if(p.getCantidad() > max.getCantidad()){
                 max = p;
                 
             }
            
             
         }
         return max;
     }
       public void filtrarProductosPorPrecio(double min, double max){
           System.out.println(" Productos entre $ " +min + " y $ " + max + " :");
           for (Producto p : productos) {
               if(p.getPrecio() >= min && p.getPrecio() <= max){
                   p.mostrarInfo();
               }
               
           }
       }    
       
    public void mostrarCategoriasDisponibles(){
        System.out.println(" Categorias Disponibles ");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(" -" + c);
            
        }
    }
  }
    
  


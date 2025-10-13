
package principal.tp6;

public class PrincipalTP6 {

    public static void main(String[] args) {
      Inventario inventario = new Inventario();
      

      inventario.AgregarProducto(new Producto(" BE54 ", " GALLETITAS ", 520, 2, CategoriaProducto.ALIMENTOS ));
      inventario.AgregarProducto(new Producto (" GE33 ", " CELULAR ", 150000, 7, CategoriaProducto.ELECTRONICA ));
      inventario.AgregarProducto(new Producto(" B4 ", " SARTEN ", 3000 , 5 , CategoriaProducto.HOGAR  ));
      inventario.AgregarProducto(new Producto(" T77 ", " BUZO ", 30000, 1, CategoriaProducto.ROPA));
      inventario.AgregarProducto(new Producto (" T25 ", " PLAY5 ", 1000000, 3, CategoriaProducto.ELECTRONICA));
      
        System.out.println(" LISTAR PRODUCTOS ");
        inventario.listarProducto();
     
    
       Producto buscado = inventario.buscarProductoPorId("BE54");
       
       if (buscado != null){
           System.out.println(" PRODUCTO ENCONTRADO ");
           buscado.mostrarInfo();
           
       }else{
           System.out.println(" PRODUCTO NO IDENTIFICADO ");
       }
      
       inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
       inventario.eliminarProducto(" BE54");
        
        System.out.println(" LISTA ACTUALIZADA ");
        inventario.listarProducto();
       
        
        inventario.actualizarStock(" GE33", 5);
        
       Producto mayor = inventario.obtenerProductoConMayorStock();
       
      
       
            if (mayor != null){
           System.out.println(" PRODUCTO DE MAYOR PRECIO ");
           mayor.mostrarInfo();
           
       }else{
           System.out.println(" PRODUCTO NO IDENTIFICADO ");
       }
       
            inventario.filtrarProductosPorPrecio(1000, 30000);
       
            inventario.mostrarCategoriasDisponibles();
      
    }
    
}

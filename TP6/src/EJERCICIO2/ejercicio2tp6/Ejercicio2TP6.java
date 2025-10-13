
package ejercicio2tp6;

import java.util.List;


public class Ejercicio2TP6 {

    public static void main(String[] args) {
       
        Bibloteca bibloteca = new Bibloteca(" LIBRERIA RIVER");
        
         Autor a1 = new Autor("2050", " Matias Roda", " Argentina " );
         Autor a2 = new Autor("2060", " Hernan Roda", " Argentina " );
         Autor a3 = new Autor("2070", "Walter Roda", " Argentina " );
         
         
         bibloteca.agregarLibro("ISBN2003", " RIVER PLATE ", 1901, a1);
         bibloteca.agregarLibro("ISBN2004", " SAN MARTIN ", 1921, a2);
         bibloteca.agregarLibro("ISBN2005", " AFA ", 1911, a3);
         bibloteca.agregarLibro("ISBN2008", " PLATENSE ", 1911, a1);
         bibloteca.agregarLibro("ISBN2000", " CENTRAL NORTE DE SALTA ", 1911, a3);
         
         
         bibloteca.listarLibros();
         
         Libro buscado = bibloteca.buscarLibroPorIsbn("ISBN2003");
         
        if (buscado != null){
           System.out.println(" Libro Encontrado ");
           buscado.mostrarInfo();
           
       }else{
           System.out.println(" LIBRO NO IDENTIFICADO ");
       }
         
        
         int anio = 1911;
         
         List<Libro> librosFiltrados = bibloteca.filtarLibroPorAnio(anio);
         System.out.println(" Libros Publicado en " + anio + " : ");
         for (Libro libro : librosFiltrados) {
             libro.mostrarInfo();
            
        }
         
         bibloteca.eliminarLibros("ISBN2003");
         bibloteca.listarLibros();
         
         System.out.println(" CANTIDAD DE LIBROS " + bibloteca.obtenerCantidadLibros());
         
        
         System.out.println(" AUTORES DISPONIBLES " );
         bibloteca.mostrarAutoresDisponibles();
      
         
    }
    
}

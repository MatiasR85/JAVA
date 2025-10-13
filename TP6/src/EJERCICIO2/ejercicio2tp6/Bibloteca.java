
package ejercicio2tp6;

import java.util.ArrayList;
import java.util.List;



public class Bibloteca {
    
    private String nombre;
    private List <Libro> libros;

    public Bibloteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList();
    }
    
    
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
     
        
    }
    
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println(" NO HAY LIBROS EN LA BIBLOTECA ");
            return;
            
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
            
            
            
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro libro : libros) {
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
            
        }
            
            return null;
    }
    
    public void eliminarLibros(String isbn){
        
        Libro libro = buscarLibroPorIsbn(isbn);
        
        if (libro != null){
            libros.remove(libro);
            System.out.println(" LIBRO ELIMINADO " + libro);
            
        }
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public List<Libro> filtarLibroPorAnio(int anioPublicacion){
        List<Libro> resultado = new ArrayList();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anioPublicacion){
                resultado.add(libro);
            }
            
        }
        return resultado;  
    }
      
    public void mostrarAutoresDisponibles(){
        List<String> idsMostrados = new ArrayList<>(); 
    for (Libro libro : libros) {
        Autor autor = libro.getAutor();
        String idAutor = autor.getId().trim(); 
        if (!idsMostrados.contains(idAutor)) {
            idsMostrados.add(idAutor);
            autor.mostrarInfo(); 
        }
    }
}
    }
    
          
        
            
        
    



package ejercicio3.tp6;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso>cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c){
         if(!cursos.contains(c)){
             cursos.add(c);
             if(c.getProfesor() != this){
                 c.setProfesor(this);
             }
                     
         }
    }
        
    public void eliminarCurso(Curso c){
        if(!cursos.contains(c)){
             cursos.remove(c);
             if(c.getProfesor() != this){
                 c.setProfesor(this);
             }
                     
         }
    }
    
    public void listarCurso(){
        if(cursos.isEmpty()){
            System.out.println(" No se encontro el curso ");
        }
        for (Curso curso : cursos) {
            System.out.println(" - " + curso.getCodigo() + " : " + curso.getNombre());
            
        }
    }

    
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id + " | Especialidad: " + especialidad + " | Cursos: " + cursos.size());
    
    }
    
}

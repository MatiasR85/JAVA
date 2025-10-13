
package ejercicio3.tp6;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    
    private String nombre;
    private List<Profesor>profesores;
    private List<Curso>cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }
    public void agregarCurso(Curso c){
        cursos.add(c);
        
    }

    public Profesor buscarProfesorPorId(String id){
        for (Profesor p : profesores) {
            if(p.getId().equals(id)) return p;
                
            
        }
                
          return null;  
        }
    
    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso c : cursos) {
            if(c.getCodigo().equals(codigo)) return c;
                
            
        }
                
          return null;  
        }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if(curso != null && profesor != null){
            curso.setProfesor(profesor);
            System.out.println(" PROFESOR " + profesor.getNombre() + " ASIGNADO AL CURSO " + curso.getNombre());
   
    }else{
            System.out.println(" PROFESOR O CURSO NO ENCONTRANDO ");
        }
    }
    public void listarProfesor(){
        for (Profesor p : profesores) {
            p.mostrarInfo();
            
        }
    }
    public void listarCurso(){
        for (Curso c :cursos ) {
            c.mostrarInfo();
        }
            
        }
    
    public void eliminarCurso(String codigo){
        Curso curso = buscarCursoPorCodigo(codigo);
        if(curso != null){
            if(curso.getProfesor() != null){
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println(" CURSO ELIMINADO " + curso.getNombre());
            
        }
    }
    public void eliminarProfesor(String id){
        Profesor p = buscarProfesorPorId(id);
        if(p!= null){
            for (Curso c: new ArrayList<>(p.getCursos())) {
              c.setProfesor(null);
            }
            }
            profesores.remove(p);
            System.out.println(" PROFESOR ELIMINADO " + p.getNombre());
            
        }
    
    }





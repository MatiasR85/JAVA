
package ejercicio3.tp6;

public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String curso, String nombre) {
        this.codigo = curso;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = nuevoProfesor;
        
        if(nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)){
            nuevoProfesor.agregarCurso(this);
        }
    }

   
    public void mostrarInfo() {
        String nombreProf = (profesor != null ) ? profesor.getNombre() : " SIN PROFESOR ASIGNADO ";
        System.out.println("Curso: " + nombre + " | CODIGO: " + codigo + " | Profesor: " + nombreProf );
        
    }
    
    
}

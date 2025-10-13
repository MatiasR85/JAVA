
package ejercicio3.tp6;


public class EJERCICIO3TP6 {

    
    public static void main(String[] args) {
        
        Universidad uni = new Universidad(" UTN");
        
        Profesor profe1 = new Profesor("20AB", "MATIAS RODA", "MATEMATICA ");
        Profesor profe2 = new Profesor("30AG", "HERNAN RODA", "PROGRAMACION ");
        Profesor profe3 = new Profesor("50AX", "WALTER RODA", "INGLES");
        
        Curso curso1 = new Curso("AC589", "APRENDIENDO A SUMAR");
        Curso curso2 = new Curso("BR89", "DIVISION Y RESTA");
        Curso curso3 = new Curso("CB569", "JAVA ");
        Curso curso4 = new Curso("DN489", "VERB TO BE");
        Curso curso5 = new Curso("EM389", "PSEINT ");
        
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        uni.agregarProfesor(profe3);
        
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        
        uni.asignarProfesorACurso("AC589", "20AB");
        uni.asignarProfesorACurso("BR89", "20AB");
        uni.asignarProfesorACurso("CB569", "30AG");
        uni.asignarProfesorACurso("EM389", "30AG");
        uni.asignarProfesorACurso("DN489", "50AX");
        
        System.out.println(" CURSO LISTADOS");
        uni.listarCurso();
        
        System.out.println(" PROFESOR LISTADO");
        uni.listarProfesor();
        
        System.out.println("CURSOS POR PROFESOR");
        profe1.listarCurso();
        
        System.out.println(" CAMBIANDO PROFESOR DE CURSO");
        uni.asignarProfesorACurso("AC589", "50AX");
        uni.listarCurso();
        
        System.out.println(" ELIMINAR CURSO ");
        uni.eliminarCurso("AC589");
        uni.listarCurso();
        
        System.out.println(" ELIMINAR PROFESOR");
        uni.eliminarProfesor("50AX");
        uni.listarProfesor();
        uni.listarCurso();
       
    }
    
    
}


package principal9;


public class Principal9 {

    
    public static void main(String[] args) {
      
       Paciente paciente = new Paciente(" MATIAS ", " OSDE ");
       Profesional doc = new Profesional( " PABLO P ", " CARDIOLOGO ");
       CitaMedica cita = new CitaMedica (" 26/9/25 ", " 16:00", paciente, doc);
       
        System.out.println(cita);
       
    }
    
}

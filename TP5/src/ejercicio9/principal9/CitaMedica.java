
package principal9;


public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional doc;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional doc) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.doc = doc;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", doc=" + doc + '}';
    }
    
    
}

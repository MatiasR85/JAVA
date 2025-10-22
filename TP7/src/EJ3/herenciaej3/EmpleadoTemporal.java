
package herenciaej3;


public class EmpleadoTemporal extends Empleado {
    
    private String sector;
    private int diasLaborables;
    
    private final static double VALOR_TAREASVARIAS = 30000;
    private final static double VALOR_ESPECIALIZADO = 50000;
    

    public EmpleadoTemporal(String sector, int diasLaborables, String nombre) {
        super(nombre);
        this.sector = sector;
        this.diasLaborables = diasLaborables;
    }

    public String getSector() {
        return sector;
    }

    
    
    @Override
    public double calcularSueldo() {
        String s = sector.trim().toLowerCase();
        if(s.equalsIgnoreCase("Tareas Varias")){
            return diasLaborables * VALOR_TAREASVARIAS;
        }else if (s.equalsIgnoreCase("Especializado")){
            return diasLaborables * VALOR_ESPECIALIZADO;  
        }else{  
          return 0;  
            }
    
     }
        
        
    
    
    
}


package herenciaej3;

public class EmpleadoPlanta extends Empleado {
    
    private String sector;
    
    
   private static final double SUELDO_ADMINISTRACION = 2000000;
    private static final double SUELDO_PRODUCCION = 1200000;

    public EmpleadoPlanta(String sector, String nombre) {
        super(nombre);
        this.sector = sector;
        
    }

    public String getSector() {
        return sector;
    }
 
   
    @Override
    public double calcularSueldo() {
        
         String s = sector.trim().toLowerCase();
   
          
        if(s.equalsIgnoreCase("Administraccion")){
            return SUELDO_ADMINISTRACION;
        }else if (s.equalsIgnoreCase("Produccion")){
            return SUELDO_PRODUCCION;   
        }else{  
          return 0;  
            }
    
     }
}


    
    
    
    
   
    


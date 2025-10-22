
package herenciaej3;

import java.util.ArrayList;


public class HerenciaEj3 {

    
    public static void main(String[] args) {
        
         Empleado[] empleados = new Empleado[4];
         empleados[0] = new EmpleadoPlanta ("Administraccion","Matias Roda");
         empleados[1] = new EmpleadoPlanta ("Produccion", "Walter Roda");
         empleados[2] = new EmpleadoTemporal ("TAREAS VARIAS",24, " Enzo Perez ");
         empleados[3] = new EmpleadoTemporal ("ESPECIALIZADO" ,26, " Franco Armani ");
        
        for (Empleado empleado : empleados) {
            System.out.println(" EMPLEADO " + empleado.getNombre());
            System.out.println(" SUELDO : $" + empleado.calcularSueldo());
            
            if(empleado instanceof EmpleadoPlanta){
                System.out.println(" Tipo: Planta, Sector:  " + ((EmpleadoPlanta) empleado).getSector());    
            }
            
          if(empleado instanceof EmpleadoTemporal){
                System.out.println(" Tipo: Temporal, Sector:  " + ((EmpleadoTemporal) empleado).getSector());    
            }
          
            System.out.println(" ----------------- ");
        }
    }
    
}

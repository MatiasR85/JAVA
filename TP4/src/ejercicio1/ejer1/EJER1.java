
package ejer1;

import java.util.Scanner;


public class EJER1 {

   
    public static void main(String[] args) {
    
       Empleado Emp1 = new Empleado();
       Empleado Emp2 = new Empleado("Matias Roda ", " Futbolista ");
       Empleado Emp3 = new Empleado("Hernan Roda ", " Medico ", 80000);
               
       Emp1.mostrarInfo();
       Emp2.mostrarInfo();
       Emp3.mostrarInfo();
       
       Emp3.aumentarSaldo(10);
       Emp3.aumentarSalario(5000);
       Emp3.mostrarInfo();
       
        System.out.println(" Total De Empleados; " +Empleado.gettotalEmpleados());
       
       
    }
    
}

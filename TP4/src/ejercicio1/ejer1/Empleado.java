
package ejer1;



public class Empleado {
    private int id;
    private String nombre;
     private String puesto;
     private double salario;
     
    private static int totalEmpleados = 0;
    
    //CONSTRUCTOR VACIO
        
    public Empleado(){
     this.id = ++totalEmpleados;
     this.nombre = "xxx";
     this.puesto = "xxx";
     this.salario = 0.0;
     
    }   
    
    // CONSTRUCTOR CON 3 PARAMETROS
    public Empleado(String nombre, String puesto, double salario){
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
       
    }
     // CONSTRUCTOR CON 2 PARAMETROS
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;
    }
    public void aumentarSaldo(double porcentaje){
        this.salario += salario * (porcentaje/100);
        
    }
    public void aumentarSalario(int cantidad){
        this.salario += cantidad;
        
    }

    public int getId() {
        return id;
    }


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String toString(){
        return "Empleado {" +
                "ID= " + id +
                ", Nombre= '" + nombre + '\'' +
                ", Salario =$" + salario +
                '}';
        
    }
   
    
    public static int gettotalEmpleados(){
        return totalEmpleados;
        
    }
    
    public void mostrarInfo(){
        System.out.println(" ID " + id);
        System.out.println(" NOMBRE " +nombre);
        System.out.println(" PUESTO " +puesto);
        System.out.println(" SALARIO: $" +salario);
        System.out.println("------------");
        
    }
    }
    
   
    



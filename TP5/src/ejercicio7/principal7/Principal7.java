
package principal7;

public class Principal7 {

    
    public static void main(String[] args) {
        Conductor conductor = new Conductor(" Matias ", "L1,L2,L3 ");
      Motor motor = new Motor(" NAFTA ", " AE25483 ");
      Vehiculo auto = new Vehiculo( "AB 527 AN ", " 2017 ", motor, conductor);
      
        System.out.println(auto);
    }
    
}

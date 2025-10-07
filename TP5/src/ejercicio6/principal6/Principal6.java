
package principal6;

public class Principal6 {

    
    public static void main(String[] args) {

       Mesa mesa = new Mesa(" Mesa10", 44489826);
       Cliente cliente = new Cliente(" Matias ", 33293338);
       Reserva reserva = new Reserva(" 26/9/25 "," 21:00 ", cliente, mesa );
       
        System.out.println(reserva);
       
        
    }
    
}

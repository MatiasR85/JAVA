
package principal5;


public class Principal5 {

    
    public static void main(String[] args) {
       
     Propietario propietario = new Propietario(" Matias" , 44489835);  
     PlacaMadre placa = new PlacaMadre(" Asus520G", " AMD");
     Computadora compu = new Computadora(" LENOVO ", 201589, placa, propietario);
     
        System.out.println(compu);
    }
    
}

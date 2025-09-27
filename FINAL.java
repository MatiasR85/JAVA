
package pkgfinal;

public class FINAL {

    
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        
    /* CLASES 
        public class Titular {
    
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}public class Pasaporte {
    
    private String numero;
    private String fechaDeEmision;
    private Foto FotoP;
    private Titular titular;

    public Pasaporte(String numero, String fechaDeEmision, Foto FotoP, Titular titular) {
        this.numero = numero;
        this.fechaDeEmision = fechaDeEmision;
        this.FotoP = FotoP;
        this.titular = titular;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(String fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public Foto getFotoP() {
        return FotoP;
    }

    public void setFotoP(Foto FotoP) {
        this.FotoP = FotoP;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaDeEmision=" + fechaDeEmision + ", FotoP=" + FotoP + ", titular=" + titular + '}';
    }

      
    
    
        }
public class Foto {
    
    private String numero;
    private String formato;

    public Foto(String numero, String formato) {
        this.numero = numero;
        this.formato = formato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "numero=" + numero + ", formato=" + formato + '}';
    }

   
    }
        
        MAIN
        
        public static void main(String[] args) {
        
     Foto foto = new Foto(" matias.fotopasaporte ", "JPG" );
     Titular titular = new Titular("MATIAS" , "44489835");
     Pasaporte pasaporte = new Pasaporte( " AR200358 ", " 10/08/2015" ,foto, titular);
      
     
        System.out.println(pasaporte);
     
     titular.setNombre("Hernan");
     
        System.out.println(pasaporte);
     
        */
    
        System.out.println("EJERCICIO 2");
        
        /*
        CLASES 
        public class Bateria {
    
    private String modelo;
    private String capacidad;


    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        
    }


    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }

   
public class Usuario {
    
    private String nombre;
    private int dni;
    private Celular celular;
    

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;   
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }

    public class Celular {
    
  private String mail;
  private String marca;
  private String modelo;
  private Bateria bateria;
  private Usuario usuario;
  
  

    public Celular(String mail, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.mail = mail;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        
        
    }

    @Override
    public String toString() {
        return "Celular{" + "mail=" + mail + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }

        MAIN 
        
        public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario(" Matias", 44489835);
   
        Bateria bateria1 = new Bateria("Bosch", "45%");
   
        Celular celular = new Celular(" Matias22@gmail.com "," Apple", " 16PRO", bateria1, usuario1);
   
        
      
            System.out.println(celular);
            
            
        */
        System.out.println(" EJERCICIO 3");
        
        /* 
         CLASES 
        public class Autor {
    
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

    public class Editorial {
    
    private String nombre;
    private String Direccion;

    public Editorial(String nombre, String Direccion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", Direccion=" + Direccion + '}';
    }
    
    public class Libro {
    
    private String nombre;
    private int isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String nombre, int isbn, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", isbn=" + isbn + ", autor=" + autor + ", Editorial=" + editorial + '}';
    }
      MAIN 
         public static void main(String[] args) {
      
      Editorial editorial = new Editorial(" Planeta", " Direccion la felicidad ");
      Autor autor = new Autor(" Gabriel Rolon ", " Argentina ");
      Libro libro = new Libro(" La felicidad", 1234587128, autor, editorial);
      
        System.out.println(libro);
        
        
        */
        
        System.out.println("EJERCICIO 4");
        
        /* 
        CLASES 
        public class Banco {
    
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    public class Cliente {
    
    private String nombre;
    private int dni;
    private TarjetaC tarjeta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
        
    }

    void setTarjeta(TarjetaC tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + (tarjeta != null && tarjeta.getNumero() > 0 ? "Tarjeta Valida" : " Tarjeta Invalida ") + '}';
    }
public class TarjetaC {
    
    private int numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaC(int numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        
        cliente.setTarjeta(this);
        
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNumero() {
        return numero;
    }

  
   

    @Override
    public String toString() {
        return "TarjetaC{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + ", banco=" + banco + '}';
    }
       MAIN 
        public static void main(String[] args) {
       
       Banco banco = new Banco("BBVA", "20-4784638-6");
       Cliente cliente = new Cliente(" Matias ", 44489835);
       TarjetaC Tarjeta = new TarjetaC(108545215, "20/06/2027", cliente, banco);
       
       
         System.out.println(Tarjeta);
        
       
        
        
         Banco banco2 = new Banco("MACRO", "14-14851883-4");
         Cliente cliente2 = new Cliente(" Hernan", 45782189);
         TarjetaC Tarjeta2 = new TarjetaC(108545215, "20/06/2027", cliente2, banco2);
         System.out.println(Tarjeta2);
      
       
        
        */
        
        System.out.println(" EJERCICIO 5");
    /*
        CLASES 
        public class PlacaMadre {
    
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    public class Propietario {
    
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
    }
    public class Computadora {
   
    private String marca;
    private int numeroDeSerie;
    private PlacaMadre placaMadre;
    private Propietario dueño;

        public Computadora(String marca, int numeroDeSerie, PlacaMadre placaMadre, Propietario dueño) {
            this.marca = marca;
            this.numeroDeSerie = numeroDeSerie;
            this.placaMadre = placaMadre;
            this.dueño = dueño;
        }

    public String getMarca() {
        return marca;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroDeSerie=" + numeroDeSerie + ", placaMadre=" + placaMadre + ", due\u00f1o=" + dueño + '}';
    }

    
    }
        MAIN 
        
        public static void main(String[] args) {
       
     Propietario propietario = new Propietario(" Matias" , 44489835);  
     PlacaMadre placa = new PlacaMadre(" Asus520G", " AMD");
     Computadora compu = new Computadora(" LENOVO ", 201589, placa, propietario);
     
        System.out.println(compu);
    }
    
        */    
        
        System.out.println(" EJERCICIO 6");
        
        /*
        CLASES
        public class Cliente {
    
    private String nombre;
    private int telefono;

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    public class Mesa {
    
    private String nombre;
    private int dni;

    public Mesa(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Mesa{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }
    
     MAIN 
        
            public static void main(String[] args) {

       Mesa mesa = new Mesa(" Mesa10", 44489826);
       Cliente cliente = new Cliente(" Matias ", 33293338);
       Reserva reserva = new Reserva(" 26/9/25 "," 21:00 ", cliente, mesa );
       
        System.out.println(reserva);
       
        */
        System.out.println(" EJERCICIO 7"  );
        
        /*
        CLASES
        
        public class Motor {
    
    private String tipo;
    private String numeroDeSerie;
    

    public Motor(String tipo, String numeroDeSerie) {
        this.tipo = tipo;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

  

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroDeSerie=" + numeroDeSerie + '}';
    }

   public class Conductor {
    
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        
    }

       
    
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia +  '}';
    }
    public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        
        conductor.setVehiculo(this);
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + conductor + '}';
    }
     MAIN
        
        public class JavaApplication49 {

    
    public static void main(String[] args) {
        
      Conductor conductor = new Conductor(" Matias ", "L1,L2,L3 ");
      Motor motor = new Motor(" NAFTA ", " AE25483 ");
      Vehiculo auto = new Vehiculo( "AB 527 AN ", " 2017 ", motor, conductor);
      
        System.out.println(auto);
    }
        */
    }
    
    
}

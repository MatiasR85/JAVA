
package final2;


public class Final2 {

    
    public static void main(String[] args) {
        System.out.println(" EJERCICIO 8");
        /*
        CLASES 
        public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

 

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

   

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }
    
    

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }
        MAIN 
        public static void main(String[] args) {
      
        Usuario usuario = new Usuario(" Matias ", "matias@gmail.com ");
        FirmaDigital firma = new FirmaDigital(" ASE485AW ", " 26/9/25", usuario);
        Documento doc = new Documento(" DNI ", " IDENTIFICACION ", firma);
        
        System.out.println(doc);
    }
    
        */
        
        System.out.println(" EJERCICIO 9" );
        /*
        CLASES
        public class Paciente {
    
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
    public class Profesional {
    
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
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
        MAIN
        
        public static void main(String[] args) {
      
       Paciente paciente = new Paciente(" MATIAS ", " OSDE ");
       Profesional doc = new Profesional( " PABLO P ", " CARDIOLOGO ");
       CitaMedica cita = new CitaMedica (" 26/9/25 ", " 16:00", paciente, doc);
       
        System.out.println(cita);
       
    }
    
        */
        
        System.out.println("EJERCICIO 10");
        /*
        CLASES 
        public class ClaveSeguridad {
    
    private int codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(int codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    public class Titular {
    
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
            
        
       
    }

          
   

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
        
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    
    
     public CuentaBancaria() {
        this.cbu = null;
        this.saldo = 0;
        this.clave = null; 
        this.titular = null;
                                


    
     }
     
     
    public CuentaBancaria( String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        
       
    }
    
        

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + '}';
    }
    
    
}
        MAIN 
        
        public class Principal10 {

    
    public static void main(String[] args) {
      
        Titular titular = new Titular(" Matias ", 44489835);
        ClaveSeguridad clave = new ClaveSeguridad( 2003, "MATIAS8 ( CAMBIO DE ALIAS ");
        CuentaBancaria cuenta = new CuentaBancaria ("257452873872", 20500, clave, titular);
        
        
        titular.setCuenta(cuenta);
        
        System.out.println(cuenta);
    }
        */
        System.out.println("EJERCICIO 11");
        
        /*
        
        CLASES
        
        public class Artista {
    
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }public class Cancion {
    
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

   @Override
    public String toString() {
    return titulo + " - " + artista.getNombre();
    
    }
        public class Reproductor {
    public void Reproducir(Cancion cancion){
       System.out.println(" REPRODUCIENDO..." + cancion.getTitulo() + " --" + cancion.getArtista().getNombre());
       // System.out.println(" REPRODUCIENDO... " + cancion);
    }
}   MAIN  
        
        public class Principal111 {

   
    public static void main(String[] args) {
       Artista artista = new Artista( " DUKI ", "TRAP ");
       Cancion cancion = new Cancion( " GOTEO", artista);
       
       Reproductor repro = new Reproductor();
        repro.Reproducir(cancion);
        
        */
        
        System.out.println(" EJERCICIO 12");
        /*
        CLASES
        
        public class Contribuyente {
    
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuil=" + cuil + '}';
    }
    public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        System.out.println(" IMPUESTO TOTAL CALCULADO " + impuesto);
    }
}   MAIN 
        
        public static void main(String[] args) {
       Contribuyente contribuyente = new Contribuyente( " Matias ", " 20-44489835-7");
       Impuesto impuesto = new Impuesto( 25000, contribuyente);
       
       Calculadora calcular = new Calculadora();
       calcular.calcular(impuesto);
       
       
        */
        
        System.out.println(" EJERCICIO 13");
        /*
        CLASES
        
        public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    public class CodigoQr {
    
    private String valor;
    private Usuario usuario;

    public CodigoQr(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "CodigoQr{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
public class GeneradorQr {
    
    public void generar(String valor, Usuario usuario){
        CodigoQr qr = new CodigoQr(valor, usuario);
        System.out.println(" QR GENERADO " + qr);
    }
        MAIN 
        public class Principal11 {

  
    public static void main(String[] args) {
        
      Usuario usuario = new Usuario(" MATIAS ", "MATIAS@GMAIL.COM");
      GeneradorQr qr = new GeneradorQr();
      
      qr.generar("CBU : 123123", usuario);
      
        */
        System.out.println(" EJERCICIO 14 ");
        
        /*
        CLASES 
        
        public class Proyecto {
    
    private String nombre;
    private String duracionMin;

    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
    public class Render {
    
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    public class Editor {
    
    public void EditorV(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        
        System.out.println(" EXPORTANDO..." + render);
        
        MAIN 
        
        public static void main(String[] args) {
        
        Proyecto proyecto = new Proyecto ( "VAC CATARATAS ", " 5 MIN");
        
        
        Editor editor = new Editor();
        editor.EditorV( " 4K ", proyecto);
    }
        */
    }
    
    
}

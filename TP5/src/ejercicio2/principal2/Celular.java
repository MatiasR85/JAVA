
package principal2;


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

    
    
    }
    
    


  
  
    
    
  

         
 


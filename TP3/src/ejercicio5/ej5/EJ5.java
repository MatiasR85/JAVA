
package ej5;

public class EJ5 {

    
    public static void main(String[] args) {
    Nave nave1 = new Nave("River", 52);
    
    nave1.avanzar(60);
    
    nave1.recargarCombustible(30);
    
    nave1.despegar();
    nave1.avanzar(30);
    
    nave1.mostrarDatos();
    }
    
}

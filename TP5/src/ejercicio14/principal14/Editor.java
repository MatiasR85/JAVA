
package principal14;


public class Editor {
    
    public void EditorV(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        
        System.out.println(" EXPORTANDO..." + render);
        
    }
}

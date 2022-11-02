
package ruleta_rusa;

public class NodosLj {
    String nombre, apellido;
    NodosLj sig;
    Boolean Revolver;


    NodosLj (String d1,String d2) {
        this.nombre =d1;
        this.apellido = d2;
        this.sig=null;
    }   
    boolean disparar (){
        Revolver fuego = new Revolver();
        return fuego.disparar();
        
    }
    
    

}


package ruleta_rusa;

public class NodosL {
    String nombre, apellido;
    NodosL sig;
    Boolean Revolver;


    NodosL (String d1,String d2) {
        this.nombre =d1;
        this.apellido = d2;
        this.sig=null;
        Revolver fuego = new Revolver();
        this.Revolver = fuego.disparar();
    }   

}

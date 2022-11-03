
package ruleta_rusa;

public class NodosLj {
    Jugador jug;
    NodosLj sig;

    public NodosLj(Jugador jug, NodosLj sig) {
        this.jug = jug;
        this.sig = sig;
    }

    public NodosLj(String nom, String ape){
        this.jug = new Jugador(nom, ape);
        this.sig = null;
    }
    
   
    
}


package ruleta_rusa;

public class NodosLj {
    Jugador player;
    NodosLj sig;

    public NodosLj(Jugador player, NodosLj sig) {
        this.player = player;
        this.sig = sig;
    }

    public NodosLj(String nom, String ape){
        this.player = new Jugador(nom, ape);
        this.sig = null;
    }
    
   
    
}

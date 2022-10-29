
package ruleta_rusa;

public class Jugadores {
    int n_jugador;
    String nombre;
    boolean vivo;

 public Jugadores (int identifier) {
    this.n_jugador= identifier;
    this.nombre= " Jugador " + identifier;
    this.vivo= true;
    
}
  public void Disparar(Revolver d) {
 
        System.out.println(" El " + nombre + " está preparado para disparar ");
        
        if (d.disparar()) {
            this.vivo = false;
            System.out.println(" El " + nombre + " muere y sale del juego ");
        } else {
            System.out.println(" El " + nombre + " sigue en pie y en el juego ");
        }

    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}

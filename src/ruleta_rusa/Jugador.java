
package ruleta_rusa;
import java.io.*;



public class Jugador {
    String n_jugador;
    String nombre, apellido;
    int n_rondas;
    boolean vivo;

 public void Jugador () {
    this.n_jugador = nombre + apellido;
    this.vivo= true; 
    this.n_rondas = 0;          
}

 //Se crean los métodos de la clase basándonos en qué acciones puede realizar el jugador en el programa
 
 
 public void Disparar(Revolver d) {
 
        System.out.println(" El " + nombre + " está preparado para disparar ");
        
        if (d.disparar()) {
            this.vivo = false;
            System.out.println(" El " + nombre + " muere y sale del juego ");
        } else {
            System.out.println(" El " + nombre + " sigue en pie y en el juego ");
        }

  }
 
 public void Morir() {
          this.vivo = false;
        }  

}

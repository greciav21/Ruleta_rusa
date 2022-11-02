
package ruleta_rusa;
import java.io.*;



public class Jugador {
    String nombre, apellido;
    int rondas;
    Revolver revolver;
    boolean vivo;
    

 //Se crean los métodos de la clase basándonos en qué acciones puede realizar el jugador en el programa

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rondas = 0;
        this.revolver = new Revolver();
        this.vivo = true;
    }

 public void Disparar(Jugador enfrente) { 
        if (revolver.disparar()) {
            enfrente.Morir();
            System.out.println(this.nombre + " " + this.apellido + "ha disparado al jugador" + enfrente.nombre + " " + enfrente.apellido );
        } else{
            System.out.println(nombre +" " +apellido + " no disparo");
        }

  }
                
 public void Morir() {
          this.vivo = false;
        }  

}

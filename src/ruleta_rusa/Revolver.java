
package ruleta_rusa;

public class Revolver {
    public int PosicionRecamaraActual;
    public int PosicionRealBala;
    public boolean cargado;

public Revolver() {
       this.PosicionRecamaraActual  = (int) (Math.random()* 5 + 1);
       this.PosicionRealBala = (int) (Math.random()* 5 + 1);
       this.cargado = true;
    }

 public boolean disparar() {
        if (PosicionRecamaraActual == PosicionRealBala) {
          this.cargado = false;
          return true;
        }  
            PosicionRecamaraActual++;
        return false;
      
 }
 
}




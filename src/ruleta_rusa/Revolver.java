
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
        if (cargado){
            if (PosicionRecamaraActual == PosicionRealBala) {
                this.cargado = false;
                return true;
            }
            if (this.PosicionRecamaraActual == 6){
                PosicionRecamaraActual = 0;
            }else{
                this.PosicionRecamaraActual++;
            }
            return false;  
        }else{
            return false;
        }  
    }    
}       
     
 





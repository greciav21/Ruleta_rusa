
package ruleta_rusa;

public class Revolver {
    private int PosicionRecamaraActual;
    private int PosicionRealBala;

public Revolver() {
       int PosicionRecamaraActual = (int) (Math.random()* 6 + 1);
       int PosicionRealBala = (int) (Math.random()* 6 + 1);
    }

    boolean disparar() {

        boolean Fuego = true;

        if (PosicionRecamaraActual == PosicionRealBala) {

            Fuego = false;
        }
        return Fuego;
    }

    public void siguienteTiro() {

        if (PosicionRecamaraActual == 6) {
            PosicionRecamaraActual = 1;
        } else {
            PosicionRecamaraActual++;
        }
    }

}

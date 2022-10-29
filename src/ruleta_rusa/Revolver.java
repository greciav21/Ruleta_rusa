/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta_rusa;

public class Revolver {
    private int PosicionRecamaraActual;
    private int PosicionRealBala;

public Revolver() {
       int PosicionRecamaraActual = (int) (Math.random()* 6 + 1);
       int PosicionRealBala = (int) (Math.random()* 6 + 1);
    }

    boolean disparar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


package ruleta_rusa; 


public class Ruleta_rusa {
    public static void main(String[] args) {      
           //lista circular jugadores
    Listajugadores_ listaJugadores = new Listajugadores_();
    //crear jugador
    Jugadores Nombre = new Jugadores ();
    //jugador en lista circular
    listaJugadores.Ingresenodo(Nombre);
    //mostrar lista
    listaJugadores.Desplegarnodo();
         System.out.println(Nombre.isVivo());
         Nombre.creararchivoregist( "ganadores.out");
         Nombre.creararchivoregist( "perdedores.out");
         
    Jugadores a = new Jugadores();
    
    System.out.println(a.leerarchivo("ganadores.out"));
    } 
}


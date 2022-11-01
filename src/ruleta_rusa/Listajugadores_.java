
package ruleta_rusa;

public class Listajugadores_ {
       NodosL primer;
       NodosL ultimo; 
public Listajugadores_(){
    primer = null;
    ultimo= null;
}
public void Ingresenodo (Jugadores dato){ //primero se apunta a si mismo
    NodosL nuevo = new NodosL();
    System.out.println("Ingrese dato de jugador nuevo");
    nuevo.dato = dato;
    if (primer == null){
        primer = nuevo;
        ultimo = primer;
        primer.siguente = ultimo;
    }else{
        ultimo.siguente = nuevo;
        nuevo.siguente = primer;
        ultimo = nuevo;
    }
    System.out.println("Jugador ingresado exitosamente");
}
public void Desplegarnodo(){ //recorrer
    NodosL Act = new NodosL();
    Act = primer;
    if(primer != null){
        do{
            System.out.println(Act.dato);
            Act = Act.siguente;
        }while(Act != primer);
            
    }else {
            System.out.println("Lista encontrada vacia");       
        }

    } 
public void Eliminarnodo (Jugadores dato){ 
    NodosL Act = new NodosL();
   NodosL anterior = new NodosL();
    Act = primer;
    anterior = ultimo;
    do{
        if (Act.dato == dato ){
        if (Act == primer){
            primer = primer.siguente;
            
            ultimo.siguente = primer;   
     } else if(Act == ultimo){
         anterior.siguente= ultimo.siguente;
         ultimo = anterior;
     }else {
         anterior.siguente = Act.siguente;
             }
     }
    
        anterior = Act;
        Act = Act.siguente;
   }while ( Act != primer);
  }
 }

 

 
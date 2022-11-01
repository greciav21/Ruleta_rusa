package ruleta_rusa;

import java.util.Scanner;
import java.io.*;
import java .io.EOFException;

public class Listajugadores_ {
       NodosL primer;
       NodosL ultimo; 

    public Listajugadores_() {
        this.primer = null;
        this.ultimo = null;
    }
    String [] datos;
    public void add(String d1, String d2){
        NodosL newnodo = new NodosL(d1, d2);
    if (primer == null){
        primer = newnodo;
        ultimo = primer;
        primer.sig = ultimo;
    }else{
        ultimo.sig = newnodo;
        newnodo.sig= primer;
        ultimo = newnodo;
    }
}
    public void ingresando () throws IOException{
        Scanner file = new Scanner (new File("participandes.txt"));
        while(file.hasNextLine()){
            String [] array;
            array = file.nextLine().split(";");
            this.add(array[0], array[1]);
        }
    }
public void Desplegarnodo(){ //recorrer
    NodosL aux = primer;
        if(primer != null){
        do{
            System.out.println(aux.nombre + " " + aux.apellido);
            aux = aux.sig;
        }while(aux != primer);
            
    }else {
            System.out.println("Lista encontrada vacia");       
        }

    } 
public void Eliminarnodo (String nombre){ 
    NodosL Act = primer;
    NodosL anterior = ultimo;
    do{
        if (Act.nombre.equals(nombre) ){
        if (Act == primer){
            primer = primer.sig;
            ultimo.sig = primer;   
     } else if(Act == ultimo){
         anterior.sig= ultimo.sig;
         ultimo = anterior;
     }else {
         anterior.sig = Act.sig;
             }
     }   
        anterior = Act;
        Act = Act.sig;
   }while ( Act != primer);
  }
 }


package ruleta_rusa;

import java.util.Scanner;
import java.io.*;
import java .io.EOFException;

public class Listajugadores_ {
       NodosLj primer;
       NodosLj ultimo; 

       //
       public Listajugadores_() { 
        this.primer = null;
        this.ultimo = null;

    }
    String [] datos;
    public void add(String d1, String d2){
        NodosLj newnodo = new NodosLj(d1, d2);
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
    
    //Para agregar el archivo que contiene los jugadores
    public void ingresando () throws IOException{
        Scanner file = new Scanner (new File("participandes.txt"));
        while(file.hasNextLine()){
            String [] array;
            array = file.nextLine().split(";");
            this.add(array[0], array[1]);
        }
    }
    
    //Para resetear el archivo de ganador y perdedores entre partidas
    public void Restaurararchivo () throws IOException{
        try ( FileWriter filew = new FileWriter ("Perdedores.txt");
            BufferedWriter BufW = new  BufferedWriter(filew);
            PrintWriter x = new PrintWriter (BufW))
       {
           x.println();
    
    } catch (IOException e){
            }
        
        try ( FileWriter filew = new FileWriter ("Ganador.txt");
            BufferedWriter BufW = new  BufferedWriter(filew);
            PrintWriter x = new PrintWriter (BufW))
       {
           x.println();
    
    } catch (IOException e){
            }     
    }
    
    //Para mostrar la lista
    public void Desplegarnodo(){ 
    NodosLj aux = primer;
        if(primer != null){
        do{
            System.out.println(aux.nombre + " " + aux.apellido);
            aux = aux.sig;
        }while(aux != primer);
            
    }else {
            System.out.println("Lista encontrada vacia");       
        }

    } 


   //Para eliminar un jugador de la lista, una vez sale del juego
    public void Eliminarnodo (String nombre){ 
    NodosLj Act = primer;
    NodosLj anterior = ultimo;
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


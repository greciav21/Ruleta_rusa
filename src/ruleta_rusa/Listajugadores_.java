package ruleta_rusa;

import java.util.Scanner;
import java.io.*;
import java .io.EOFException;

public class Listajugadores_ {
       NodosLj primer;
       
    public Listajugadores_() { 
        this.primer = null;
    }
    
    public void add(String nombre, String apellido){
        NodosLj newnodo = new NodosLj(nombre, apellido);
    if (primer == null){
        primer = newnodo;
        primer.sig = primer;
    }else{
        
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
    
   
 }


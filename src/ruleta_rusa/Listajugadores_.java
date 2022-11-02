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
    
    //Para que se puedan ir guardando los distintos archivos de texto de la ruleta
    public static void main(String[] args) {
           File x = new File("Participandes.txt");
           BufferedReader reader = null;
              try {
                  reader = new BufferedReader(new FileReader(x));
                  String linea = reader.readLine();
                  String datos="";
                  while(linea!=null){
                       datos+=linea;
                       reader.readLine();
                  }
              } 
              catch(IOException ex){
                  ex.printStackTrace();
                }
           File y = new File("Perdedores.txt");
              try {
                  reader = new BufferedReader(new FileReader(y));
                  String linea = reader.readLine();
                  String datos="";
                  while(linea!=null){
                       datos+=linea;
                       reader.readLine();
                  }
              } 
              catch(IOException ex){
                  ex.printStackTrace();
                }
           File z = new File("Ganador.txt");
              try {
                  reader = new BufferedReader(new FileReader(z));
                  String linea = reader.readLine();
                  String datos="";
                  while(linea!=null){
                       datos+=linea;
                       reader.readLine();
                  }
              } 
              catch(IOException ex){
                  ex.printStackTrace();
                }              
              }
    
   }


package ruleta_rusa;

import java.util.Scanner;
import java.io.*;
import java .io.EOFException;

public class Listajugadores_ {
       NodosLj L;
       
    public Listajugadores_() { 
        this.L = null;
    }
    public void aggNodo(String nombre, String apellido){
        NodosLj newnodo = new NodosLj(nombre, apellido);
    if (L == null){
        L = newnodo;
        L.sig = L;
    }else{
        NodosLj aux = L;
        while(aux.sig != L)
            aux = aux.sig;
        aux.sig = newnodo;
        newnodo.sig = L;  
    }
}
    
    public void mostrarList(){
        NodosLj aux = L;
        if (L != null){
            while (aux != L){
                System.out.println(aux.jug.nombre);
                aux = aux.sig;
            }
        }else{
            System.out.println(" La lista está vacía ");
        }
    }
  
    //Para agregar el archivo que contiene los jugadores
    public void ingresandoPart () throws IOException{
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
           public void guardarArchivos() {
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
                }              
              } 

    private void add(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }


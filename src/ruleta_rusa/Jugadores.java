
package ruleta_rusa;
import java.io.*;



public class Jugadores {
    String n_jugador;
    String nombre, apellido;
    int n_rondas;
    boolean vivo;

 public void Jugadores () {
    this.n_jugador = nombre + apellido;
    this.vivo= true; 
    this.n_rondas = 0;          
}

  public void Disparar(Revolver d) {
 
        System.out.println(" El " + nombre + " está preparado para disparar ");
        
        if (d.disparar()) {
            this.vivo = false;
            System.out.println(" El " + nombre + " muere y sale del juego ");
        } else {
            System.out.println(" El " + nombre + " sigue en pie y en el juego ");
        }

  }
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
               
     public String leerarchivo(String direccion){
        
        String txt = "";
        
        //Usamos aquí el try/catch para regular el manejo de errores dentro del método
        try{
            BufferedReader bf = new BufferedReader(new FileReader("ganadores.out"));
            String temp = "";
            String bfRead;
            
            //Este while se ejecutará siempre y cuando bfRead almacene un dato
            while((bfRead =bf.readLine()) != null){
                temp = temp + bfRead;
            }
            txt = temp;
        
        }catch(IOException e){
            
            System.err.println("Archivo no encontrado");
            
        }
        
        return txt;
    }
}

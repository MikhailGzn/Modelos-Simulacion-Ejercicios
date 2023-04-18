import java.util.Random;
public class Mesero{
    private boolean ocupado;
    private int tiempoOcupado;
    public Mesero(){
        ocupado = false;
        tiempoOcupado = 0;
    }
    private static int atencionRapida(){
       double x=Math.random();
       if (x<0.3){
        return 2;
       }
       else if (x<58){
        return 3;
       }
       else if (x<87){
        return 4;
       }
       else{
        return 5;
       }
    }
       private static int atencionLenta(){
         double x=Math.random();
         if (x<0.35){
          return 3;
         }
         else if (x<60){
          return 4;
         }
         else if (x<80){
          return 5;
         }
         else{
          return 6;
         }
    }
    public int atenderRapido(){
        ocupado = true;
        tiempoOcupado = atencionRapida();
        return tiempoOcupado;
    }
    public int atenderLento(){
        ocupado = true;
        tiempoOcupado = atencionLenta();
        return tiempoOcupado;
    }
    public void desocupado(){
        ocupado = false;
        tiempoOcupado = 0;
    }
    public boolean getOcupado(){
        return ocupado;
    }   
    public int getTiempoOcupado(){
        return tiempoOcupado;
    }
}
// Que informacion recolecta la clase Salida?
import java.util.Queue;
import java.util.LinkedList;
public class Salida {
    private int clock;
    public Salida(int clock)
    {
        this.clock = clock;
    }
    public void salida(Mesero able, Mesero bakes, Queue<Arribo> cola){
        if (cola.isEmpty() == true){
            if (able.getTiempoOcupado()<this.clock){
                able.desocupado();
            }
            else if (bakes.getTiempoOcupado()<this.clock){
                bakes.desocupado();
            }            
        }
        else{
            Arribo arribo=cola.poll();
            arribo.arribo(able, bakes, cola);            
        }
    }
    @Override
    public String toString() {
        return "Salida [clock=" + clock + "]";
    }
}

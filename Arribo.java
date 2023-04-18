// Que informacion recolecta la clase Arribo?

import java.lang.*;
import java.util.LinkedList;
import java.util.Queue;
public class Arribo {
    int clock;    
    public Arribo(int clock)
    {
        this.clock = clock;
    }

    public static int tiempoEntreArribos(){
        double x=Math.random();
        if (x<0.25){
            return 1;
        }
        else if (x<0.65){
            return 2;
        }
        else if (x<0.85){
            return 3;
        }
        else{
            return 4;
        }
    }
    
    public int planificarProximoArribo(){
        return clock+tiempoEntreArribos();
    }

    public int arribo(Mesero able, Mesero bakes, Queue<Arribo> cola){
        int tiempoS=0;
        double x=Math.random();
        if (able.getOcupado() == false && bakes.getOcupado() == false){
           if (x < 0.5)  tiempoS=able.atenderRapido();
           else tiempoS=bakes.atenderRapido();
        }
        else if (bakes.getOcupado() == false){
           tiempoS=bakes.atenderLento();
        }
        else if (able.getOcupado() == false){
            tiempoS=able.atenderLento();
        }
        else{
            cola.add(new Arribo(clock));
        }        
        return tiempoS;
    }
    
}
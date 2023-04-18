// Como avanza clock?

import java.util.LinkedList;
import java.util.Queue;

public class Simulacion {

    private static final float SIMULATION_LENGHT = 60;
    
    public static void main(String[] args) {
        int clock = 0;
        Queue<Arribo> cola = new LinkedList<Arribo>();        
        Queue<Salida> cola2 = new LinkedList<Salida>();
        Mesero able = new Mesero();
        Mesero bakes = new Mesero();
        while (clock < SIMULATION_LENGHT) {
            Arribo arribo = new Arribo(clock);
            arribo.arribo(able, bakes, cola);
            Salida salida = new Salida(clock);
            salida.salida(able, bakes, cola);
            cola2.add(salida);
            clock=arribo.planificarProximoArribo();
        }
        System.out.println("cola2: " + cola2);
    }
}   
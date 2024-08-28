package practico2;

import java.util.Random;

public class RelojFit extends Reloj {

    public RelojFit(int dia, int hora, String modelo, int serie) {
        super(dia, hora, modelo, serie);
    }

    public void contarPasos(int x, int y) {
        int pasosTotal = x + y;
        System.out.println("Los pasos desde x: " + x + " hasta y: " + y);
        System.out.println("La cantidad de pasos fue de: " + pasosTotal);
    }

    public void frecuenciaAletoria() {
        Random rand = new Random();
        int frecuencia = rand.nextInt(200);
        System.out.println("frecuencia : " + frecuencia);
    }
}

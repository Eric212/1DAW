package Tema04.Bucles;

import java.util.Random;

public class Ejercicio13BuclesTema4 {
    public static void main(String[] args) {
        Random r = new Random();
        int lanzamientos;
        int cara = 0;
        int cruz = 0;
        int tirada;
        int resultado;
        for (lanzamientos = 0; lanzamientos <= 1000000; lanzamientos++) {
            tirada = r.nextInt(2);
            if (tirada == 1) {
                cara++;
            } else {
                cruz++;
            }
            if (lanzamientos == 1000000) {
                resultado = cara / 10000;
                System.out.print("El porcentaje de cara es:" + resultado + "\u0025\n");
                resultado = cruz / 10000;
                System.out.print("El porcentaje de cruz es:" + resultado + "\u0025\n");
            }
        }
    }
}
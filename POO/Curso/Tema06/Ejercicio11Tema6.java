package Tema06;

import java.util.Random;

public class Ejercicio11Tema6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int resultado = aleatorio();
            quiniela(resultado, i);
        }
    }

    static int aleatorio() {
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(3) + 1;
        return resultado;
    }

    static void quiniela(int aleatorio, int partido) {
        int resultado = aleatorio;
        if (resultado < 3) {
            System.out.println("Partido " + partido + " resultado " + resultado);
        } else {
            System.out.println("Partido " + partido + " resultado X");
        }
    }
}
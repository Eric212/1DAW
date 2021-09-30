package Tema04.Bucles;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio12BuclesTema4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner lector = new Scanner(System.in);
        int intentos;
        boolean gameover = true;
        int numeroIntroducido;
        int contador = 0;
        int numeroAleatorio = aleatorio.nextInt(100) + 1;
        System.out.print("Bienvenido a adivina el numero secreto\nDime el numero de intentos que quieres: ");
        intentos = lector.nextInt();
        System.out.print("\u001B[H\u001B[2J");
        do {
            System.out.print("\nIntroduzca su numero: ");
            numeroIntroducido = lector.nextInt();
            while (numeroIntroducido < 0 || numeroIntroducido > 100) {
                System.out.print("Introduce un numero entre el 1 y 100\nNumero: ");
                numeroIntroducido = lector.nextInt();
            }
            if (numeroIntroducido == numeroAleatorio) {
                System.out.print("Enhorabuena has acertado el numero\n");
                gameover = false;

            } else {
                System.out.print("Lo sentimos has fallado\n");
                if (numeroIntroducido > numeroAleatorio) {
                    System.out.print("Te has pasado, el numero secreto es menor que el que has puesto\n");
                } else if (numeroIntroducido < numeroAleatorio) {
                    System.out.print("Te has quedado corto, el numero secreto es mayor que el que has puesto\n");
                }
                contador++;
            }
        }
        while (contador <= intentos && gameover == true);
        if (gameover == false) {
            System.out.print("Has ganado\n");
        } else {
            System.out.print("Has perdido\n");
        }
    }
}
package Tema03;

import java.util.Scanner;

public class Ejercicio12Tema3 {
    public static void main(String arg[]) {
        Scanner lector = new Scanner(System.in);
        double dividendo;
        double divisor;
        System.out.println("Introduce un numero que quieres divir");
        dividendo = lector.nextDouble();
        System.out.println("Introduce el numero que dividira al primero");
        divisor = lector.nextDouble();
        double resusltado = dividendo / divisor;
        System.out.println("La division: " + dividendo + " - " + divisor + " da como resusltado = " + resusltado);

    }
}
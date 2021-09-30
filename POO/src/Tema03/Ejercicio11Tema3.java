package Tema03;

import java.util.Scanner;

public class Ejercicio11Tema3 {
    public static void main(String arg[]) {
        Scanner lector = new Scanner(System.in);
        double minuendo;
        double sustraendo;
        System.out.println("Introduce un numero que quieres restar");
        minuendo = lector.nextDouble();
        System.out.println("Introduce el numero que restaras al primero");
        sustraendo = lector.nextDouble();
        double resusltado = minuendo - sustraendo;
        System.out.println("La resta: " + minuendo + " - " + sustraendo + " da como resusltado = " + resusltado);

    }
}
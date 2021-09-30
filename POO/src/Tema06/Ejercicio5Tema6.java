package Tema06;

import java.util.Scanner;

public class Ejercicio5Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char caracter;
        int veces;
        System.out.println("Introduce el caracter y el numero de veces que deseas que aparezca por pantalla");
        caracter = lector.next().charAt(0);
        lector.nextLine();
        veces = lector.nextInt();
        imprimir(caracter, veces);
    }

    static char imprimir(char caracter, int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.print(caracter + "-");
        }
        System.out.println();
        return caracter;
    }
}
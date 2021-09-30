package Tema06;

import java.util.Scanner;

public class Ejercicio6Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char caracter;
        int vecesLinea;
        int lineas;
        System.out.println("Introduzca el caracter a mostrar");
        caracter = lector.next().charAt(0);
        System.out.println("Introduzca el numero de veces que se repetira en la linea");
        vecesLinea = lector.nextInt();
        System.out.println("Introduzca el numero de lineas en las que se repetira");
        lineas = lector.nextInt();
        impresion(caracter, vecesLinea, lineas);
    }

    static void impresion(char caracter, int vecesLinea, int lineas) {
        for (int i = 1; i <= lineas; i++) {
            System.out.print("\n");
            for (int x = 1; x <= vecesLinea; x++) {
                System.out.print(caracter + " ");
            }
        }
    }
} 
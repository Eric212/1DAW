package Tema06;

import java.util.Scanner;

public class Ejercicio18Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dni;
        char letra;
        System.out.println("Dime tu DNI sin la letra");
        dni = lector.nextInt();
        letra = letra(dni);
        System.out.println("Tu DNI es: " + dni + letra);
    }

    static char letra(int num) {
        int dni = num % 23;
        char letra;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra = letras[dni];
        return letra;
    }
} 
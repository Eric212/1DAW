package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio11BuclesTema4 {
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int contador = 0;
        int media = 0;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número: ");
            num = lector.nextInt();
            if (num >= 0) {
                suma = suma + num;
                contador++;
            }
        }
        while (num >= 0);
        media = suma / (contador);
        System.out.println("La media es: " + media);
    }
}
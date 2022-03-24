package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio10BuclesTema4 {
    public static void main(String[] args) {
        int num;
        int suma = 0;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número: ");
            num = lector.nextInt();
            suma = suma + num;
        }
        while (num != 0);
        System.out.println("La suma total da: " + suma);
    }
}
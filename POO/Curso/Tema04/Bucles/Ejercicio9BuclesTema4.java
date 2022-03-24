package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio9BuclesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introudce el numero que quieras comprobar si es primo");
        int numero = lector.nextInt();
        lector.nextLine();
        int x = 0;
        int contador;
        for (contador = 1; contador <= numero; contador++) {
            if (numero % contador == 0) {
                x++;
            }
        }
        if (x <= 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
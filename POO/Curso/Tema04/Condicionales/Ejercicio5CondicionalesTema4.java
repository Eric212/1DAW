package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio5CondicionalesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nota;
        int control = 1;
        System.out.println("Introduce la nota");
        nota = lector.nextInt();
        while (control == 1) {
            if (nota < 5 && nota >= 0) {
                System.out.println("Insuficiente");
                control = 2;
            } else if (nota == 5) {
                System.out.println("Suficiente");
                control = 2;
            } else if (nota == 6) {
                System.out.println("Bien");
                control = 2;
            } else if (nota > 6 && nota < 9) {
                System.out.println("Notable");
                control = 2;
            } else if (nota > 8 && nota <= 10) {
                System.out.println("Sobresaliente");
                control = 2;
            } else {
                System.out.println("Nota no valida");
                while (nota < 0 || nota > 10) {
                    System.out.println("Introduce una nota valida entre 0 y 10");
                    nota = lector.nextInt();
                }
            }
        }
    }
}
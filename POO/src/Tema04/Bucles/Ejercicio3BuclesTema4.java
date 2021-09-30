package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio3BuclesTema4 {
    public static void main(String[] args) {
        int numeroUno;
        int numeroDos;
        int resultado = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numeroUno = lector.nextInt();
        lector.nextLine();
        System.out.println("Introduce un numero");
        numeroDos = lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < numeroUno; i++) {
            if (numeroUno == 1) {
                resultado = numeroDos;
            } else {
                if (numeroDos == 1) {
                    resultado = numeroUno;
                } else {
                    resultado = numeroDos + numeroDos;
                }
            }
        }
        System.out.println(resultado);
    }
}
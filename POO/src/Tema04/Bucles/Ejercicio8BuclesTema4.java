package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio8BuclesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int contador;
        int resultado = 1;
        System.out.println("Introduce el numero del cual quieras calcular el factorial");
        numero = lector.nextInt();
        if (numero == 0) {
            System.out.println("1");
        } else {
            for (contador = numero; contador > 0; contador--) {
                resultado = resultado * contador;
                if (contador == 1) {
                    System.out.println(resultado);
                }
            }
        }
    }
}
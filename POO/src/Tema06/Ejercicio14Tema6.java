package Tema06;

import java.util.Scanner;

public class Ejercicio14Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int m;
        int n;
        int mSobreN;
        int resultado;
        System.out.println("Introduce dos numeros de los cuales quieras sacar el coeficiente binomial");
        m = lector.nextInt();
        n = lector.nextInt();
        resultado = mSobreN(m, n);
        System.out.println("El coeficiente binomial es: " + resultado);

    }

    static int factorial(int num1) {
        int factorial = 1;
        if (num1 == 0) {
            System.out.println("1");
        } else {
            for (int contador = num1; contador > 0; contador--) {
                factorial = factorial * contador;
            }
        }
        return factorial;
    }

    static int mSobreN(int m, int n) {
        int resultado;
        if (m > n) {
            resultado = factorial(m) / (factorial(n) * factorial((m - n)));
        } else {
            System.out.println("No se a cumplido la condicion de que el primer numero sea mayor que el segundo");
            resultado = 0;
        }
        return resultado;
    }
}
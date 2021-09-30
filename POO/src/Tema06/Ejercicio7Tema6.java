package Tema06;

import java.util.Scanner;

public class Ejercicio7Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        int resultado;
        System.out.println("Introduce el numero del cual quiereas saber su factorial");
        num = lector.nextInt();
        resultado = factorial(num);
        System.out.println(resultado);
    }

    static int factorial(int num) {
        int resultado = 1;
        if (num == 0) {
            System.out.println("1");
        } else {
            for (int contador = num; contador > 0; contador--) {
                resultado = resultado * contador;

            }
        }
        return resultado;
    }
}
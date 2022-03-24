package Tema06;

import java.util.Scanner;

public class Ejercicio9Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num, resultado;
        System.out.println("Introduce el numero del cual quieres saber el sumatorio");
        num = lector.nextInt();
        resultado = sumatorio(num);
        System.out.println("El sumatorio de " + num + " es " + resultado);
    }

    static int sumatorio(int num) {
        int resultado = 0;
        for (int i = num; i > 0; i--) {
            resultado = resultado + i;
            if (i > 1) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "\n");
            }
        }
        return resultado;
    }
}
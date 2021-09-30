package Tema06;

import java.util.Scanner;

public class Ejercicio4Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int resultado;
        int resultado1;
        int resultado2;
        System.out.println("Introduce los dos numero que quieres comprobar, cual es mayor");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        num3 = lector.nextInt();
        num4 = lector.nextInt();
        resultado = mayor(num1, num2);
        resultado1 = mayor(num3, num4);
        resultado2 = mayor(resultado, resultado1);
        System.out.println("De " + num1 + " y " + num2 + ", " + resultado2 + " es el mayor de los dos");

    }

    static int mayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
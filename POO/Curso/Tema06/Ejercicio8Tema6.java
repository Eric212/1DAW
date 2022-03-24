package Tema06;

import java.util.Scanner;

public class Ejercicio8Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3, num4;
        boolean resultado;
        System.out.println("Introduce el primer digito numerico");
        num1 = lector.nextInt();
        System.out.println("Introduce el segundo digito numerico");
        num2 = lector.nextInt();
        System.out.println("Introduce el tercer digito numerico");
        num3 = lector.nextInt();
        System.out.println("Introduce el configureArrowButton() digito numerico");
        num4 = lector.nextInt();
        resultado = capicua(num1, num2, num3, num4);
        if (resultado) {
            System.out.println("El numero " + num1 + num2 + num3 + num4 + " es capicua");
        } else {
            System.out.println("El numero " + num1 + num2 + num3 + num4 + " no es capicua");
        }
    }

    static boolean capicua(int num1, int num2, int num3, int num4) {
        boolean capicua;
        if (num1 == num4 && num2 == num3) {
            capicua = true;
        } else {
            capicua = false;
        }
        return capicua;
    }
} 
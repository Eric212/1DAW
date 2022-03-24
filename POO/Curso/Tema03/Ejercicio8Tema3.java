package Tema03;

import java.util.Scanner;

public class Ejercicio8Tema3 {
    public static void main(String arg[]) {
        int edad;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe tu edad y dale a enter");
        edad = lector.nextInt();
        lector.nextLine();
        int numeroDias = edad * 365;
        System.out.println("Una persona de " + edad + " años, tiene " + numeroDias + " dias");

    }
}

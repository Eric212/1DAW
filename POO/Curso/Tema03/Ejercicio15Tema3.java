package Tema03;

import java.util.Scanner;

public class Ejercicio15Tema3 {
    public static void main(String arg[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una temperatura en grados Celsius");
        double celsius = lector.nextDouble();
        lector.nextLine();
        double kelvin = 273.15 + celsius;
        double fahrenheint = celsius * (9 / 5) + 32;
        System.out.println(celsius + "ºC equivale en Kelvin a: " + kelvin + "K y en Fahrenheint equivale a: " + fahrenheint + "ºF");
    }
}
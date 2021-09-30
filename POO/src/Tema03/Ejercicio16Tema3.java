package Tema03;

import java.util.Scanner;

public class Ejercicio16Tema3 {
    public static void main(String arg[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el importe de Euros que desea convertir a Dólares y Libras");
        float euros = lector.nextFloat();
        lector.nextLine();
        float dolares = euros * 1.17417f;
        float libras = euros * 0.91000f;
        System.out.println(euros + "€ equivale en Dólares a: " + dolares + "$ y equivale en Libras a: " + libras + "\u00A3");
    }
}
package Tema04;

import java.util.Scanner;

public class RectanguloTema4 {
    public static void main(String[] args) {
        int alto;
        int ancho;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el alto del rectangulo");
        alto = lector.nextInt();
        lector.nextLine();
        System.out.println("Introduce el ancho del rectangulo");
        ancho = lector.nextInt();
        lector.nextLine();
        int area = ancho * alto;
        int perimetro = 2 * alto + 2 * ancho;
        System.out.println("El área del rectangulo de alto " + alto + " y de ancho " + ancho + " es: " + area + "cm");
        System.out.println("El perímetro de rectangulo de de alto " + alto + " y de ancho " + ancho + " es: " + perimetro + "cm\u00b2");
    }
}
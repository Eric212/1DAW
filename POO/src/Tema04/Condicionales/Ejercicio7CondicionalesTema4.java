package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio7CondicionalesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        int socios;
        float descuento;
        System.out.print("Introduzca su edad \nEdad: ");
        edad = lector.nextInt();
        if (edad > 65) {
            descuento = 500f - 500f * 0.50f;
            System.out.println("Las personas mayores de 65 años tiene un 50% de descuento, asi que la cuota es de: " + descuento + "€");
        } else if (edad < 18) {
            System.out.print("Tu padrte es socio\n1:Si            2:No\nEleccion: ");
            socios = lector.nextInt();
            while (socios < 1 || socios > 2) {
                System.out.print("Introduce una eleccion valida entre 1 y 2");
                socios = lector.nextInt();
            }
            if (socios == 1) {
                descuento = 500f - 500f * 0.35f;
                System.out.println("Los menores de edad con padres socios tienen un descuento del 35%, asi que la cuota es: " + descuento + "€");
            } else {
                descuento = 500f - 500f * 0.25f;
                System.out.println("Los menores de edad sin padres socios tienen un descuento del 25%, asi que la cuota es: " + descuento + "€");
            }
        } else {
            System.out.println("La cuota es de 500€");
        }
    }
}
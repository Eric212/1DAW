package Tema06;

import java.util.Scanner;

public class Ejercicio13Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        int opcion;
        System.out.println("Escriba su nombre");
        nombre = lector.nextLine();
        System.out.print("Eliga el idioma que prefiera:\n1:Valenciano/Valencia\n2:Castellano\n3:Ingles\nNumero de la opcion: ");
        opcion = lector.nextInt();
        System.out.print("\u001B[H\u001B[2J");
        while (opcion < 1 || opcion > 3) {
            System.out.println("Introduce una opcion valida");
            opcion = lector.nextInt();
        }
        saludo(nombre, opcion);
    }

    static void saludo(String nombre, int opcion) {
        if (opcion == 1) {
            System.out.println("Hola " + nombre + ", Bon dia");
        } else if (opcion == 2) {
            System.out.println("Hola " + nombre + ", Buenos dias");
        } else {
            System.out.println("Hello " + nombre + ", Good morning");
        }
    }
}
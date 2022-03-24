package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio3CondicionalesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        int repetir = 1;
        do {
            System.out.print("Introudce tu edad\nEdad: ");
            edad = lector.nextInt();
            while (edad < 0 || edad > 130) {
                System.out.print("Introudce una edad valida edad\nEdad: ");
                edad = lector.nextInt();
            }
            if (edad < 18) {
                System.out.println("Eres menor de edad");
            } else {
                System.out.println("Eres mayor de edad");
            }
            System.out.print("¿Quieres comprobar otra edad?\n1:Si              2:No\nEleccion: ");
            repetir = lector.nextInt();
            System.out.print("\u001B[H\u001B[2J");
            while (repetir < 1 || repetir > 2) {
                System.out.print("Introduce una opcion valida entre 1 y 2\nEleccion: ");
                repetir = lector.nextInt();
                System.out.print("\u001B[H\u001B[2J");
            }
        }
        while (repetir == 1);
    }
}
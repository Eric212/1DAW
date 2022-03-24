package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio1CondicionalesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int repetir = 1;
        do {
            System.out.print("Introudce un numero\nNumero: ");
            numero = lector.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
            } else {
                System.out.println("El numero " + numero + " es impar");
            }
            System.out.print("¿Quieres comprobar otro numero?\n1:Si              2:No\nEleccion: ");
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
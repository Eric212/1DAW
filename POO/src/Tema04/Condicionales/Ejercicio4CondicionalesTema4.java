package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio4CondicionalesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double numeroUno;
        double numeroDos;
        int repetir = 1;
        do {
            System.out.print("Introduce dos numeros separados por espacio\nNumeros: ");
            numeroUno = lector.nextDouble();
            numeroDos = lector.nextDouble();
            if (numeroUno < numeroDos) {
                System.out.println(numeroUno + " es menor que " + numeroDos);
            } else {
                System.out.println(numeroDos + " es menor que " + numeroUno);
            }
            System.out.print("¿Quieres comprobar otros numeros?\n1:Si              2:No\nEleccion: ");
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
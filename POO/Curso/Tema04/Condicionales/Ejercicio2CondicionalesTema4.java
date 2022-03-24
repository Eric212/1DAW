package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio2CondicionalesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroUno;
        int numeroDos;
        int repetir = 1;
        do {
            System.out.print("Introudce dos numeros separados por espacio\nNumeros: ");
            numeroUno = lector.nextInt();
            numeroDos = lector.nextInt();
            if (numeroUno < numeroDos) {
                System.out.println("El primer numero " + numeroUno + " es menor que el segundo numero " + numeroDos);
            } else if (numeroUno == numeroDos) {
                System.out.println("El primer numero " + numeroUno + " es igual que el segundo numero " + numeroDos);
            } else {
                System.out.println("El primer numero " + numeroUno + " es mayor que el segundo numero " + numeroDos);
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
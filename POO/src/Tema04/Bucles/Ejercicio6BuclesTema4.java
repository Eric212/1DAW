package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio6BuclesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador;
        int tabla;
        int numero;
        int decision;
        do {
            System.out.print("Bienvenido a las tablas del 1 al 10\n¿Que tabla quieres mostrar?\n1:Tabla del 1\n2:Tabla del 2\n3:Tabla del 3\n4:Tabla del 4\n5:Tabla del 5\n6:Tabla del 6\n7:Tabla del 7\n8:Tabla del 8\n9:Tabla del 9\n10:Tabla del 10\n------------------------------------\nTabla:");
            tabla = lector.nextInt();
            lector.nextLine();
            while (tabla < 1 || tabla > 10) {
                System.out.println("Introduce un numero valido entre el 1 y el 10");
                tabla = lector.nextInt();
            }
            System.out.print("\u001B[H\u001B[2J");
            System.out.println("Tabla del " + tabla);
            for (contador = 1; contador <= 10; contador++) {
                numero = contador * tabla;
                System.out.println(numero);
            }
            System.out.println("¿Desea visualizar alguna tabla mas?\n1:Si                         2:No");
            decision = lector.nextInt();
            lector.nextLine();
            while (decision < 1 || decision > 2) {
                System.out.println("Introduce un numero valido, 1 o 2");
                tabla = lector.nextInt();
            }
            System.out.print("\u001B[H\u001B[2J");
        }
        while (decision == 1);
    }
}
package Tema06;

import java.util.Scanner;

public class Ejercicio10Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce el numero de la tabla que quieres mostrar");
            num = lector.nextInt();
            if (num >= 0) {
                System.out.print("\u001B[H\u001B[2J");
                tabla(num);
            }
        }
        while (num >= 0);
    }

    static void tabla(int tabla) {
        int numero;
        System.out.println("Tabla del " + tabla);
        for (int contador = 1; contador <= 10; contador++) {
            numero = contador * tabla;
            System.out.println(numero);
        }
    }
}

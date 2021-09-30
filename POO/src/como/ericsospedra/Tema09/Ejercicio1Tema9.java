package como.ericsospedra.Tema09;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1Tema9 {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        introducirNumeros();
    }

    public static void introducirNumeros() {
        int num = 0;
        do {
            try {
                System.out.print("Introduce numeros, cuando desee parar de introducir" +
                        " numeros, introduce un numero negativo\nNumero: ");
                num = lector.nextInt();
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
                System.out.print("Numero: " + num + "\n");
            } catch (InputMismatchException exaException) {
                System.out.print("No has introducido un numero, dale a enter para continuar ...\n");
                lector.nextLine();
                lector.nextLine();
            }
        } while (num >= 0);
    }
}

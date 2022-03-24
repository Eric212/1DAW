package como.ericsospedra.Tema09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4Tema9 {
    public static void main(String[] args) {
        int[] array = new int[5], array2 = new int[0];
        comprobarArray(array);
        comprobarArray(array2);
    }

    public static void comprobarArray(int[] array) {
        Scanner lector = new Scanner(System.in);
        boolean control = true;
        do {
            try {
                for (int i = 0; i < array.length; i++) {
                    array[i] = Integer.parseInt(lector.nextLine());
                }
                control = false;
            } catch (InputMismatchException IMEex) {
                System.out.print("No ha introducido un numero\n" + "Presione Enter para continuar...\n");
                lector.nextLine();
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            } catch (IndexOutOfBoundsException IOOBex) {
                System.out.print("Has sobrepasado el limite de la lista\n" + "Presione Enter para continuar...\n");
                lector.nextLine();
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            }
        }
        while (control);
    }
}

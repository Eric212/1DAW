import java.util.Scanner;

public class Ejercicio15Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int k = 1;
        int[] numeros = new int[20];
        System.out.println("A continuacion introduciras 20 valores");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el valor " + k);
            numeros[i] = lector.nextInt();
            k++;
        }
        formato(numeros);
    }

    static void formato(int[] numeros) {
        int k = 1;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%-10s", numeros[i] + " ");
            if (k % 4 == 0) {
                System.out.println();
            }
            k++;
        }
    }
}
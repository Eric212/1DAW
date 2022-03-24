import java.util.Scanner;

public class Ejercicio14Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char[] caracteres = new char[10];
        int k = 1;
        System.out.println("A continuacion introduciras 10 valores");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Introduce el valor " + k);
            caracteres[i] = lector.next().charAt(0);
            k++;
        }
        parImpar(caracteres, k);
    }

    static void parImpar(char[] caracteres, int k) {
        k = 1;
        for (int i = 0; i < caracteres.length; i++) {
            if (k % 2 == 0 && i != 0) {
                System.out.println("Valor " + k + ": " + caracteres[i] + " esta en una posicion par");
                System.out.println();
            } else {
                System.out.println("Valor " + k + ": " + caracteres[i] + " esta en una posicion impar");
                System.out.println();
            }
            k++;
        }
    }
}
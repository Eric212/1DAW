import java.util.Scanner;

public class Ejercicio6Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        int repeticiones;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        System.out.println("Introduce el numero de veces que quieras que se repita");
        repeticiones = lector.nextInt();
        repetirFrase(frase, repeticiones);
    }

    static void repetirFrase(String fraseOriginal, int repeticiones) {
        String[] frase = fraseOriginal.split(" ");
        for (int i = 0; i < repeticiones; i++) {
            for (int j = 0; j < frase.length; j++) {
                System.out.print(frase[j] + " ");
            }
            System.out.println();
        }
    }
}
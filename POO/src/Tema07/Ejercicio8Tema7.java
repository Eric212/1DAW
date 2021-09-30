import java.util.Scanner;

public class Ejercicio8Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        fraseColumnas(frase);
    }

    static void fraseColumnas(String frase) {
        String[] separacion = frase.split(" ");
        for (int i = 0; i < separacion.length; i++) {
            if (i == 2 || i % 2 == 0 && i != 0) {
                System.out.println();
                System.out.print(separacion[i] + "-" + separacion[i].length() + " ");
            } else {
                System.out.print(separacion[i] + "-" + separacion[i].length() + " ");
            }
        }
        System.out.println();
    }
}
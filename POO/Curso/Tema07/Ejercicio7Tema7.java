import java.util.Scanner;

public class Ejercicio7Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        int repeticiones;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        separarFrase(frase);
    }

    static void separarFrase(String frase) {
        String[] separacion = frase.split(" ");
        for (int i = 0; i < separacion.length; i++) {
            System.out.println(separacion[i]);
        }
    }
}
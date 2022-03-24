import java.util.Scanner;

public class Ejercicio9Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        fraseImpar(frase);
    }

    static void fraseImpar(String frase) {
        String fraseImpar = "";
        String[] palabra = frase.split(" ");
        for (int i = 0; i < palabra.length; i++) {
            for (int k = 0; k < palabra[i].length(); k++) {
                if (k == 0 || k % 2 == 0 && k != 1) {
                    fraseImpar = fraseImpar + Character.toString(palabra[i].charAt(k));
                }
            }
            fraseImpar = fraseImpar + " ";
            if (palabra.length - 1 == i) {
                System.out.println(fraseImpar);
            }
        }
    }
}
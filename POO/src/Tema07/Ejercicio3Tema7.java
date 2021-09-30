import java.util.Scanner;

public class Ejercicio3Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        int palabras;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        palabras = contarPalabras(frase);
        System.out.println("El numero de palabras de:\"" + frase + " es:" + palabras);
    }

    static int contarPalabras(String frase) {
        int palabras = 0;
        frase = frase.trim();
        String espacio = " ";
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toString(frase.charAt(i)).equals(espacio)) {
                palabras++;
            } else if (i == frase.length() - 1) {
                palabras++;
            }
        }
        return palabras;
    }
}
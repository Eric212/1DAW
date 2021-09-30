import java.util.Scanner;

public class Ejercicio4Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        contarPalabras(frase);
    }

    static void contarPalabras(String frase) {
        String palabra;
        int posicion = 0;
        System.out.println(frase.lastIndexOf(" "));
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                palabra = frase.substring(posicion, i).trim();
                posicion = i;
                vocalesConsonantes(palabra);
            } else if (i > frase.lastIndexOf(" ")) {
                palabra = frase.substring(i, frase.length());
                vocalesConsonantes(palabra);
                i = frase.length();
            }
        }
    }

    static void vocalesConsonantes(String frase) {
        int consonantes = 0;
        int vocales = 0;
        String fraseOriginal = frase;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toString(frase.charAt(i)).compareTo("a") < 0) {
            } else {
                if (Character.toString(frase.charAt(i)).equals("a") || Character.toString(frase.charAt(i)).equals("e") || Character.toString(frase.charAt(i)).equals("i") || Character.toString(frase.charAt(i)).equals("o") || Character.toString(frase.charAt(i)).equals("u")) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("La palabra=\"" + fraseOriginal + "\" contiene " + vocales + " vocales y " + consonantes + " consonantes");
    }
}
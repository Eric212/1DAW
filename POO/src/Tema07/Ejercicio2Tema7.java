import java.util.Scanner;

public class Ejercicio2Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        vocalesConsonantes(frase);
    }

    static void vocalesConsonantes(String frase) {
        int consonantes = 0;
        int vocales = 0;
        String fraseOriginal = frase;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toString(frase.charAt(i)).compareTo("a") < 0) {
            } else {
                if (Character.toString(frase.charAt(i)).equalsIgnoreCase("a") || Character.toString(frase.charAt(i)).equalsIgnoreCase("e") || Character.toString(frase.charAt(i)).equalsIgnoreCase("i") || Character.toString(frase.charAt(i)).equalsIgnoreCase("o") || Character.toString(frase.charAt(i)).equalsIgnoreCase("u")) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("La frase=\"" + fraseOriginal + "\" contiene " + vocales + " vocales y " + consonantes + " consonantes");
    }
}
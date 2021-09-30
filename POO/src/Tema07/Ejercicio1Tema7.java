import java.util.Scanner;

public class Ejercicio1Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        String convertida;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        convertida = primeraMayuscula(frase);
        System.out.println("Frase Original= " + frase + "\nFrase Convertida= " + convertida);
    }

    static String primeraMayuscula(String frase) {
        String convertida = frase.substring(0, 1).toUpperCase();
        String original = frase.substring(1, frase.length());
        String resultado = convertida + original;
        return resultado;
    }
}
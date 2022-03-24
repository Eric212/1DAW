import java.util.Scanner;

public class Ejercicio5Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        String palabraLarga;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        String[] palabras = frase.split(" ");
        palabraLarga = longitudPalabra(palabras);
        System.out.println("La palabra mas larga de la frase: \"" + frase + "\" es: " + palabraLarga);
    }

    static String longitudPalabra(String[] palabras) {
        String palabraLarga = "";
        int contador = 1;
        for (int i = 0; i < palabras.length; i++) {
            if (contador != palabras.length) {
                if (palabraLarga.length() > palabras[i].length()) {
                    palabraLarga = palabras[i];
                } else {
                    palabraLarga = palabras[contador];
                }
                contador++;
            }
        }
        return palabraLarga;
    }
}
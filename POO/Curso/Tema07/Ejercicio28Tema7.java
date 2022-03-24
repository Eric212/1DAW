import java.util.Random;

public class Ejercicio28Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int caracter = 65;
        int con = 0;
        String[] letra = new String[26];
        String[] letras = new String[500];
        for (int i = 0; i < letras.length; i++) {
            if (i < letra.length) {
                letra[i] = Character.toString((char) caracter);
                caracter++;
            }
            letras[i] = Character.toString((char) alea.nextInt(90 - 65 + 1) + 65);
        }
        for (int i = 0; i < letra.length; i++) {
            con = 0;
            for (int j = 0; j < letras.length; j++) {
                if (letra[i].equals(letras[j])) {
                    con++;
                }
                if (j == letras.length - 1) {
                    if (i % 5 == 0) {
                        System.out.println();
                    }
                    System.out.print(letra[i] + "-->" + con + "\t");
                }
            }
        }
        System.out.println();
    }
}
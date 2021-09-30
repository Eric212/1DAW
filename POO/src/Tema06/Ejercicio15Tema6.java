package Tema06;

import java.util.Scanner;

public class Ejercicio15Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int decision;
        String word1;
        String word2;
        String word3;
        String resultado;
        int vocales;
        mostrarMenu();
        decision = lector.nextInt();
        System.out.println();
        switch (decision) {
            case 1:
                System.out.println("Introduce tres palabras para comprobar cual de las tres es la mas larga");
                word1 = lector.next();
                word2 = lector.next();
                word3 = lector.next();
                resultado = masLarga(word1, word2, word3);
                System.out.println("La palabra mas larga es " + resultado);
                break;
            case 2:
                System.out.println("Introduce tres palabras para comprobar cual de las tres es la mas corta");
                word1 = lector.next();
                word2 = lector.next();
                word3 = lector.next();
                resultado = masCorta(word1, word2, word3);
                System.out.println("La palabra mas corta es " + resultado);
                break;
            case 3:
                System.out.println("Introduce la palabra de la cual quieras saber el numero de vocales");
                word1 = lector.next();
                vocales = vocales(word1);
                System.out.println("El numero de vocales en la palabra " + word1 + " es " + vocales);

        }
    }

    static void mostrarMenu() {
        System.out.print("Menu Principal\n===============\n1. Palabra más larga.\n2. Palabra más corta.\n3. Numero de vocales.\n----------------------------------\n0. Salir\nEleccion: ");
    }

    static String masLarga(String word1, String word2, String word3) {
        String masLarga;
        if (word1.length() > word2.length()) {
            if (word1.length() > word3.length()) {
                masLarga = word1;
            } else {
                masLarga = word3;
            }
        } else {
            if (word2.length() > word3.length()) {
                masLarga = word2;
            } else {
                masLarga = word3;
            }
        }
        return masLarga;
    }

    static String masCorta(String word1, String word2, String word3) {
        String masCorta;
        if (word1.length() > word2.length()) {
            if (word2.length() > word3.length()) {
                masCorta = word3;
            } else {
                masCorta = word2;
            }
        } else {
            if (word1.length() > word3.length()) {
                masCorta = word3;
            } else {
                masCorta = word1;
            }
        }
        return masCorta;
    }

    static int vocales(String word1) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        String palabra = word1.toLowerCase();
        char vocal[];
        int tam = word1.length();
        vocal = new char[tam];
        vocal = palabra.toCharArray();
        int resultado;
        for (int contador = 0; contador < word1.length(); contador++) {
            if (vocal[contador] == 'a' || vocal[contador] == 'á' || vocal[contador] == 'à') {
                a++;
            }
            if (vocal[contador] == 'e' || vocal[contador] == 'é' || vocal[contador] == 'è') {
                e++;
            }
            if (vocal[contador] == 'i' || vocal[contador] == 'í' || vocal[contador] == 'ì') {
                i++;
            }
            if (vocal[contador] == 'o' || vocal[contador] == 'ó' || vocal[contador] == 'ò') {
                o++;
            }
            if (vocal[contador] == 'u' || vocal[contador] == 'ú' || vocal[contador] == 'ù') {
                u++;
            }
        }
        resultado = a + e + i + o + u;
        System.out.println("La palabra " + word1 + "\nContiene " + a + " aes\nContiene " + e + " ees\nContiene " + i + " ies\nContiene " + o + " oes\nContiene " + u + " ues");
        return resultado;
    }
}	
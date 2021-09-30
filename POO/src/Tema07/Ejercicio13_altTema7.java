import java.util.Scanner;
import java.util.Random;

public class Ejercicio13_altTema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int tam;
        int opcion;
        int complejidad;
        System.out.println("Introduce cuantos valores quieres");
        tam = lector.nextInt();
        System.out.println("Quiers valores numericos o alfabeticos\n1:Numericos\n2:Alfabeticos");
        opcion = lector.nextInt();
        while (opcion < 0 && opcion > 2) {
            System.out.println("Introduce un valor valido\n1:Numericos\n2:Alfabetico");
            opcion = lector.nextInt();
        }
        System.out.println("Cuantos caracteres quieres por valor\n1:Un caracter\n2:Dos caracteres\n3:Aleatorios");
        complejidad = lector.nextInt();
        while (complejidad < 0 && complejidad > 3) {
            System.out.println("Introduce un valor valido\n1:Numericos\n2:Alfabetico");
            opcion = lector.nextInt();
        }
        int[] valores = new int[tam];
        valorizacion(valores, opcion, complejidad);
    }

    static void valorizacion(int[] valores, int opcion, int complejidad) {
        Random alea = new Random();
        String[] palabras = new String[valores.length];
        int aleatorio;
        int aleatorio1;
        if (opcion == 1) {
            if (complejidad == 1) {
                for (int i = 0; i < valores.length; i++) {
                    aleatorio = alea.nextInt(10);
                    valores[i] = aleatorio;
                    if (i == valores.length - 1) {
                        for (int k = 0; k < valores.length; k++) {
                            System.out.println(valores[k]);
                        }
                    }
                }
            } else if (complejidad == 2) {
                for (int i = 0; i < valores.length; i++) {
                    aleatorio = alea.nextInt(20) + 10;
                    valores[i] = aleatorio;
                    if (i == valores.length - 1) {
                        for (int k = 0; k < valores.length; k++) {
                            System.out.println(valores[k]);
                        }
                    }
                }
            } else {
                int numeros = 0;
                for (int i = 0; i < valores.length; i++) {
                    aleatorio1 = alea.nextInt(50) + 1;
                    for (int k = 0; k < aleatorio1; k++) {
                        numeros = numeros + aleatorio1;
                        if (k == aleatorio1 - 1) {
                            valores[i] = numeros;
                        }
                    }
                    numeros = 0;
                    if (i == valores.length - 1) {
                        for (int k = 0; k < valores.length; k++) {
                            System.out.println(valores[k]);
                        }
                    }
                }
            }
        } else {
            if (complejidad == 1) {
                String alfabeto = "abcdefghijklmnñopqrstuvwxz";
                char[] letras = alfabeto.toCharArray();
                for (int i = 0; i < valores.length; i++) {
                    aleatorio = alea.nextInt(26);
                    palabras[i] = Character.toString(letras[aleatorio]);
                    if (i == valores.length - 1) {
                        for (int k = 0; k < valores.length; k++) {
                            System.out.println(palabras[k]);
                        }
                    }
                }
            } else if (complejidad == 2) {
                String palabra = "";
                String alfabeto = "abcdefghijklmnñopqrstuvwxz";
                char[] letras = alfabeto.toCharArray();
                for (int i = 0; i < valores.length; i++) {
                    for (int k = 0; k < 2; k++) {
                        aleatorio = alea.nextInt(26);
                        palabra = palabra + letras[aleatorio];
                        if (k == 1) {
                            palabras[i] = palabra;
                        }
                    }
                    palabra = "";
                    if (i == valores.length - 1) {
                        for (int k = 0; k < valores.length; k++) {
                            System.out.println(palabras[k]);
                        }
                    }
                }
            } else {
                String palabra = "";
                String alfabeto = "abcdefghijklmnñopqrstuvwxz";
                char[] letras = alfabeto.toCharArray();
                for (int i = 0; i < valores.length; i++) {
                    aleatorio1 = alea.nextInt(50) + 1;
                    for (int k = 0; k < aleatorio1; k++) {
                        aleatorio = alea.nextInt(26);
                        palabra = palabra + letras[aleatorio];
                        if (k == aleatorio1 - 1) {
                            palabras[i] = palabra;
                        }
                    }
                    palabra = "";
                    if (i == palabras.length - 1) {
                        for (int k = 0; k < valores.length; k++) {
                            System.out.println(palabras[k]);
                        }
                    }
                }
            }
        }
    }
}
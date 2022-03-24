import java.util.Scanner;
import java.util.Random;

public class Ejercicio20Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
        int comodin;
        int tam;
        boolean comprobante;
        System.out.println("Cuantos numeros quieres");
        tam = lector.nextInt();
        int[] numeros = new int[tam];
        System.out.println("Que numero buscas");
        tam = lector.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            comodin = aleatorio.nextInt(tam - 0 + 1);
            numeros[i] = comodin;
        }
        comprobante = ordenarQuicksort(numeros, tam);
        if (comprobante) {
            System.out.println("El numero " + tam + " si esta en la lista");
        } else {
            System.out.println("El numero " + tam + " no esta en la lista");
        }

    }

    static boolean ordenarQuicksort(int[] numeros, int tam) {
        boolean comprobante = false;
        numeros = quicksort1(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (tam == numeros[i]) {
                comprobante = true;
            }
            if (i == numeros.length - 1) {
                return comprobante;
            }
        }
        return comprobante;
    }


    static int[] quicksort1(int numeros[]) {
        return quicksort2(numeros, 0, numeros.length - 1);
    }

    static int[] quicksort2(int numeros[], int izq, int der) {
        if (izq >= der)
            return numeros;
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            int aux;
            pivote = izq;
            while (izq != der) {
                while (numeros[der] >= numeros[pivote] && izq < der) {
                    der--;
                }
                while (numeros[izq] < numeros[pivote] && izq < der) {
                    izq++;
                }
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
                if (izq == der) {
                    quicksort2(numeros, i, izq - 1);
                    quicksort2(numeros, izq + 1, d);
                }

            }
        } else {
            return numeros;
        }
        return numeros;
    }
}
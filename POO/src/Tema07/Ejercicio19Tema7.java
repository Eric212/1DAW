import java.util.Random;

public class Ejercicio19Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int azar;
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            azar = alea.nextInt(101);
            numeros[i] = azar;
        }
        multiplosCinco(numeros);
        cero(numeros);
        multiplosDiez(numeros);
    }

    static void multiplosCinco(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 5 == 0) {
                System.out.println("Multiplo de Cinco: " + numeros[i]);
            }
        }
    }

    static void cero(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                System.out.println("Valor Cero: " + numeros[i]);
            }
        }
    }

    static void multiplosDiez(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == 0) {
                System.out.println("Multiplo de Diez: " + numeros[i]);
            }
        }
    }
}
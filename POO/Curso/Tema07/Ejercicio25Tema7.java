import java.util.Random;

public class Ejercicio25Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[] v = new int[50];
        int[] p = new int[v.length];
        int k = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = alea.nextInt(20 - 0 + 1);
            if (v[i] % 2 == 0) {
                p[i] = v[i];
                System.out.println("Valor " + k + ": " + p[i]);
                k++;
            }
            if (k == 1 && i == v.length - 1) {
                System.out.println("No hay valores pares");
            }
        }
    }
}
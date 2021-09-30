import java.util.Random;

public class Ejercicio23Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[] v = new int[10];
        int k = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = alea.nextInt(20 - 0 + 1);
            System.out.print("Valor " + k + " original: \t" + v[i] + "\n");
            k++;
        }
        System.out.println();
        inversion(v, k);
    }

    static void inversion(int[] v, int k) {
        int[] p = new int[v.length];
        int j = 0;
        k = 1;
        for (int i = p.length - 1; i >= 0; i--) {
            p[j] = v[i];
            System.out.print("Valor " + k + " invertido: \t" + v[i] + "\n");
            k++;
            j++;
        }
    }
}

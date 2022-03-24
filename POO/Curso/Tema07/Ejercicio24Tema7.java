import java.util.Random;

public class Ejercicio24Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[] v = new int[50];
        for (int i = 0; i < v.length; i++) {
            v[i] = alea.nextInt(20 - 0 + 1);
        }
        encadenado(v);
    }

    static void encadenado(int[] v) {
        int[] p = new int[v.length];
        int sumatorio = 0;
        for (int i = 0; i < p.length; i++) {
            sumatorio += v[i];
            p[i] = sumatorio;
            System.out.println(p[i]);
        }
    }
}
 
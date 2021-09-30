import java.util.Random;

public class Ejercicio27Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[] v = new int[50];
        int[] p = new int[20];
        int[][] m = new int[v.length][p.length];
        for (int i = 0; i < v.length; i++) {
            v[i] = alea.nextInt(20 - 0 + 1);
            if (i < p.length) {
                p[i] = alea.nextInt(20 - 0 + 1);
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = v[i] * p[j];
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
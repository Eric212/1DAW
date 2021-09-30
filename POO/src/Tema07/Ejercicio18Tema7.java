import java.util.Random;

public class Ejercicio18Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] sumas = new int[10];
        int[] division = new int[10];
        int numeroAlea;
        for (int i = 0; i < numeros1.length; i++) {
            numeroAlea = alea.nextInt(10) + 1;
            numeros1[i] = numeroAlea;
            numeroAlea = alea.nextInt(10) + 1;
            numeros2[i] = numeroAlea;
        }
        sumas = suma(numeros1, numeros2);
        division = division(numeros1, numeros2);
        for (int i = 0; i < sumas.length; i++) {
            System.out.println("Sumas: " + numeros1[i] + "+" + numeros2[i] + "=" + sumas[i] + "\t" + "Divisiones: " + numeros1[i] + "/" + numeros2[i] + "=" + division[i]);
        }
    }

    static int[] suma(int[] numeros1, int[] numeros2) {
        int[] sumas = new int[10];
        for (int i = 0; i < sumas.length; i++) {
            sumas[i] = numeros1[i] + numeros2[i];
        }
        return sumas;
    }

    static int[] division(int[] numeros1, int[] numeros2) {
        int[] division = new int[10];
        for (int i = 0; i < division.length; i++) {
            division[i] = numeros1[i] / numeros2[i];
        }
        return division;
    }
}
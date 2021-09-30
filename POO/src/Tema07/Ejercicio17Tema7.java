import java.util.Scanner;

public class Ejercicio17Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroAlt;
        float altura;
        int k = 1;
        System.out.println("Introduzca el numero de alturas que quieras introducir");
        numeroAlt = lector.nextInt();
        float[] alturas = new float[numeroAlt];
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce la Altura " + k + ":");
            altura = lector.nextFloat();
            alturas[i] = altura;
            k++;
        }
        media(alturas);
    }

    static void media(float[] alturas) {
        int k = 1;
        float media = 0f;
        for (int i = 0; i < alturas.length; i++) {
            media = media + alturas[i];
        }
        media = media / alturas.length;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                System.out.printf("La altura " + k + ": " + "%.2f" + " es mayor a la media: " + "%.2f", alturas[i], media);
            }
            k++;
        }
    }
}
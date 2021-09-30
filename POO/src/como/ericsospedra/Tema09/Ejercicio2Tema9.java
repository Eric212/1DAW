package como.ericsospedra.Tema09;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2Tema9 {
    public static void main(String[] args) {
        introducirDiezNumeros();
    }

    public static void introducirDiezNumeros() {
        Scanner lector = new Scanner(System.in);
        boolean control = true;
        int cont = 0;
        float[] numeros = new float[10];
        float masAlto = 0;
        do {
            for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.print(i + "\n");
                    System.out.print("Introduce un numero\nNumero: ");
                    numeros[i] = lector.nextInt();
                    if (masAlto < numeros[i]) {
                        masAlto = numeros[i];
                    }
                } catch (InputMismatchException ex) {
                    lector.nextLine();
                    i--;
                    cont++;
                }
            }
            System.out.print("El numero mas alto es: " + masAlto + " han habido " + cont + " errores durante la ejecucion\n");
            control = false;
        } while (control);
    }
}
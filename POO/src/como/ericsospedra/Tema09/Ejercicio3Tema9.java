package como.ericsospedra.Tema09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Tema9 {
    public static void main(String[] args) {
        masAlto();
    }

    public static void masAlto() {
        Scanner lector = new Scanner(System.in);
        boolean control = true;
        int numeros, masAlto = 0, cont = 0;
        do {
            try {
                System.out.print("Introduce un numero entero, cuando desee para el programa introduzca una letra\nNumero: ");
                numeros = lector.nextInt();
                if (masAlto < numeros) {
                    masAlto = numeros;
                }
                cont++;
            } catch (InputMismatchException exIME) {
                if (cont > 0) {
                    control = false;
                } else {
                    System.out.print("No has introducido ningun numero\n"
                            + "Dale a enter para continuar...");
                    lector.nextLine();
                    System.out.print("\u001B[H\u001B[2J");
                }
            }
        }
        while (control);
        System.out.print("El numero mas alto es: " + masAlto + "\n");
    }
}
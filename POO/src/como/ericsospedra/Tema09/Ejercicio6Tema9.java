package como.ericsospedra.Tema09;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class Ejercicio6Tema9 {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = {-2, 3, 5, 0, -4, 2};
        int num, opcion;
        System.out.print("Introduce el numero que desee divir a la lista\nNumero: ");
        num = lector.nextInt();
        lector.nextLine();
        System.out.print("1:Mostrar excepcion\n2:Sin excepcion\nOpcion: ");
        opcion = lector.nextInt();
        lector.nextLine();
        while (opcion < 1 || opcion > 2) {
            System.out.print("Elige una opcion valida, entre 1 y 2");
            opcion = lector.nextInt();
            lector.nextLine();
        }
        if (opcion == 1) {
            if (divirEntreArray(numeros, num)) {
                throw new ArithmeticException("Hola");
            }
        } else {
            dividirEntreArrayComprobado(numeros, num);
        }
    }

    public static boolean divirEntreArray(int[] numeros, int num) throws ArithmeticException {
        boolean control = false;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Division entre " + numeros[i] + "/" + num + "=" + numeros[i] / num + "\n");
            if (numeros[i] <= 0) {
                contador++;
                if (contador >= 1) {
                    control = true;
                }
            }

        }
        return control;
    }

    public static void dividirEntreArrayComprobado(int[] numeros, int num) {
        while (num == 0) {
            System.out.print("El numero a divir no puede ser 0\n");
            num = lector.nextInt();
            lector.nextLine();
        }
        for (int i = 0; i < numeros.length; i++) {
            while (numeros[i] == 0) {
                System.out.print("El numero " + numeros[i] + " es menor o igual a cero, porfavor introduzca un numero superior a 0\n Numero: ");
                numeros[i] = lector.nextInt();
                lector.nextLine();
            }
            System.out.print("Division entre " + numeros[i] + "/" + num + "=" + numeros[i] / num + "\n");
        }
        System.out.println();
    }
}

package como.ericsospedra.Tema09;

import java.lang.ArithmeticException;
import java.lang.NullPointerException;
import java.lang.IndexOutOfBoundsException;

public class Ejercicio8Tema9 {
    public static void main(String[] args) {
        String[] numeros = {"0", "1", null, "5", "7"};
        for (int i = 0; i <= numeros.length; i++) {
            try {
                if (numeros[i] == null) {
                    System.out.println(numeros[i].charAt(0));
                } else {
                    System.out.println(10 / Integer.parseInt(numeros[i]));
                }
            } catch (ArithmeticException AEex) {
                System.out.print("Error aritmetico\n");
            } catch (NullPointerException NPEex) {
                System.out.print("Error valor vacio\n");
            } catch (IndexOutOfBoundsException IOOBEex) {

                System.out.print("Error al recorrer array, maximo excedido\n");
            }
        }
    }
}

package como.ericsospedra.Tema09;
import java.util.Scanner;
public class Ejercicio7Tema9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] palabras = {"Hola", "Como", "Estas", null, null};
        comprobarArray(palabras);
    }

    public static void comprobarArray(String[] palabras) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null) {
                System.out.print("El primer caracter de " + palabras[i] + " es " + palabras[i].charAt(0) + "\n");
            }
        }
    }
}

package Tema06;

import java.util.Scanner;

public class Ejercicio19Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dni;
        char letraAComprobar;
        boolean letra;
        System.out.println("Dime la letra de tu DNI y separa con espacio el numero de tu DNI :");
        letraAComprobar = lector.next().toUpperCase().charAt(0);
        dni = lector.nextInt();
        letra = letra(dni, letraAComprobar);
        if (letra) {
            System.out.println("Tu DNI es: " + dni + letraAComprobar + " es correcto.");
        } else {
            System.out.println("La letra introducida no es correcta.");
        }
    }

    static boolean letra(int num, char letraAComprobar) {
        int dni = num % 23;
        char letra;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra = letras[dni];
        System.out.print(letra+" "+dni);
        boolean verificacion;
        if (letra == letraAComprobar) {
            verificacion = true;
        } else {
            verificacion = false;
        }
        return verificacion;
    }
}
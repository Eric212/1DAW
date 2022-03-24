package Tema04;

import java.util.Scanner;

public class NumeroPrimoTema4 {
    public static void main(String[] arg) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introudce hasta que numero quieres que se te muestren los numeros primos");
        int tam = lector.nextInt();
        lector.nextLine();
        int[] numeros = new int[tam];
        tam = tam - 1;
        int i;
        int x = 1;
        int contador = 0;
        for (i = 1; contador <= tam; i++) {
            if (i / x == 1) {
                numeros[contador] = i;
                contador++;
            } else {
                x++;
            }
        }
        for (int z = 0; z < numeros.length; z++)
            System.out.println(numeros[z]);
    }
}
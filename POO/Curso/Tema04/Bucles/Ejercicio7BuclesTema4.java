package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio7BuclesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 1;
        double primerNumero;
        int segundoNumero;
        double resultado = 0;
        boolean negativo = false;
        System.out.println("Introduce el numero a elevar a base x(Introduce tambien la base)");
        primerNumero = lector.nextDouble();
        lector.nextLine();
        segundoNumero = lector.nextInt();
        if (primerNumero < 0 || segundoNumero < 0) {
            negativo = true;
            segundoNumero = segundoNumero * -1;
        }
        while (contador <= segundoNumero) {
            if (contador == 1) {
                resultado = primerNumero * primerNumero;
                contador++;
            } else if (contador < segundoNumero) {
                resultado = resultado * primerNumero;
                contador++;
            } else {
                contador++;
                if (negativo) {
                    resultado = resultado * (-1);
                }
                System.out.println("El resultado de elevar " + primerNumero + " a base " + segundoNumero + " es: " + resultado);
            }
        }
    }
}
package Tema04;

import java.util.Scanner;

public class Ejercicio6Tema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float dinero;
        float total;
        int unCentimo = 0;
        int dosCentimos = 0;
        int cincoCentimos = 0;
        int diezCentimos = 0;
        int veinteCentimos = 0;
        int cincuentaCentimos = 0;
        int unEuro = 0;
        int dosEuros = 0;
        System.out.print("Introduce la cantidad de Euros, separando Eureos de centimos con una coma\nEuros: ");
        dinero = lector.nextFloat();
        total = dinero;
        if (dinero >= 2) {
            while (dinero >= 2) {
                dinero = dinero - 2f;
                dosEuros++;
            }
        }
        if (dinero >= 1) {
            while (dinero >= 1) {
                dinero = dinero - 1f;
                unEuro++;
            }
        }
        if (dinero >= 0.5) {
            while (dinero >= 0.5) {
                dinero = dinero - 0.5f;
                cincuentaCentimos++;
            }
        }
        if (dinero >= 0.2) {
            while (dinero >= 0.2) {
                dinero = dinero - 0.2f;
                veinteCentimos++;
            }
        }
        if (dinero >= 0.1) {
            while (dinero >= 0.1) {
                dinero = dinero - 0.1f;
                diezCentimos++;
            }
        }
        if (dinero >= 0.05) {
            while (dinero >= 0.05) {
                dinero = dinero - 0.05f;
                cincoCentimos++;
            }
        }
        if (dinero >= 0.02) {
            while (dinero >= 0.02) {
                dinero = dinero - 0.02f;
                dosCentimos++;
            }
        } else {
            while (dinero >= 0.01) {
                dinero = dinero - 0.01f;
                unCentimo++;
            }
        }
        System.out.print("Necesitas\n " + dosEuros + " de 2€\n " + unEuro + " de 1€\n " + cincuentaCentimos + " de 50 centimos\n " + veinteCentimos + " de 20 centimos\n " + diezCentimos + " de 10 centimos\n " + cincoCentimos + " de 5 centimos\n " + dosCentimos + " de 2 centimos\n " + unCentimo + " de 1 centimo\nPara tener la cantidad de " + total + " €");
    }
}
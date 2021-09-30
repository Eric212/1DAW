package Tema04.Condicionales;

import java.util.Scanner;

public class Ejercicio6CondicionalesTema4 {
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
        if (dinero >= 2.00f) {
            while (dinero >= 2.00f) {
                dinero = dinero - 2.00f;
                dosEuros++;
            }
        }
        if (dinero >= 1.00f) {
            while (dinero >= 1.00f) {
                dinero = dinero - 1.00f;
                unEuro++;
            }
        }
        if (dinero >= 0.50f) {
            while (dinero >= 0.50f) {
                dinero = dinero - 0.50f;
                cincuentaCentimos++;
            }
        }
        if (dinero >= 0.20f) {
            while (dinero >= 0.20f) {
                dinero = dinero - 0.20f;
                veinteCentimos++;
            }
        }
        if (dinero >= 0.10f) {
            while (dinero >= 0.10f) {
                dinero = dinero - 0.10f;
                diezCentimos++;
            }
        }
        if (dinero >= 0.049f) {
            while (dinero >= 0.049f) {
                dinero = dinero - 0.05f;
                cincoCentimos++;
            }
        }
        if (dinero >= 0.019f) {
            while (dinero >= 0.019f) {
                dinero = dinero - 0.02f;
                dosCentimos++;
            }
        }
        if (dinero >= 0.009f) {
            while (dinero >= 0.009f) {
                dinero = dinero - 0.01f;
                unCentimo++;
            }
        }
        System.out.print("Necesitas\n " + dosEuros + " de 2€\n " + unEuro + " de 1€\n " + cincuentaCentimos + " de 50 centimos\n " + veinteCentimos + " de 20 centimos\n " + diezCentimos + " de 10 centimos\n " + cincoCentimos + " de 5 centimos\n " + dosCentimos + " de 2 centimos\n " + unCentimo + " de 1 centimo\nPara tener la cantidad de " + total + " €\n");
    }
}
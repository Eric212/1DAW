package Tema03;

import java.util.Scanner;

public class Ejercicio17Tema3 {
    public static void main(String arg[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el precio por litro del combustible, el total al llenar el depósito y el kilometraje del cuentakilómetros del primer repostaje");
        float primerPrecioCombustible = lector.nextFloat();
        float primerPrecioDeposito = lector.nextFloat();
        float primerKilometraje = lector.nextFloat();
        lector.nextLine();
        System.out.println("Introduzca el precio por litro del combustible y el total al llenar el depósito del segundo repostaje");
        float segundoPrecioCombustible = lector.nextFloat();
        float segundoPrecioDeposito = lector.nextFloat();
        lector.nextLine();
        System.out.println("Introduzca el kilometraje del cuentakilómetros");
        float segundoKilometraje = lector.nextFloat();
        lector.nextLine();
        float consumoCombustible = (primerPrecioDeposito / primerPrecioCombustible) + (segundoPrecioDeposito / segundoPrecioCombustible);
        float recorrido = segundoKilometraje - primerKilometraje;
        float consumoFinal = (consumoCombustible * 100) / recorrido;
        float precioKilometro = (consumoCombustible * 1) / recorrido;
        System.out.println("El consumo medio de este viaje seria: " + consumoFinal + "L a los 100 Km y el kilometro le cuesta: " + precioKilometro + "€/L");
    }
}
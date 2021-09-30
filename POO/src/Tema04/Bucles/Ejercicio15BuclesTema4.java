package Tema04.Bucles;

import java.util.Scanner;

public class Ejercicio15BuclesTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;
        String momentoDia;
        System.out.println("Introudce las horas");
        horas = lector.nextInt();
        lector.nextLine();
        System.out.println("Introduce los minutos");
        minutos = lector.nextInt();
        lector.nextLine();
        System.out.println("Introduce los segundos");
        segundos = lector.nextInt();
        lector.nextLine();
        while (horas <= 0 || horas > 24) {
            System.out.println("Introduce un numero de horas validas");
            horas = lector.nextInt();
        }
        while (minutos <= 0 || minutos > 60) {
            System.out.println("Introduce un numero de minutos validos");
            minutos = lector.nextInt();
        }
        while (segundos <= 0 || segundos > 60) {
            System.out.println("Introduce un numero de segundos validos");
            segundos = lector.nextInt();
        }
        if (horas > 12) {
            momentoDia = "pm";
        } else {
            momentoDia = "am";
        }
        System.out.println("La hora introducida es: " + horas + ":" + minutos + ":" + segundos + " " + momentoDia);

    }
}
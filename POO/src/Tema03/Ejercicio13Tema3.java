package Tema03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13Tema3 {
    public static void main(String arg[]) {
        Scanner lector = new Scanner(System.in);
        int datosIntroducidos;
        int segundos;
        boolean control = true;
        while (control) {
            try {
                System.out.println("Introduce el nuemro de segundos que quieres convertir a Días, Horas y minutos");
                datosIntroducidos = lector.nextInt();
                lector.nextLine();
                while (datosIntroducidos >= 2147483647 || datosIntroducidos < 0) {
                    System.out.println("Introduce un numero valido");
                    datosIntroducidos = lector.nextInt();
                    lector.nextLine();
                }
                int minutos = datosIntroducidos / 60;
                segundos = datosIntroducidos % 60;
                int horas = minutos / 60;
                minutos = minutos % 60;
                int dias = horas / 24;
                horas = horas % 24;
                System.out.println(datosIntroducidos + " segundos equivale a " + dias + " días, " + horas + " horas, " + minutos + " minutos, y " + segundos + " segundos");
                control = false;
            } catch (InputMismatchException ex) {
                System.out.println("\u26A0  \u26A0  \u26A0  \u26A0  Recuerda que solo se pueden numeros enteros y positivos  \u26A0  \u26A0  \u26A0  \u26A0");
                lector.nextLine();
            }
        }
    }
}

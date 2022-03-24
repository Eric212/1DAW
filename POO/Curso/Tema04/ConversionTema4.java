package Tema04;

import java.util.Scanner;

public class ConversionTema4 {
    public static void main(String[] arg) {
        Scanner lector = new Scanner(System.in);
        double pulgadas;
        double centimetros;
        double opcion;
        double resultado;
        boolean control;
        System.out.println("Elige que opcion quieres:\n1:Conversion de Centimetros a Pulgadas\n2:Conversion de Pulgadas a Centimetros");
        opcion = lector.nextInt();
        lector.nextLine();
        while (opcion > 2) {
            System.out.println("Error, recuerda que solo puedes elegir entre la opción 1 o 2\nElige que opcion quieres:\n1:Conversion de Centimetros a Pulgadas\n2:Conversion de Pulgadas a Centimetros");
            opcion = lector.nextInt();
        }
        if (opcion == 1) {
            System.out.println("Escriba el nuemro de Centimetros que quiere convertir a Pulgadas");
            centimetros = lector.nextInt();
            lector.nextLine();
            resultado = centimetros * 2.54;
            System.out.println("La conversion de " + centimetros + " cm a pulgadas equivale a " + resultado + " \u201D");
        } else {
            System.out.println("Escriba el nuemro de Pulgadas que quiere convertir a Centimetros");
            pulgadas = lector.nextInt();
            lector.nextLine();
            resultado = pulgadas / 0.393701;
            System.out.println("La conversion de " + pulgadas + " \u201D a centimetros equivale a " + resultado + " cm");
        }
    }
}
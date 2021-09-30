package Tema04.Bucles;

import java.util.Random;

public class Ejercicio14BuclesTema4 {
    public static void main(String[] args) {
        Random r = new Random();
        int lanzamientos;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        int tirada;
        int resultado;
        for (lanzamientos = 0; lanzamientos <= 1000000; lanzamientos++) {
            tirada = r.nextInt(6) + 1;
            switch (tirada) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
                default:
                    break;
            }
        }
        resultado = uno / 10000;
        System.out.print("El numero de veces que a salido uno es: " + uno + "\n El porcentaje de uno es:" + resultado + "\u0025\n");
        resultado = dos / 10000;
        System.out.print("El numero de veces que a salido dos es: " + dos + "\n El porcentaje de dos es:" + resultado + "\u0025\n");
        resultado = tres / 10000;
        System.out.print("El numero de veces que a salido tres es: " + tres + "\n El porcentaje de tres es:" + resultado + "\u0025\n");
        resultado = cuatro / 10000;
        System.out.print("El numero de veces que a salido cuatro es: " + cuatro + "\n El porcentaje de cuatro es:" + resultado + "\u0025\n");
        resultado = cinco / 10000;
        System.out.print("El numero de veces que a salido cinco es: " + cinco + "\n El porcentaje de cinco es:" + resultado + "\u0025\n");
        resultado = seis / 10000;
        System.out.print("El numero de veces que a salido seis es: " + seis + "\n El porcentaje de seis es:" + resultado + "\u0025\n");
    }
}
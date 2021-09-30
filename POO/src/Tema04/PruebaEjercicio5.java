package Tema04;

public class PruebaEjercicio5 {
    public static void main(String[] args) {
        int pares;
        int impares;
        int multiplosDeCinco;
        int contador;
        int totalPar = 0;
        int totalImpar = 0;
        int totalMultiplos = 0;
        int i = 0;
        int z = 0;
        int x = 0;
        for (contador = 1; contador <= 100; contador++) {
            if (contador % 2 == 0) {
                totalPar = totalPar + contador;
                i++;
                if (contador % 5 == 0) {
                    totalMultiplos = totalMultiplos + contador;
                    x++;
                }
            } else {
                totalImpar = totalImpar + contador;
                z++;
                if (contador % 5 == 0) {
                    totalMultiplos = totalMultiplos + contador;
                    x++;
                }
            }
            if (contador == 100) {
                System.out.println("Esta es la suma de todos los numeros Pares: " + totalPar);
                System.out.println("Estos es el total de numeros pares que hay:" + i);
                System.out.println("Esta es la suma de todos los numeros Impares: " + totalImpar);
                System.out.println("Estos es el total de numeros Impares que hay:" + z);
                System.out.println("Esta es la suma de todos los numeros multiplos de 5: " + totalMultiplos);
                System.out.println("Estos es el total de numeros multiplos de 5 que hay:" + x);
            }
        }
    }
}
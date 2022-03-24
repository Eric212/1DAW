package Tema04.Bucles;

public class Ejercicio4BuclesTema4 {
    public static void main(String[] args) {
        int numero;
        int contador;
        int x = 0;
        for (contador = 0; contador <= 100; contador++) {
            if (contador % 2 != 0) {
                numero = contador;
                System.out.println(numero);
                x++;
            }
        }
        System.out.print("Total de numeros impares: " + x + "\n");
    }
}
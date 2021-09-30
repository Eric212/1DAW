import java.util.Random;
import java.util.Scanner;

public class Ejercicio26_Ainhoa {
    public static void main(String[] args) {
        int[][] matrizReves;
        int[][] matriz = new int[4][8];
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(40 - 0 + 1);
            }
        }
        matrizFilas(matriz);
        matrizReves = matrizTraspuesta(matriz);
        min(matriz);
        maximo(matriz);
        media(matriz);
        element(matriz);
        fila(matriz);
        columna(matriz);
        sumaColumna(matriz, matrizReves);
    }

    static void matrizFilas(int[][] ma) {
        for (int a = 0; a < ma.length; a++) {
            for (int b = 0; b < ma[a].length; b++) {
                System.out.print(ma[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] matrizTraspuesta(int[][] ma) {
        int[][] matriz = new int[ma[0].length][ma.length];
        int suma = 0;
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                matriz[j][i] = ma[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {

            }
        }
        for (int i = 0; i < ma.length; i++) {
            suma = 0;
            for (int j = 0; j < ma[i].length; j++) {
                suma += ma[i][j];
                if (j == ma[i].length - 1) {
                    System.out.print("El total de la fila acabada en: " + ma[i][j] + " es: " + suma);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("******************************************************");
        return matriz;
    }

    static void min(int[][] matriz) {
        int minimo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
                if (i == matriz.length - 1 && j == matriz.length - 1) {
                    System.out.println("Este es el numero minimo de la matriz: " + minimo);
                    System.out.println();
                }
            }
        }
    }

    static void maximo(int[][] matriz) {
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (i == matriz.length - 1 && j == matriz.length - 1) {

                    System.out.println("Este es el numero maximo de la matriz: " + max);
                }
            }
        }
        System.out.println("******************************************************");
    }

    static void media(int[][] matriz) {
        System.out.println("ESTA ES LA MEDIA DE LA MATRIZ");
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
                if (i == matriz.length - 1 && j == matriz.length - 1) {
                    System.out.println();
                    total = total / matriz.length * matriz[i].length;
                    System.out.print(">>>>>>> " + total + " <<<<<<<");

                }
            }
        }
        System.out.println();
    }

    static void element(int[][] matriz) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdume el numero de fila del 1 al 4 y de columnas del 1 al 8");
        int elemento1 = lector.nextInt();
        int elemento2 = lector.nextInt();
        int elemento = matriz[elemento1 - 1][elemento2 - 1];
        System.out.println("El elemento seleccionado es: " + elemento);
        System.out.println();
        System.out.println("****************************************************************");
    }

    static void fila(int[][] matriz) {
        Scanner lector = new Scanner(System.in);
        int f = 0;
        System.out.println("Introdume el numero de fila del 1 al 4");
        int fila = lector.nextInt();
        for (int i = 0; i < matriz[0].length; i++) {
            f = matriz[fila - 1][i];
            System.out.print(" " + f + " ");

        }
        System.out.println();
    }

    static void columna(int[][] matriz) {
        Scanner lector = new Scanner(System.in);
        int c = 0;
        System.out.println("Introduce el numero de columna del 1 al 8");
        int columna = lector.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            c = matriz[i][columna - 1];
            System.out.println(c);
        }
        System.out.println();
    }

    static void sumaColumna(int[][] matriz, int[][] reves) {
        int suma = 0;
        int contador = 0;
        int c = 0;
        int[][] matrizNueva = new int[matriz.length][matriz[0].length + 1];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizNueva[i][j] = matriz[i][j];
            }
        }
        for (int i = 0; i < reves.length; i++) {
            suma = 0;
            for (int j = 0; j < reves[i].length; j++) {
                suma += reves[i][j];
                if (j == reves[i].length - 1) {
                    matrizNueva[contador][matrizNueva[0].length - 1] = suma;
                    if (contador < matrizNueva.length - 1) {
                        contador++;
                    }
                }
            }
        }
        for (int i = 0; i < matrizNueva.length; i++) {
            for (int j = 0; j < matrizNueva[i].length; j++) {
                System.out.print(matrizNueva[i][j] + "\t");
                if (j == matrizNueva[i].length - 1) {
                    System.out.print("El valor total de la columna " + c + " es: " + matrizNueva[i][j] + "\t");
                    c++;
                }
            }
            System.out.println();
        }
    }
}
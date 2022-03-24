import java.util.Scanner;
import java.util.Random;

public class Ejercicio26_altTema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[][] matriz = new int[4][8];
        int[][] reves = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = alea.nextInt(20 - 0 + 1);
            }
        }
        reves = visualizar(matriz);
        suma(matriz);
        minMax(matriz);
        media(matriz);
        buscador(matriz);
        visualizarColum8(matriz, reves);
    }

    public static int[][] visualizar(int[][] matriz) {
        int[][] reves = new int[matriz[0].length][matriz.length];
        System.out.println("---------------------Valores orden normal-----------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                reves[j][i] = matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("//////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println("----Valores del reves----");
        for (int i = 0; i < reves.length; i++) {
            for (int j = 0; j < reves[i].length; j++) {
                System.out.print(reves[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("//////////////////////////");
        return reves;
    }

    public static void suma(int[][] matriz) {
        int[][] suma = new int[matriz[0].length + 1][matriz.length];
        System.out.println();
        System.out.println("---------------------------Sumatorio de filas-----------------------------------");
        int sumatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < suma[0].length; i++) {
            sumatorio = 0;
            for (int j = 0; j < suma.length; j++) {
                if (j == suma.length - 1) {
                    suma[j][i] = sumatorio;
                }
                sumatorio += suma[j][i];
            }
        }
        for (int i = 0; i < suma[0].length; i++) {
            for (int j = 0; j < suma.length; j++) {
                if (j == suma.length - 1) {
                    System.out.print("Total filas: " + suma[j][i] + "\t");
                } else {
                    System.out.print(suma[j][i] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
    }

    public static void minMax(int[][] matriz) {
        System.out.println();
        System.out.println("----Numero maximo y minimo de la matriz----");
        int min = matriz[0][0];
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (i == matriz.length - 1 && j == matriz[i].length - 1) {
                    System.out.printf("%28s\n", "Valor maximo: " + max);
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                min = matriz[i][j];
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
                if (i == matriz.length - 1 && j == matriz[i].length - 1) {
                    System.out.printf("%28s\n", "Valor minimo: " + min);
                }
            }
        }
        System.out.println("/////////////////////////////////////////////////////////");
    }

    public static void media(int[][] matriz) {
        System.out.println();
        System.out.println("--------------------Media de la matriz---------------------");
        int media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
                media += matriz[i][j];
                if (i == matriz.length - 1 && j == matriz[i].length - 1) {
                    System.out.println();
                    media = media / matriz.length * matriz[i].length;
                    System.out.printf("%40s\n", "La media de la matriz es: " + media);
                }
            }
            System.out.println();
        }
        System.out.println("/////////////////////////////////////////////////////////");
    }

    public static void buscador(int[][] matriz) {
        System.out.println();
        Scanner lector = new Scanner(System.in);
        String fila = "El numero de fila y columna introducido es mayor que el numero de filas y columnas existentes, vuelve a elegir fila\nNumero de filas existentes: " + (matriz.length - 1) + "\nFila: ";
        String columna = "El numero de columna introducido es mayor que el numero de filas y columnas existentes, vuelve a elegir columna\nNumero de columnas existentes: " + (matriz[0].length - 1) + "\nFila: ";
        int opcion;
        int f = 0;
        int c = 0;
        do {
            System.out.print("1:Especificar fila y columna del valor que desea visualizar\n2:No recuerda la Fila\n3:No recuerda la columna\n4:No recuerda ni la fila ni la columna\n0:Salir\nSelecciona una opcion: ");
            opcion = lector.nextInt();
            while (opcion < 0 || opcion > 4) {
                System.out.print("La opcion no es valida, elige entre la opcion de la 1 a la 4\nOpcion: ");
                opcion = lector.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.print("Especifica fila y columna del valor que desea visualizar\nFila: ");
                    f = lector.nextInt();
                    System.out.print("Columna: ");
                    c = lector.nextInt();
                    while (f > matriz.length - 1 || c > matriz[f].length) {
                        if (f > matriz.length - 1 && c > matriz[0].length) {
                            System.out.print("El numero de fila y columnas introducido es mayor que el numero de filas y columnas existentes, vuelve a elegir Fila y Columna\nNumero de filas existentes: " + (matriz.length - 1) + "\nNumero de columnas existentes: " + (matriz[0].length - 1) + "\nFila: ");
                            f = lector.nextInt();
                            System.out.print("Columna: ");
                            c = lector.nextInt();
                        } else if (f > (matriz.length - 1)) {
                            System.out.print(fila);
                            f = lector.nextInt();
                        } else if (c > (matriz[0].length - 1)) {
                            System.out.print(columna);
                            c = lector.nextInt();
                        }
                    }
                    System.out.println("Valor: " + matriz[f][c]);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Especifica la columna del valor que desea visualizar\nColumna: ");
                    c = lector.nextInt();
                    while (c > matriz[f].length) {
                        System.out.print(columna);
                        c = lector.nextInt();
                    }
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.printf("%10s", "Fila: " + i + matriz[i][c] + "\t");
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Especifica la fila del valor que desea visualizar\nFila: ");
                    f = lector.nextInt();
                    while (f > matriz.length - 1) {
                        System.out.print(fila);
                        f = lector.nextInt();
                    }
                    for (int i = 0; i < matriz[f].length; i++) {
                        System.out.print(matriz[f][i] + "\t");
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
            }
        }
        while (opcion != 0);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }

    public static void visualizarColum8(int[][] matriz, int[][] reves) {
        int[][] suma = new int[matriz[0].length][matriz.length + 1];
        int sumatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < reves.length; i++) {
            for (int j = 0; j < reves[i].length; j++) {
                sumatorio += reves[i][j];
                if (j == reves[i].length - 1) {
                    suma[i][j + 1] = sumatorio;
                    sumatorio = 0;
                }
            }
        }
        for (int i = 0; i < suma[0].length; i++) {
            for (int j = 0; j < suma.length; j++) {
                if (i == suma[i].length - 1) {
                    System.out.print("Total : " + suma[j][i] + "\t");
                } else {
                    System.out.print(suma[j][i] + "\t\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
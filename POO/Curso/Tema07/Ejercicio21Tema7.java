import java.util.Scanner;
import java.util.Random;

public class Ejercicio21Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int comodin = alea.nextInt(51);
        int[] numeros = new int[comodin];
        boolean comprobante = false;
        menu(numeros, comprobante);
    }

    public static void menu(int[] p, boolean comprobante) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println();
            System.out.print("MENÚ PRINCIPAL\n==============\n1.-Rellenar array.\n2.-Visualizar contenido del array\n3.-Visualizar contenido par.\n4.-Visualizar contenido múltiplo de 3\n0.-Salir del menú.\nSelecciona una opción: ");
            opcion = lector.nextInt();
            lector.nextLine();
            while (opcion < 0 || opcion > 4) {
                System.out.println();
                System.out.print("Introduce una opcicon valida entre 0 y 4\nSelecciona una opción: ");
                opcion = lector.nextInt();
                lector.nextLine();
                System.out.println();
            }
            System.out.println();
            if (opcion == 1 && comprobante == true) {
                comprobante = false;
            }
            if (opcion == 1 && comprobante == false) {
                crearArray(p);
            } else if (opcion > 1 && comprobante == true) {
                control(opcion, p);
            } else if (opcion > 1 && comprobante == false) {
                System.out.println("La array no esta llena, primero rellene la array");
                menu(p, comprobante);
            }
        } while (opcion != 0);
        System.out.println("-------------FIN DEL PROGRAMA--------------");
    }

    public static void control(int opcion, int[] numeros) {
        switch (opcion) {
            case 2:
                visualizarArray(numeros);
                break;
            case 3:
                visualizarParell(numeros);
                break;
            case 4:
                visualizarMultiple3(numeros);
                break;
        }
    }

    public static void crearArray(int[] vector) {//rellena el array con números aleatorios del 0 al 50.
        Random alea = new Random();
        boolean comprobante;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = alea.nextInt(20 - 0 + 1);
        }
        comprobante = true;
        menu(vector, comprobante);
    }

    public static void visualizarArray(int[] vector) {//visualiza todo el contenido del array.
        boolean comprobante;
        comprobante = true;
        for (int i = 0; i < vector.length; i++) {
            if (i % 4 == 0) {
                System.out.println();
            } else {
                System.out.print(vector[i] + "\t");
            }
        }
        System.out.println();
        menu(vector, comprobante);
    }

    public static void visualizarParell(int[] vector) {//muestra la posición y el contenido de los elementos que tienen valor par.
        boolean comprobante;
        comprobante = true;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println("Posicion " + i + "=" + vector[i]);
            }
        }
        System.out.println();
        menu(vector, comprobante);
    }

    public static void visualizarMultiple3(int[] vector) {//muestra la posición y el contenido de los elementos que son múltiplo de 3.
        boolean comprobante;
        comprobante = true;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 3 == 0) {
                System.out.println("Posicion " + i + "=" + vector[i] + "\t");
            }
        }
        System.out.println();
        menu(vector, comprobante);
    }
}

package como.ericsospedra.Tema09.Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5Tema9 {
    static int cont = 1;
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        Alumno alumno1;
        Alumno alumno2;
        alumno1 = nombrarAlumnno();
        alumno2 = nombrarAlumnno();
        cont = 1;
        darEdad(alumno1);
        darEdad(alumno2);
        cont = 1;
        darAltura(alumno1);
        darAltura(alumno2);
        System.out.printf("\nAlumno1\n-------------------\nNombre:" + "%3s\n" + "Edad:" + "%3d\n" + "Altura:" + "%3.2f\n", alumno1.getNombre(), alumno1.getEdad(), alumno1.getAltura());
        System.out.printf("\nAlumno2\n-------------------\nNombre:" + "%3s\n" + "Edad:" + "%3d\n" + "Altura:" + "%3.2f\n", alumno2.getNombre(), alumno2.getEdad(), alumno2.getAltura());
        System.out.print(comprobarEdad(alumno1, alumno2));
    }

    public static Alumno nombrarAlumnno() {
        Alumno alum = new Alumno("", 0, 0);
        do {
            System.out.print("Introduce el nombre del alumno " + cont + "\nNombre: ");
            alum.setNombre(lector.nextLine());
            System.out.print("\u001B[H\u001B[2J");
            System.out.print(alum.getNombre() + " es corecto?\nSi o No: ");
        }
        while (!lector.nextLine().equalsIgnoreCase("Si"));
        System.out.print("\u001B[H\u001B[2J");
        cont++;
        return alum;
    }

    public static int darEdad(Alumno alum) {
        do {
            try {
                System.out.print("Introduce la edad del alumno " + cont + "\nEdad: ");
                alum.setEdad(lector.nextInt());
                lector.nextLine();
            } catch (InputMismatchException IMEex) {
                System.out.print("No has introducido un numero");
                lector.nextLine();
            }
        }
        while (alum.getEdad() == 0);
        cont++;
        return alum.getEdad();
    }

    public static Alumno darAltura(Alumno alum) {
        do {
            try {
                System.out.print("Introduce la Altura del alumno " + cont + "\nAltura: ");
                alum.setAltura(lector.nextFloat());
            } catch (InputMismatchException IMEex) {
                System.out.print("No has introducido un numero");
                lector.nextLine();
            }
        }
        while (alum.getAltura() == 0);
        cont++;
        return alum;
    }

    public static String comprobarEdad(Alumno alum1, Alumno alum2) {
        if (alum1.getEdad() > alum2.getEdad()) {
            return alum1.getNombre() + " es mayor que " + alum2.getNombre();
        } else {
            return alum1.getNombre() + " es mayor que " + alum2.getNombre();
        }
    }
}

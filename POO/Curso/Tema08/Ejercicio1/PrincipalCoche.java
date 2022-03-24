package como.ericsospedra.Tema08.Ejercicio1;

import java.util.Scanner;

public class PrincipalCoche {
    static Scanner lector = new Scanner(System.in);
    static Coche coche1 = new Coche();
    static Coche coche2 = new Coche("", "", "", false, "", "", "");
    static Coche coche3 = new Coche("", "", "", "", false);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.print("----------------------Diseñador de coches---------------------\n1:Coche de Ejemplo\n2:Crear Coche de Venta\n3:Crear coche de concesionario\n4:Visualizar los coches\n0:Salir del programa\nOpcion: ");
            opcion = lector.nextInt();
            lector.nextLine();
            while (opcion < 0 || opcion > 4) {
                System.out.print("Opcion incorrecta introduzca una opcion entre 1 y 4\nOpcion: ");
                opcion = lector.nextInt();
                lector.nextLine();
            }
            if (opcion == 1) {
                if (coche1.getMetalizadoo()) {
                    String metalizado = "Si";
                    System.out.print("\u001B[H\u001B[2J");
                    System.out.print("Modelo: " + coche1.getModelo() + "\nTipo de coche: " + coche1.getTipoCoche() + "\nColor: " + coche1.getColor() + "\nMetalizado: " + metalizado + "\nMatricula: " + coche1.getMatricula() + "\nAño de fabricacion: " + coche1.getAFabricacion() + "\nModalidad de Seguro: " + coche1.getModSeguro() + "\n");
                } else {
                    String metalizado = "No";
                    System.out.print("\u001B[H\u001B[2J");
                    System.out.print("Modelo " + coche1.getModelo() + "\nTipo de coche: " + coche1.getTipoCoche() + "\nColor: " + coche1.getColor() + "\nMetalizado: " + metalizado);
                }
            } else if (opcion == 2) {
                System.out.print("\u001B[H\u001B[2J");
                System.out.println("------------Diseñador de coches de Venta------------");
                System.out.print("Introduce Modelo: ");
                coche2.setModelo(lector.nextLine());
                System.out.print("Tipo de coche: ");
                coche2.setTipoCoche(lector.nextLine());
                System.out.print("Color: ");
                coche2.setColor(lector.nextLine());
                System.out.print("Metalizado Si / No: ");
                while (!lector.nextLine().equalsIgnoreCase("si") && !lector.nextLine().equalsIgnoreCase("no")) {
                    if (lector.nextLine().equalsIgnoreCase("Si")) {
                        coche2.setMetalizado(true);
                    } else {
                        coche2.setMetalizado(false);
                    }
                }
                System.out.print("Matricula: ");
                coche2.setMatricula(lector.nextLine());
                System.out.print("Año de fabricacion: ");
                coche2.setAFabricacion(lector.nextLine());
                System.out.print("Modalidad de Seguro Terceros / A todo riesgo: ");
                coche2.setModSeguro(lector.nextLine());
            } else if (opcion == 3) {
                System.out.print("\u001B[H\u001B[2J");
                System.out.println("------------Diseñador de coches de Concesionario------------");
                System.out.print("Introduce Modelo: ");
                coche3.setModelo(lector.nextLine());
                System.out.print("Tipo de coche: ");
                coche3.setTipoCoche(lector.nextLine());
                System.out.print("Color: ");
                coche3.setColor(lector.nextLine());
                System.out.print("Metalizado Si / No: ");
                while (!lector.nextLine().equalsIgnoreCase("si") && !lector.nextLine().equalsIgnoreCase("no")) {
                    if (lector.nextLine().equalsIgnoreCase("Si")) {
                        coche2.setMetalizado(true);
                    } else {
                        coche2.setMetalizado(false);
                    }
                }
                System.out.print("Año de fabricacion: ");
                coche3.setAFabricacion(lector.nextLine());
            } else {
                System.out.print("\u001B[H\u001B[2J");
                while (opcion != 0) {
                    System.out.print("1:Coche 1\n2:Coche 2\n3:Coche 3\n0:Salir\nOpcion: ");
                    opcion = lector.nextInt();
                    lector.nextLine();
                    while (opcion < 0 || opcion > 4) {
                        System.out.print("Opcion incorrecta introduzca una opcion entre 1 y 3\nOpcion: ");
                        opcion = lector.nextInt();
                        lector.nextLine();
                    }
                    if (opcion == 1) {
                        System.out.println(coche1.imprimirCoche());
                    } else if (opcion == 2) {
                        System.out.println(coche2.imprimirCoche());
                    } else if (opcion == 3) {
                        System.out.println(coche3.imprimirCoche());
                    }
                    if (opcion != 0) {
                        System.out.println("\nPulse Intro para volver al menu");
                        lector.nextLine();
                        System.out.print("\u001B[H\u001B[2J");
                    }
                }
                opcion = 4;
                System.out.print("\u001B[H\u001B[2J");
            }
            if (opcion != 0 && opcion != 4) {
                System.out.println("\nPulse Intro para volver al menu");
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            } else if (opcion == 0) {
                System.out.println("---------------Fin del Programa---------------");
            }
        }
        while (opcion != 0);
    }
}
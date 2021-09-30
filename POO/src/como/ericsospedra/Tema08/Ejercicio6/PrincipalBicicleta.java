package como.ericsospedra.Tema08.Ejercicio6;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrincipalBicicleta {
    static Scanner lector = new Scanner(System.in);
    static Bicicletas[] baseDatos = new Bicicletas[1];
    static Bicicletas[] aux;
    static Bicicletas bicicleta;
    static int i = 0;
    static boolean existe;
    static String decision;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion, retificacion;
        do {
            System.out.print("***************************\n" + "** GESTIÓN DE BICICLETAS **\n" + "***************************\n" +
                    "1.- Añadir bicicleta ...\n" + "2.- Vender bicicleta ...\n" + "3.- Consultar bicicleta ...\n" + "4.- Mostrar stock ...\n"
                    + "------------------------------------\n" + "0.- Salir\nOpcion: ");
            opcion = lector.nextInt();
            System.out.print("\u001B[H\u001B[2J");
            switch (opcion) {
                case 1:
                    do {
                        if (i >= baseDatos.length) {
                            for (int j = 0; j < baseDatos.length; j++) {
                                aux = new Bicicletas[baseDatos.length];
                                aux[j] = baseDatos[j];
                            }
                            baseDatos = new Bicicletas[aux.length + 1];
                            for (int j = 0; j < aux.length; j++) {
                                baseDatos[j] = aux[j];
                            }
                        }
                        baseDatos[i] = bicicleta = new Bicicletas(0, null, null, 0, 0,
                                false, null, 0, 0);
                        referencia();
                        if (!existe) {
                            marca();
                            modelo();
                            peso();
                            pulgadas();
                            motor();
                            fechaDeFabricacion();
                            precio();
                            existencias();
                            decision = null;
                            System.out.print("\u001B[H\u001B[2J");
                            System.out.printf("\tDatos Bicicleta\n" + "---------------------------------\n" + "Referencia\t\t" + "%1d\n" + "Marca\t\t\t" + "%2s\n" +
                                            "Modelo\t\t\t" + "%2s\n" + "Peso\t\t\t" + "%2.1f" + "Kg\n" + "Pulgadas\t\t" + "%2.1f" + "\"\n" + "Motor\t\t\t" + "%2s\n" + "Fecha de fabricacion\t" +
                                            "%2tD\n" + "Precio\t\t\t" + "%2.2f" + "€\n" + "Existencias\t\t" + "%1d\n", baseDatos[i].getExistencias(), baseDatos[i].getMarca(),
                                    baseDatos[i].getModelo(), baseDatos[i].getPeso(), baseDatos[i].getRuedasPulgadas(), baseDatos[i].getMotor(),
                                    baseDatos[i].getFechaDeFabricacion().getTime(), baseDatos[i].getPrecio(), baseDatos[i].getExistencias());
                            System.out.print("¿Estan correctos los datos?\nRespuesta: ");
                            decision = lector.nextLine();
                            while (!decision.equalsIgnoreCase("Si") && !decision.equalsIgnoreCase("No")) {
                                System.out.print("Introduzca si o no\nRespuesta: ");
                                decision = lector.nextLine();
                            }
                            if (decision.equalsIgnoreCase("No")) {
                                do {
                                    decision = null;
                                    System.out.print("\u001B[H\u001B[2J");
                                    System.out.print("Que dato deseas cambiar" + "---------------------------------\n" + "1:Referencia\n2:Marca\n3:Modelo\n" +
                                            "4:Peso\n5:Pulgadas de las Ruedas\n6:Motor\n7:Fecha de fabricacion\n8:Precio\n9:Numero de existencias\nOpcion: ");
                                    retificacion = lector.nextInt();
                                    lector.nextLine();
                                    switch (retificacion) {
                                        case 1:
                                            referencia();
                                            break;
                                        case 2:
                                            marca();
                                            break;
                                        case 3:
                                            modelo();
                                            break;
                                        case 4:
                                            peso();
                                            break;
                                        case 5:
                                            pulgadas();
                                            break;
                                        case 6:
                                            motor();
                                            break;
                                        case 7:
                                            fechaDeFabricacion();
                                            break;
                                        case 8:
                                            precio();
                                            break;
                                        case 9:
                                            existencias();
                                            break;
                                        default:
                                            System.out.println("Error de menu");
                                            break;
                                    }
                                    System.out.printf("\tDatos Bicicleta\n" + "---------------------------------\n" + "Referencia\t\t" + "%1d\n" + "Marca\t\t\t" + "%2s\n" + "Modelo\t\t\t" +
                                                    "%2s\n" + "Peso\t\t\t" + "%2.1f" + "Kg\n" + "Pulgadas\t\t" + "%2.1f" + "\"\n" + "Motor\t\t\t" + "%2s\n" + "Fecha de fabricacion\t" + "%2tD\n" +
                                                    "Precio\t\t\t" + "%2.2f" + "€\n" + "Existencias\t\t" + "%1d\n", baseDatos[i].getExistencias(), baseDatos[i].getMarca(), baseDatos[i].getModelo(),
                                            baseDatos[i].getPeso(), baseDatos[i].getRuedasPulgadas(), baseDatos[i].getMotor(), baseDatos[i].getFechaDeFabricacion().getTime(),
                                            baseDatos[i].getPrecio(), baseDatos[i].getExistencias());
                                    System.out.print("Deseas modificar algo mas\nRespuesta");
                                    decision = lector.nextLine();
                                    System.out.print("\u001B[H\u001B[2J");
                                }
                                while (decision.equalsIgnoreCase("Si"));
                                i++;
                            }
                        } else {
                            i--;
                        }
                        System.out.print("Deseas introducir otra bicicleta\nRespuesta: ");
                    }
                    while (lector.nextLine().equalsIgnoreCase("Si"));
                    System.out.print("\u001B[H\u001B[2J");
                    break;
                case 2:
                    System.out.print("Introduzca la referencia de la bicicleta que desee vender\nReferencia: ");
                    venta(lector.nextInt());
                    lector.nextLine();
                    System.out.print("\u001B[H\u001B[2J");
                    break;
                case 3:
                    decision = null;
                    do {
                        System.out.print("***********************\n** CONSULTA BICICLETA **\n***********************\n1.- Consultar por referencia ...\n" +
                                "2.- Consultar por marca ...\n3.- Consultar por modelo ...\n---------------------------------\n0.- Volver al menú principal\nOpcion: ");
                        retificacion = lector.nextInt();
                        lector.nextLine();
                        switch (retificacion) {
                            case 1:
                                System.out.print("Introduce la referencia\nReferencia: ");
                                consultaReferencia(lector.nextInt());
                                lector.nextLine();
                                System.out.print("\u001B[H\u001B[2J");
                                break;
                            case 2:
                                System.out.print("Introduce la marca\nMarca: ");
                                consultaMarca(lector.nextLine());
                                System.out.print("\u001B[H\u001B[2J");
                                break;
                            case 3:
                                System.out.print("Introduce la modelo\nModelo: ");
                                consultaModelo(lector.nextLine());
                                System.out.print("\u001B[H\u001B[2J");
                                break;
                            case 0:
                                System.out.print("Saliendo al menu principal");
                                decision = "Si";
                                System.out.print("\u001B[H\u001B[2J");
                                break;
                            default:
                                System.out.print("Error de consulta");
                                break;
                        }
                        System.out.print("Deseas consultar algo mas\nRespuesta: ");
                        decision = lector.nextLine();
                        System.out.print("\u001B[H\u001B[2J");
                    }
                    while (decision.equalsIgnoreCase("Si"));
                    break;
                case 4:
                    System.out.print("Introduzca la referencia de la que desee consultar las existencias\nReferencia: ");
                    stock(lector.nextInt());
                    lector.nextLine();
                    System.out.print("\u001B[H\u001B[2J");
                    break;
                case 0:
                    System.out.println("Fin de programa");
                    break;
            }
        }
        while (opcion != 0);
    }

    public static boolean referencia() {
        System.out.print("Introduce la referencia\n" + "Referencia: ");
        baseDatos[i].setReferencia(lector.nextInt());
        while (baseDatos[i].getReferencia() < 0) {
            System.out.print("Introduce una referencia valida Ej.(0~100)\n" + "Referencia: ");
            baseDatos[i].setReferencia(lector.nextInt());
        }
        lector.nextLine();
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[i].getReferencia() == baseDatos[j].getReferencia() && i != j) {
                incrementarExistencias(baseDatos[j].getReferencia());
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        return existe;
    }

    public static void marca() {
        System.out.print("Introduce la marca de la bicicleta\nMarca: ");
        baseDatos[i].setMarca(lector.nextLine());
        while (baseDatos[i].getMarca().equals(null)) {
            System.out.print("Introduce una marca valida\n" + "Marca: ");
            baseDatos[i].setReferencia(lector.nextInt());
        }
        for (int j = 0; j < baseDatos.length; j++) {
            if (!baseDatos[i].getMarca().equalsIgnoreCase(baseDatos[j].getMarca()) && i != j) {
                System.out.print("¿Es una marca nueva?\nRespuesta: ");
                decision = lector.nextLine();
                while (!decision.equalsIgnoreCase("Si") && !decision.equalsIgnoreCase("Si")) {
                    System.out.print("Introduce si o no");
                    decision = lector.nextLine();
                }
                if (!decision.equalsIgnoreCase("Si")) {
                    System.out.print("Vuelve a introducir la marca\nMarca: ");
                    baseDatos[i].setMarca(lector.nextLine());
                }
            }
        }
    }

    public static void modelo() {
        System.out.print("Introduce la modelo de la bicicleta\nModelo: ");
        baseDatos[i].setModelo(lector.nextLine());
        while (baseDatos[i].getModelo().equals(null)) {
            System.out.print("Introduce una referencia valida Ej.(0~100)\n" + "Referencia: ");
            baseDatos[i].setReferencia(lector.nextInt());
        }
        for (int j = 0; j < baseDatos.length; j++) {
            if (!baseDatos[i].getModelo().equalsIgnoreCase(baseDatos[j].getModelo()) && i != j) {
                System.out.print("¿Es un modelo nuevo?\nRespuesta");
                decision = lector.nextLine();
                while (!decision.equalsIgnoreCase("Si") && !decision.equalsIgnoreCase("Si")) {
                    System.out.print("Introduce si o no");
                    decision = lector.nextLine();
                }
                if (!decision.equalsIgnoreCase("Si")) {
                    System.out.print("Vuelve a introducir el modelo\nModelo: ");
                    baseDatos[i].setModelo(lector.nextLine());
                }
            }
        }
    }

    public static void peso() {
        System.out.print("Introduce el peso, se aceptan decimales\nPeso: ");
        baseDatos[i].setPeso(lector.nextFloat());
        while (baseDatos[i].getPeso() < 0) {
            System.out.print("Introduce un peso valido Ej.(0kg ~ 50kg)\n" + "Peso: ");
            baseDatos[i].setReferencia(lector.nextInt());
            if (baseDatos[i].getPeso() > 50) {
                System.out.print("¿El peso esta bien?\nPeso: " + baseDatos[i].getPeso() + "Kg\nRespuesta: ");
                decision = lector.nextLine();
                while (!decision.equalsIgnoreCase("Si") && !decision.equalsIgnoreCase("Si")) {
                    System.out.print("Introduce si o no");
                    decision = lector.nextLine();
                }
                if (!lector.nextLine().equalsIgnoreCase("Si")) {
                    System.out.print("Vuelve a introducir el peso\nPeso: ");
                    baseDatos[i].setPeso(lector.nextFloat());
                    lector.nextLine();
                }
            }
        }
    }

    public static void pulgadas() {
        System.out.print("Introduce las pulgadas de las ruedas\nPulgadas: ");
        baseDatos[i].setRuedasPulgadas(lector.nextFloat());
        lector.nextLine();
        while (baseDatos[i].getRuedasPulgadas() < 16) {
            System.out.print("Introduce un numero de pulgadas valido, Ej.(16 ~ 29)\nPulgadas: ");
            baseDatos[i].setRuedasPulgadas(lector.nextFloat());
            if (baseDatos[i].getRuedasPulgadas() > 29) {
                System.out.print("¿Las pulgadas estan bien?\nRespuesta: ");
                decision = lector.nextLine();
                while (!decision.equalsIgnoreCase("Si") && !decision.equalsIgnoreCase("Si")) {
                    System.out.print("Introduce si o no");
                    decision = lector.nextLine();
                }
                if (!lector.nextLine().equalsIgnoreCase("Si")) {
                    System.out.print("Vuelve a introducir el peso\nPeso: ");
                    baseDatos[i].setRuedasPulgadas(lector.nextFloat());
                    lector.nextLine();
                }
            }
        }
    }

    public static void motor() {
        System.out.print("¿Tiene motor?\nRespuesta: ");
        decision = lector.nextLine();
        while (!decision.equalsIgnoreCase("Si") && !decision.equalsIgnoreCase("No")) {
            System.out.print("Introduce si o no\nRespuesta: ");
            decision = lector.nextLine();
        }
        if (decision.equalsIgnoreCase("Si")) {
            baseDatos[i].setMotor(true);
        } else {
            baseDatos[i].setMotor(false);
        }
    }

    public static void fechaDeFabricacion() {
        System.out.print("Introduzca la fecha de fabricacion con formato dd/mm/yyyy, EJ(15/03/1996)\nFecha: ");
        String[] conversion = lector.nextLine().split("/");
        int[] fecha = new int[conversion.length];
        for (int j = 0; j < conversion.length; j++) {
            fecha[j] = Integer.parseInt(conversion[j]);
        }
        GregorianCalendar fechaFabricacion = new GregorianCalendar(fecha[2], fecha[1] - 1, fecha[0]);
        baseDatos[i].setFechaDeFabricacion(fechaFabricacion);
    }

    public static void precio() {
        System.out.print("Introduzca el precio\nPrecio: ");
        baseDatos[i].setPrecio(lector.nextFloat());
        lector.nextLine();
        while (baseDatos[i].getPrecio() < 0) {
            System.out.print("Introduce un precio valido entre 0~\u221E\nPrecio: ");
            baseDatos[i].setPrecio(lector.nextFloat());
            lector.nextLine();
        }
    }

    public static void existencias() {
        System.out.print("¿Cuantas existencias hay?\nExistencias: ");
        baseDatos[i].setExistencias(lector.nextInt());
        lector.nextLine();
        while (baseDatos[i].getExistencias() < 0) {
            System.out.print("Introduce un numero valido de existencias entre 0~\u221E\nExistencias: ");
            baseDatos[i].setExistencias(lector.nextInt());
            lector.nextLine();
        }
    }

    public static void incrementarExistencias(int referencia) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[j].getReferencia() == referencia) {
                baseDatos[j].setExistencias(baseDatos[j].getExistencias() + 1);
            }
        }
    }

    public static void venta(int referencia) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (referencia == baseDatos[j].getReferencia()) {
                if (baseDatos[j].getExistencias() > 0) {
                    System.out.print("Bicicleta " + baseDatos[j].getReferencia() + " vendida correctamente");
                    baseDatos[j].setExistencias(baseDatos[j].getExistencias() - 1);
                    break;
                } else {
                    System.out.print("No hay existencias de la referencia: " + baseDatos[j].getExistencias());
                }
            }
        }
    }

    public static void consultaReferencia(int referencia) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[j] != null) {
                if (referencia == baseDatos[j].getReferencia()) {
                    System.out.printf("\tDatos Bicicleta\n" + "---------------------------------\n" + "Referencia\t\t" + "%1d\n" + "Marca\t\t\t" + "%2s\n" + "Modelo\t\t\t" +
                                    "%2s\n" + "Peso\t\t\t" + "%2.1f" + "Kg\n" + "Pulgadas\t\t" + "%2.1f" + "\"\n" + "Motor\t\t\t" + "%2s\n" + "Fecha de fabricacion\t" + "%2tD\n" + "Precio\t\t\t" + "%2.2f" + "€\n" +
                                    "Existencias\t\t" + "%1d\n", baseDatos[j].getExistencias(), baseDatos[j].getMarca(), baseDatos[j].getModelo(), baseDatos[j].getPeso(),
                            baseDatos[j].getRuedasPulgadas(), baseDatos[j].getMotor(), baseDatos[j].getFechaDeFabricacion().getTime(), baseDatos[j].getPrecio(), baseDatos[j].getExistencias());
                    System.out.print("Intro para continuar...");
                    lector.nextLine();
                    break;
                }
            }
        }
    }

    public static void consultaMarca(String marca) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[j] != null) {
                if (marca.equalsIgnoreCase(baseDatos[j].getMarca())) {
                    System.out.printf("\tDatos Bicicleta\n" + "---------------------------------\n" + "Referencia\t\t" + "%1d\n" + "Marca\t\t\t" + "%2s\n" + "Modelo\t\t\t" +
                                    "%2s\n" + "Peso\t\t\t" + "%2.1f" + "Kg\n" + "Pulgadas\t\t" + "%2.1f" + "\"\n" + "Motor\t\t\t" + "%2s\n" + "Fecha de fabricacion\t" + "%2tD\n" + "Precio\t\t\t" +
                                    "%2.2f" + "€\n" + "Existencias\t\t" + "%1d\n", baseDatos[j].getExistencias(), baseDatos[j].getMarca(), baseDatos[j].getModelo(), baseDatos[j].getPeso(),
                            baseDatos[j].getRuedasPulgadas(), baseDatos[j].getMotor(), baseDatos[j].getFechaDeFabricacion().getTime(), baseDatos[j].getPrecio(), baseDatos[j].getExistencias());
                    System.out.print("Intro para continuar...");
                    lector.nextLine();
                }
            }
        }
    }

    public static void consultaModelo(String modelo) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[j] != null) {
                if (modelo.equalsIgnoreCase(baseDatos[j].getModelo())) {
                    System.out.printf("\tDatos Bicicleta\n" + "---------------------------------\n" + "Referencia\t\t" + "%1d\n" + "Marca\t\t\t" + "%2s\n" +
                                    "Modelo\t\t\t" + "%2s\n" + "Peso\t\t\t" + "%2.1f" + "Kg\n" + "Pulgadas\t\t" + "%2.1f" + "\"\n" + "Motor\t\t\t" + "%2s\n" + "Fecha de fabricacion\t" + "%2tD\n" +
                                    "Precio\t\t\t" + "%2.2f" + "€\n" + "Existencias\t\t" + "%1d\n", baseDatos[j].getExistencias(), baseDatos[j].getMarca(),
                            baseDatos[j].getModelo(), baseDatos[j].getPeso(), baseDatos[j].getRuedasPulgadas(), baseDatos[j].getMotor(), baseDatos[j].getFechaDeFabricacion().getTime(),
                            baseDatos[j].getPrecio(), baseDatos[j].getExistencias());
                    System.out.print("Intro para continuar...");
                    lector.nextLine();
                }
            }
        }
    }

    public static void stock(int referencia) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[j] != null) {
                if (referencia == baseDatos[j].getReferencia()) {
                    System.out.printf("\tDatos Bicicleta\n" + "---------------------------------\n" + "Referencia\t\t" + "%1d\n" + "Marca\t\t\t" + "%2s\n" + "Modelo\t\t\t" +
                            "%2s\n" + "Existencias\t\t" + "%1d\n", baseDatos[j].getReferencia(), baseDatos[j].getMarca(), baseDatos[j].getModelo(), baseDatos[j].getExistencias());
                    System.out.print("Intro para continuar...");
                    lector.nextLine();
                }
            }
        }
    }
}
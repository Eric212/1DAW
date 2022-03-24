package como.ericsospedra.Tema08.Ejercicio3;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrincipalAlumno {
    static int tam, opcion, i = 0, comprobante, numAlum = 0;
    static String decision;
    static Scanner lector = new Scanner(System.in);
    static Alumnos[] alumnos;
    static Alumnos[] auxiliar;
    static GregorianCalendar fechaNacimiento;
    static Alumnos eric;

    public static void main(String[] args) {
        System.out.print("Cuantos alumnos vamos a Administrar\nAlumnos: ");
        tam = lector.nextInt();
        System.out.print("\u001B[H\u001B[2J");
        alumnos = new Alumnos[tam];
        lector.nextLine();
        alumnos[i] = eric = new Alumnos();
        i++;
        menu();
    }

    public static void menu() {
        opcion = 0;
        do {
            System.out.print("**********************\n**GESTIÓN DE ALUMNOS**\n**********************\n\n1.Nuevo alumno ...\n2.Baja de alumno ...\n3.Consultas ...\n-----------------------------------\n0.Salir\nOpcion: ");
            opcion = lector.nextInt();
            lector.nextLine();
            while (opcion < 0 || opcion > 3) {
                System.out.print("Opcion incorrecta introduzca una opcion entre 1 y 3\nOpcion: ");
                opcion = lector.nextInt();
                lector.nextLine();
            }
            System.out.print("\u001B[H\u001B[2J");
            if (opcion == 0) {
                System.out.println("------------------------------------------Fin de Programa------------------------------------------");
            } else {
                if (opcion == 1) {
                    crearAlumno();
                } else if (opcion == 2) {
                    bajaAlumno();
                } else {
                    visualizarAlumno();
                    opcion = 5;
                }
            }
        }
        while (opcion != 0);
    }

    public static void crearAlumno() {
        Alumnos alumno = new Alumnos(0, null, null, null, 0, null, 0);
        comprobante = 0;
        tam = 0;
        for (int j = 0; j < alumnos.length; j++) {
            if (numAlum == i) {
                break;
            } else if (alumnos[j] == null) {
                alumnos[j] = alumnos[j + 1];
                alumnos[j + 1] = null;
            } else {
                numAlum++;
            }
        }
        String[] conversion;
        int[] fecha;
        if (i < alumnos.length) {
            alumnos[i] = alumno;
            System.out.print("------------Datos Alumno------------\nNia del alumno: ");
            comprobante = lector.nextInt();
            lector.nextLine();
            for (int j = 0; j < numAlum; j++) {
                if (alumnos[j].getNia() == comprobante || alumnos[i].getNia() == alumnos[j].getNia() && j != i) {
                    while (alumnos[j].getNia() == comprobante || alumnos[i].getNia() == alumnos[j].getNia() && j != i) {
                        System.out.print("Introduce un NIA valido, este ya pertenece a un alumno\nNIA: ");
                        comprobante = lector.nextInt();
                        lector.nextLine();
                        alumnos[i].setNia(comprobante);
                    }
                } else if (tam + 1 == i) {
                    break;
                } else {
                    tam++;
                }
            }
            alumnos[i].setNia(comprobante);
            System.out.print("Nombre del alumno(Sin apellidos): ");
            alumnos[i].setNombre(lector.nextLine());
            System.out.print("Apellidos del alumno: ");
            alumnos[i].setApellidos(lector.nextLine());
            System.out.print("Fecha de nacimiento del alumno (dd/mm/yyyy): ");
            conversion = lector.nextLine().split("/");
            fecha = new int[conversion.length];
            for (int j = 0; j < conversion.length; j++) {
                fecha[j] = Integer.parseInt(conversion[j]);
            }
            fechaNacimiento = new GregorianCalendar(fecha[2], fecha[1] - 1, fecha[0]);
            alumnos[i].setFechaNacimiento(fechaNacimiento);
            System.out.print("Grupo al que pertenece el alumno: ");
            alumnos[i].setGrupo(lector.nextLine().toUpperCase().trim());
            System.out.print("Edad del alumno: ");
            alumnos[i].setEdad(lector.nextInt());
            System.out.print("Telefono del alumno: ");
            alumnos[i].setTelefono(lector.nextInt());
            lector.nextLine();
            i++;
            System.out.print("\u001B[H\u001B[2J");
        } else {
            System.out.println("No puedes introducir mas alumnos, tu lista solo dispone de espacio para " + alumnos.length + " Alumnos\nDesea hacer mas grande su lista de alumnos: Si/No\nDecisión: ");
            if (lector.nextLine().equalsIgnoreCase("Si")) {
                auxiliar = new Alumnos[alumnos.length];
                System.out.print("\u001B[H\u001B[2J");
                System.out.print("Cuantos alumnos quieres añadir\nAlumnos: ");
                tam = lector.nextInt();
                for (int j = 0; j < alumnos.length; j++) {
                    auxiliar[j] = alumnos[j];
                }
                alumnos = new Alumnos[auxiliar.length + tam];
                for (int j = 0; j < auxiliar.length; j++) {
                    alumnos[j] = auxiliar[j];
                }
            }
        }
    }

    public static void bajaAlumno() {
        comprobante = 0;
        System.out.print("------------Baja Alumnos------------\nNia del alumno que se desea dar de baja: ");
        comprobante = lector.nextInt();
        lector.nextLine();
        for (int j = 0; j < alumnos.length; j++) {
            if (alumnos[j].getNia() == comprobante) {
                System.out.print("Nia: " + alumnos[j].getNia() + "\nNombre: " + alumnos[j].getNombre() + "\nApellidos: " + alumnos[j].getApellidos() + "\nFecha de nacimiento: " + alumnos[j].getFechaNacimiento().getTime() + "\nGrupo: " + alumnos[j].getGrupo() + "\nTelefono: " + alumnos[j].getTelefono());
                System.out.println();
                System.out.print("Desea borrar este alumno: Si/No: ");
                System.out.print("\u001B[H\u001B[2J");
                decision = lector.nextLine();
                while (!decision.equalsIgnoreCase("si") && !decision.equalsIgnoreCase("no")) {
                    decision = lector.nextLine();
                    lector.nextLine();
                }
                if (decision.equalsIgnoreCase("Si")) {
                    alumnos[j] = null;
                    i--;
                    numAlum--;
                    System.out.println("Alumno borrado satisfactoriamente\nPulse enter para continuar ...");
                    lector.nextLine();
                    for (int k = 0; k < alumnos.length; k++) {
                        if (numAlum == i) {
                            break;
                        } else if (alumnos[k] == null) {
                            alumnos[k] = alumnos[k + 1];
                            alumnos[k + 1] = null;
                        } else {
                            numAlum++;
                        }
                    }
                    break;
                }
            }
        }
    }

    public static void visualizarAlumno() {
        for (int j = 0; j < alumnos.length; j++) {
            if (numAlum == i) {
                break;
            } else if (alumnos[j] == null) {
                alumnos[j] = alumnos[j + 1];
                alumnos[j + 1] = null;
            } else {
                numAlum++;
            }
        }
        do {
            System.out.print("**********************\n***** CONSULTAS ******\n**********************\n1.Por grupo ...\n2.Por edad ...\n3.Por nia ...\n4.Por apellidos\n-----------------------------------\n0.Volver al menu principal\nOpcion: ");
            opcion = lector.nextInt();
            lector.nextLine();
            System.out.print("\u001B[H\u001B[2J");
            if (opcion == 1) {
                System.out.print("Eliga el grupo por el que desee agrupar\nGrupo: ");
                decision = lector.nextLine().trim();
                System.out.printf("%8s" + "%16s" + "%21s" + "%37s" + "%15s" + "%20s" + "%12s\n", "NIA", "Nombre", "Apellidos", "Fecha de nacimiento", "Grupo", "Teléfono", "Edad");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                for (int j = 0; j < alumnos.length; j++) {
                    if (j == numAlum) {
                        break;
                    }
                    if (alumnos[j].getGrupo().equalsIgnoreCase(decision)) {
                        System.out.printf("%10d" + "%13s" + "%26s" + "%20te/%<tm/%<tY" + "%20s" + "%21d" + "%10d\n", alumnos[j].getNia(), alumnos[j].getNombre(), alumnos[j].getApellidos(), alumnos[j].getFechaNacimiento().getTime(), alumnos[j].getGrupo(), alumnos[j].getTelefono(), alumnos[j].getEdad());
                    }
                }
                System.out.println("Pulse enter para continuar ...");
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            } else if (opcion == 2) {
                System.out.print("Eliga la edad por la que desee agrupar\nEdad: ");
                comprobante = lector.nextInt();
                lector.nextLine();
                System.out.printf("%8s" + "%15s" + "%21s" + "%37s" + "%15s" + "%20s" + "%10s\n", "NIA", "Nombre", "Apellidos", "Fecha de nacimiento", "Grupo", "Teléfono", "Edad");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                for (int j = 0; j < alumnos.length; j++) {
                    if (j == numAlum) {
                        break;
                    }
                    if (alumnos[j].getEdad() == comprobante) {
                        System.out.printf("%10d" + "%12s" + "%25s" + "%21te/%<tm/%<tY" + "%20s" + "%21d" + "%8d\n", alumnos[j].getNia(), alumnos[j].getNombre(), alumnos[j].getApellidos(), alumnos[j].getFechaNacimiento().getTime(), alumnos[j].getGrupo(), alumnos[j].getTelefono(), alumnos[j].getEdad());
                    }
                }
                System.out.println("Pulse enter para continuar ...");
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            } else if (opcion == 3) {
                System.out.print("Eliga el NIA que desee buscar\nNIA: ");
                comprobante = lector.nextInt();
                lector.nextLine();
                System.out.printf("%8s" + "%16s" + "%21s" + "%37s" + "%15s" + "%20s" + "%12s\n", "NIA", "Nombre", "Apellidos", "Fecha de nacimiento", "Grupo", "Teléfono", "Edad");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                for (int j = 0; j < alumnos.length; j++) {
                    if (j == numAlum) {
                        break;
                    }
                    if (alumnos[j].getNia() == comprobante) {
                        System.out.printf("%10d" + "%13s" + "%26s" + "%20te/%<tm/%<tY" + "%20s" + "%21d" + "%10d\n", alumnos[j].getNia(), alumnos[j].getNombre(), alumnos[j].getApellidos(), alumnos[j].getFechaNacimiento().getTime(), alumnos[j].getGrupo(), alumnos[j].getTelefono(), alumnos[j].getEdad());
                    }
                }
                System.out.println("Pulse enter para continuar ...");
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            } else if (opcion == 4) {
                System.out.print("Introduzca el apellido\nApellido: ");
                decision = lector.nextLine();
                System.out.printf("%8s" + "%16s" + "%21s" + "%37s" + "%15s" + "%20s" + "%12s\n", "NIA", "Nombre", "Apellidos", "Fecha de nacimiento", "Grupo", "Teléfono", "Edad");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                for (int j = 0; j < alumnos.length; j++) {
                    if (j == numAlum) {
                        break;
                    }
                    if (alumnos[j].getApellidos().equalsIgnoreCase(decision)) {
                        System.out.printf("%10d" + "%13s" + "%26s" + "%20te/%<tm/%<tY" + "%20s" + "%21d" + "%10d\n", alumnos[j].getNia(), alumnos[j].getNombre(), alumnos[j].getApellidos(), alumnos[j].getFechaNacimiento().getTime(), alumnos[j].getGrupo(), alumnos[j].getTelefono(), alumnos[j].getEdad());
                    }
                }
                System.out.println("Pulse enter para continuar ...");
                lector.nextLine();
                System.out.print("\u001B[H\u001B[2J");
            }
        }
        while (opcion != 0);
    }
}
//Poner comprobante de numero telefono, Calcular edad por gregorian calendar
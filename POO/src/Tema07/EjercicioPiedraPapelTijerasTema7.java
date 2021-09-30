import java.util.Scanner;
import java.util.Random;

public class EjercicioPiedraPapelTijerasTema7 {
    public static int puntuacionJugador = 0;
    public static int puntuacionCpu = 0;
    public static int empate = 0;
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.print("==========================================\n\tPIEDRA,  PAPEL O TIJERAS\n==========================================\n1. Nueva Parrtida...\n2.Mostrar puntuacion...\n------------------------------------------\n0.Salir\nElige una opcion: ");
            opcion = lector.nextInt();
            lector.nextLine();
            while (opcion < 0 || opcion > 2) {
                System.out.print("Elige una opcion valida entre 0 y 2: ");
                opcion = lector.nextInt();
                lector.nextLine();
            }
            if (opcion == 1) {
                partida();
            } else if (opcion == 2) {
                puntuacion();
            }
        }
        while (opcion != 0);
    }

    public static void partida() {
        Random alea = new Random();
        String caracter;
        int opcion, jugador, cpu;
        System.out.print("***********\n*  ELIGE  *\n***********\n1. Piedra\n2. Papel\n3. Tijeras\nIndica tú elección: ");
        opcion = lector.nextInt();
        lector.nextLine();
        jugador = opcion;
        if (jugador == 1) {
            System.out.println("Jugador elige Piedra");
        } else if (jugador == 2) {
            System.out.println("Jugador elige Papel");
        } else {
            System.out.println("Jugador elige Tijeras");
        }
        cpu = alea.nextInt(3 - 0 + 1) + 1;
        if (cpu == 1) {
            System.out.println("CPU elige Piedra");
        } else if (cpu == 2) {
            System.out.println("CPU elige Papel");
        } else {
            System.out.println("CPU elige Tijeras");
        }
        if (cpu == jugador) {
            System.out.println("Habeis Empatado");
            EjercicioPiedraPapelTijerasTema7.empate++;
        } else {
            if (jugador > cpu && cpu != 1) {
                System.out.println("¡¡Has Ganado!!");
                EjercicioPiedraPapelTijerasTema7.puntuacionJugador++;
            } else if (jugador > cpu && cpu == 1) {
                System.out.println("Has Perdido");
                EjercicioPiedraPapelTijerasTema7.puntuacionCpu++;
                ;
            } else if (cpu > jugador && jugador != 1) {
                System.out.println("Has Perdido");
                EjercicioPiedraPapelTijerasTema7.puntuacionCpu++;
            } else if (cpu > jugador && jugador == 1) {
                System.out.println("¡¡Has Ganado!!");
                EjercicioPiedraPapelTijerasTema7.puntuacionJugador++;
            }
        }
        System.out.print("Pulsa INTRO para continuar...");
        caracter = lector.nextLine();
        while (!caracter.isEmpty()) {
            System.out.print("Pulsa INTRO para continuar...");
            caracter = lector.nextLine();
        }
        System.out.print("\u001B[H\u001B[2J");
    }

    public static void puntuacion() {
        String caracter;
        System.out.printf("*************Puntuaciones*************\nVictorias Jugador:" + "%20d\n" + "Victorias CPU:" + "%22d\n" + "Empatadas:" + "%30d\n", EjercicioPiedraPapelTijerasTema7.puntuacionJugador, EjercicioPiedraPapelTijerasTema7.puntuacionCpu, EjercicioPiedraPapelTijerasTema7.empate);
        System.out.print("Pulsa INTRO para continuar...");
        caracter = lector.nextLine();
        while (!caracter.isEmpty()) {
            System.out.print("Pulsa INTRO para continuar...");
            caracter = lector.nextLine();
        }
        System.out.print("\u001B[H\u001B[2J");
    }
}
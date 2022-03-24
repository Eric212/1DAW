package como.ericsospedra.Tema11.Ejercicio03;
import java.util.ArrayList;
import java.util.Scanner;
public class PrincipalCoche {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String opcion;
        ArrayList<Integer> velocidadMarchas = new ArrayList<>();
        CocheCambioAutomatico cocheAu = new CocheCambioAutomatico(" ", new ArrayList<>());
        CocheCambioManual cocheMan = new CocheCambioManual(" ", new ArrayList<>());
        ArrayList<Coche> coches = new ArrayList<>();
        int numeroCoches;
        System.out.print("¿Cuantos coches deseas introducir?\nNumero de coches: ");
        numeroCoches = Integer.parseInt(lector.nextLine());
        do {
            String matricula;
            System.out.print("Introduce la matricula del coche\nMatricula: ");
            matricula = lector.nextLine();
            System.out.print("El coche es automatico\nSi/No: ");
            opcion = lector.nextLine();
            while (opcion.equalsIgnoreCase("Si") && opcion.equalsIgnoreCase("No")) {
                System.out.print("Introduce Si o No\nRespuesta: ");
                opcion = lector.nextLine();
            }
            if (opcion.equalsIgnoreCase("Si")) {
                System.out.print("Cuantas marchas tiene el coche\nMarchas: ");
                int marchas = Integer.parseInt(lector.nextLine());
                for (int i = 0; i < marchas; i++) {
                    System.out.print("Introduce la velocidad máxima de la marcha " + (i + 1) + ": ");
                    velocidadMarchas.add((Integer.parseInt(lector.nextLine())));
                }
                cocheAu.setMatricula(matricula);
                cocheAu.setVelocidadMaximaPorMarcha(velocidadMarchas);
                coches.add(cocheAu);
            } else {
                System.out.print("Cuantas marchas tiene el coche: ");
                int marchas = Integer.parseInt(lector.nextLine());
                for (int i = 0; i < marchas; i++) {
                    System.out.print("Introduce la velocidad máxima de la marcha " + (i + 1) + ": ");
                    velocidadMarchas.add((Integer.parseInt(lector.nextLine())));
                }
                cocheMan.setMatricula(matricula);
                cocheMan.setVelocidadMaximaPorMarcha(velocidadMarchas);
                coches.add(cocheMan);
            }
            if(cocheAu.getVelocidadMaximaPorMarcha()!=null) {
                cocheAu.acelerar(60);
            }
            if(cocheMan.getVelocidadMaximaPorMarcha()!=null) {
                cocheAu.acelerar(60);
                cocheMan.cambiarMarcha(3);
            }
            for (int i = 0; i < coches.size(); i++) {
                System.out.printf("%-10s" + "%-5d" + "%-5d" + "%-5s\n"
                        , coches.get(i).getMatricula(), coches.get(i).getVelocidadActual()
                        , coches.get(i).getMarchaActual(), coches.get(i).toString(coches.get(i).getVelocidadMaximaPorMarcha()));
            }
        }
        while (numeroCoches > coches.size());
    }
}
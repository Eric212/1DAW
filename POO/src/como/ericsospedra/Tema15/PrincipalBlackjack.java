package como.ericsospedra.Tema15;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalBlackjack {
    static Baraja baraja = new Baraja();
    static Cpu cpu=new Cpu();
    static Jugador player = new Jugador();
    static float apuesta;
    static int empates=0;
    static boolean jugarCpu=true;
    static boolean finJuego=false;
    static boolean cpuGame;
    static String sistema;
    public static void main(String[] args) {
        try {
            menu();
        }catch (NumberFormatException ex){
            System.out.println("No se ha introducido bien la opcion");
        }catch (IOException ex1){
            System.out.println("No se encuentra la carta a mostrar");
        }
    }
    public static void menu() throws NumberFormatException, IOException {
        int opcion;
        do {
            System.out.print("""
                    ***********************
                    ****** BLACKJACK ******
                    **********************
                    1. Nueva partida
                    2. Mostrar estadísticas
                    0. Salir\s
                    """);
            opcion=Integer.parseInt(new Scanner(System.in).nextLine());
            switch (opcion) {
                case 1 -> {
                    cpu = new Cpu();
                    player = new Jugador();
                    apuesta = 0;
                    cpuGame = false;
                    juego();
                }
                case 2 -> estadisticas();
            }
        }while(opcion!=0);
    }
    public static void juego() throws NumberFormatException,IOException{
        do {
            player.setPuntos(0);
            cpu.setPuntos(0);
            Collections.shuffle(baraja.getBaraja());
            if (apuestas()) {
                if (apuesta <= cpu.getDinero()) {
                    cpuGame = false;
                    inicio();
                    boolean continuar = true;
                    while (continuar) {
                        if (player.getPuntos() <= 21) {
                            int opcion;
                            opcion = jugada();
                            switch (opcion) {
                                case 1:
                                    player.setPuntos(mostrarCarta(comodin(baraja.getBaraja().get(0))).getValor() + player.getPuntos());
                                    baraja.getBaraja().remove(0);
                                    System.out.println("Puntuación: " + player.getPuntos());
                                    break;
                                case 2:
                                    continuar = false;
                                    System.out.println("Puntuación: " + player.getPuntos());
                                    break;
                                default:
                                    System.out.print("Has elegido una opcion que no existe\n" +
                                            "Pulse enter para continuar...");
                                    new Scanner(System.in).nextLine();
                                    break;
                            }
                        } else {
                            cpu.setPartidas(cpu.getPartidas() + 1);
                            continuar = false;
                            jugarCpu = false;
                        }
                    }
                    cpuGame = true;
                    if (jugarCpu) {
                        while (cpu.getPuntos() < 17) {
                            cpu.setPuntos(mostrarCarta(comodin(baraja.getBaraja().get(0))).getValor() + cpu.getPuntos());
                            baraja.getBaraja().remove(0);
                        }
                    }
                    ganador();
                }
            }else {
                finJuego=true;
            }
        }while(!finJuego);
    }
    public static void inicio()throws IOException{
        System.out.println("Cartas Jugador\n---------------");
        for(int i=0;i<2;i++){
            player.setPuntos(mostrarCarta(comodin(baraja.getBaraja().get(i))).getValor()+player.getPuntos());
            baraja.getBaraja().remove(i);
        }
        System.out.println("Puntuación: "+player.getPuntos());
        System.out.println("Cartas CPU\n-----------");
        cpuGame=true;
        for(int i=0;i<2;i++){
            cpu.setPuntos(mostrarCarta(comodin(baraja.getBaraja().get(i))).getValor()+cpu.getPuntos());
            baraja.getBaraja().remove(i);
        }
        System.out.println("Puntuación: "+cpu.getPuntos());
    }
    public static int jugada() throws NumberFormatException{
        Scanner lector = new Scanner(System.in);
        System.out.print("""
                Menu de juego
                -------------
                1:Dar Carta
                2:Plantarse
                Opcion: \s
                """);
        return Integer.parseInt(lector.nextLine());
    }
    public static Carta comodin(Carta carta) throws NumberFormatException{
        if(cpuGame) {
            if (carta.getNumero().equals("A")) {
                if(cpu.getPuntos()+11<=21){
                    carta.setValor(11);
                } else {
                    carta.setValor(1);
                }
            }
        }else{
            if (carta.getNumero().equals("A")) {
                System.out.println("Que valor desea que tenga el As, 1 o 11");
                int valor = Integer.parseInt(new Scanner(System.in).nextLine());
                while (valor != 1 && valor != 11) {
                    System.out.println("No has elegido un valor valido");
                    valor = Integer.parseInt(new Scanner(System.in).nextLine());
                }
                if (valor == 1) {
                    carta.setValor(1);
                    return carta;
                } else {
                    carta.setValor(11);
                    return carta;
                }
            }
        }
        return carta;
    }
    public static boolean apuestas()throws NumberFormatException{
        int dinero;
        boolean control=true;
        if(player.getDinero()>0){
            while (control) {
                System.out.print("Dinero: " + player.getDinero()
                    + "\n" + "¿Cuanto desea apostar?\nApuesta: ");
                dinero = Integer.parseInt(new Scanner(System.in).nextLine());
                if (player.getDinero() >= dinero&&dinero>0) {
                    apuesta = dinero;
                    return true;
                }else{
                    System.out.println("La apuesta es mas alta que el dinero que te queda");
                }
            }
        }else{
            return false;
        }
        return false;
    }
    public static void ganador(){
        if (cpu.getPuntos() < player.getPuntos()&&player.getPuntos()<=21||cpu.getPuntos()>21) {
            System.out.println(player.getPuntos()+" vs "+ cpu.getPuntos());
            System.out.println("Has ganado");
            player.setPartidas(player.getPartidas()+1);
            if(player.getPuntos()==21){
                player.setDinero(player.getDinero()+apuesta*1.25f+apuesta);
                cpu.setDinero(cpu.getDinero()-apuesta*1.25f);
            }else{
                player.setDinero(player.getDinero()+apuesta*2);
                cpu.setDinero(cpu.getDinero()-apuesta);
            }
        } else if (cpu.getPuntos() > player.getPuntos()&&cpu.getPuntos()<22||player.getPuntos()>21) {
            System.out.println(player.getPuntos()+" vs "+ cpu.getPuntos());
            System.out.println("Has perdido");
            cpu.setPartidas(cpu.getPartidas()+1);
            if(cpu.getPuntos()==21){
                cpu.setDinero(cpu.getDinero()+apuesta*1.25f+apuesta);
                player.setDinero(player.getDinero()-apuesta*1.25f);
            }else{
                cpu.setDinero(cpu.getDinero()+apuesta*2);
                player.setDinero(player.getDinero()-apuesta);
            }
        } else {
            System.out.println(player.getPuntos()+" vs "+ cpu.getPuntos());
            System.out.println("Has empatado");
            player.setDinero(player.getDinero()+apuesta);
            cpu.setDinero(cpu.getDinero()+apuesta);
            empates+=1;
        }
    }
    public static void estadisticas(){
        System.out.printf("%-10s"+"%1d\n%-10s"+"%1d\n%-10s"+"%1d\n","Partidas ganas CPU:"
                ,cpu.getPartidas(),"Partidas ganas Jugador:",player.getPartidas(),"Empates:",empates);
    }
    public static Carta mostrarCarta(Carta carta) throws IOException {
        if (System.getProperty("os.name").startsWith("Windows")) {
            sistema="src\\como\\ericsospedra\\Tema15\\Cartas";
        } else {
            sistema="src/como/ericsospedra/Tema15/Cartas";
        }
        switch (carta.getPalo()){
            case "Trebol":
                FileReader trebol=new FileReader(new File(sistema,carta.getNumero()+"trebol.txt"));
                int valorT=trebol.read();
                while(valorT!=-1){
                    System.out.print((char)valorT);
                    valorT=trebol.read();
                }
                System.out.println();
            break;
            case "Corazon":
                FileReader corazon=new FileReader(new File(sistema,carta.getNumero()+"corazon.txt"));
                int valorC=corazon.read();
                while(valorC!=-1){
                    System.out.print((char)valorC);
                    valorC=corazon.read();
                }
                System.out.println();
            break;
            case "Pica":
                FileReader pica=new FileReader(new File(sistema,carta.getNumero()+"picas.txt"));
                int valorP=pica.read();
                while(valorP!=-1){
                    System.out.print((char)valorP);
                    valorP=pica.read();
                }
                System.out.println();
            break;
            case "Diamante":
                FileReader diamante=new FileReader(new File(sistema,carta.getNumero()+"diamante.txt"));
                int valorD=diamante.read();
                while(valorD!=-1){
                    System.out.print((char)valorD);
                    valorD=diamante.read();
                }
                System.out.println();
            break;
            default:
                System.out.println("Error");
            break;
        }
        return carta;
    }
}

package Tema04.Bucles;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio16BuclesTema4 {
    public static void main(String[] args) {
        Random dado = new Random();
        Scanner lector = new Scanner(System.in);
        int jugador = 0;
        int cpu = 0;
        int dificultad;
        int aleatorio;
        int puntos;
        int turno = 1;
        int victoriasJugador = 0;
        int victoriasCpu = 0;
        int escape = 0;
        do {
            System.out.print("Bienvenido al juego\nEliga la dificultad de la cpu\n----------------------------------------\n1:Facil\n2:Normal\n3:Dificil\n4:Profesional\nDificultad: ");
            dificultad = lector.nextInt();
            lector.nextLine();
            System.out.print("\u001B[H\u001B[2J");
            switch (dificultad) {
                case 1:
                    while (turno == 1 && jugador < 11) {
                        System.out.print("1:Tirar dado				2:Plantarse\nEleccion: ");
                        turno = lector.nextInt();
                        while (turno < 1 || turno > 2) {
                            System.out.print("Introduce una eleccion valida\n");
                            turno = lector.nextInt();
                        }
                        System.out.print("\u001B[H\u001B[2J");
                        if (turno == 1) {
                            puntos = dado.nextInt(6) + 1;
                            jugador = jugador + puntos;
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        } else {
                            System.out.print("Esta es la puntacion con la que se plantas: " + jugador + "\n");
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        }
                    }
                    turno = 1;
                    if (jugador > 11) {
                        turno = 2;
                    }
                    aleatorio = dado.nextInt(10) + 1;
                    while (turno == 1 && cpu < 11) {
                        if (aleatorio > 8) {
                            while (cpu < jugador) {
                                cpu = jugador + aleatorio;
                                turno = 2;
                                if (cpu > 11) {
                                    cpu = 11;
                                    turno = 2;
                                }
                            }
                        } else {
                            puntos = dado.nextInt(6) + 1;
                            cpu = jugador - puntos;
                            if (cpu < 0) {
                                cpu = 0;
                            }
                            turno = 2;
                        }
                    }
                    break;
                case 2:
                    while (turno == 1 && jugador < 11) {
                        System.out.print("1:Tirar dado				2:Plantarse\nEleccion: ");
                        turno = lector.nextInt();
                        while (turno < 1 || turno > 2) {
                            System.out.print("Introduce una eleccion valida\n");
                            turno = lector.nextInt();
                        }
                        System.out.print("\u001B[H\u001B[2J");
                        if (turno == 1) {
                            puntos = dado.nextInt(6) + 1;
                            jugador = jugador + puntos;
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        } else {
                            System.out.print("Esta es la puntacion con la que se plantas: " + jugador + "\n");
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        }
                    }
                    turno = 1;
                    if (jugador > 11) {
                        turno = 2;
                    }
                    aleatorio = dado.nextInt(10) + 1;
                    while (turno == 1 && cpu < 11) {
                        if (aleatorio > 5) {
                            while (cpu < jugador && jugador < 11) {//Bucle infinito si jugador tiene 11 (!!!ARREGLAR¡¡¡¡)
                                cpu = jugador + aleatorio;
                                turno = 2;
                                if (cpu > 11) {
                                    cpu = 11;
                                    turno = 2;
                                }
                            }
                        } else {
                            puntos = dado.nextInt(6) + 1;
                            cpu = jugador - puntos;
                            if (cpu < 0) {
                                cpu = 0;
                            }
                            turno = 2;
                        }
                    }
                    break;
                case 3:
                    while (turno == 1 && jugador <= 11) {
                        System.out.print("1:Tirar dado				2:Plantarse\nEleccion: ");
                        turno = lector.nextInt();
                        while (turno < 1 || turno > 2) {
                            System.out.print("Introduce una eleccion valida\n");
                            turno = lector.nextInt();
                        }
                        System.out.print("\u001B[H\u001B[2J");
                        if (turno == 1) {
                            puntos = dado.nextInt(6) + 1;
                            jugador = jugador + puntos;
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        } else {
                            System.out.print("Esta es la puntacion con la que te plantas: " + jugador + "\n");
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        }
                    }
                    turno = 1;
                    if (jugador > 11) {
                        turno = 2;
                    }
                    aleatorio = dado.nextInt(10) + 1;
                    while (turno == 1 && cpu <= 11) {
                        if (aleatorio > 3) {
                            while (cpu < jugador) {
                                cpu = jugador + aleatorio;
                                turno = 2;
                                if (cpu > 11) {
                                    cpu = 11;
                                    turno = 2;
                                }
                            }
                        } else {
                            puntos = dado.nextInt(6) + 1;
                            cpu = jugador - puntos;
                            if (cpu < 0) {
                                cpu = 0;
                            }
                            turno = 2;
                        }
                    }
                    break;
                case 4:
                    while (turno == 1 && jugador <= 11) {
                        System.out.print("1:Tirar dado				2:Plantarse\nEleccion: ");
                        turno = lector.nextInt();
                        while (turno < 1 || turno > 2) {
                            System.out.print("Introduce una eleccion valida\n");
                            turno = lector.nextInt();
                        }
                        System.out.print("\u001B[H\u001B[2J");
                        if (turno == 1) {
                            puntos = dado.nextInt(6) + 1;
                            jugador = jugador + puntos;
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        } else {
                            System.out.print("Esta es la puntacion con la que se plantas: " + jugador + "\n");
                            System.out.print("Tu puntacion es: " + jugador + "\n");
                        }
                    }
                    turno = 1;
                    if (jugador > 11) {
                        turno = 2;
                    }
                    aleatorio = dado.nextInt(10) + 1;
                    while (turno == 1 && cpu <= 11) {
                        if (aleatorio > 1) {
                            while (cpu < jugador) {
                                cpu = jugador + aleatorio;
                                turno = 2;
                                if (cpu > 11) {
                                    cpu = 11;
                                    turno = 2;
                                }
                            }
                        } else {
                            puntos = dado.nextInt(6) + 1;
                            cpu = jugador - puntos;
                            if (cpu < 0) {
                                cpu = 0;
                            }
                            turno = 2;
                        }
                    }
                    break;
                default:
                    break;
            }
            System.out.print("Su puntacion es: " + cpu + "\n");
            if (jugador != cpu) {
                if (jugador <= 11 && jugador > cpu || cpu > 11) {
                    System.out.print("Has ganado\n");
                    victoriasJugador++;
                    if (jugador == 11) {
                        victoriasJugador++;
                    }
                } else if (cpu <= 11 && cpu != jugador) {
                    if (cpu > jugador || jugador > 11 && cpu <= 11) {
                        System.out.print("Has perdido\n");
                        victoriasCpu++;
                        if (cpu == 11) {
                            victoriasCpu++;
                        }
                    }
                } else {
                    System.out.print("Habeis Empatado\n");
                }
            } else {
                System.out.print("Habeis Empatado\n");
            }
            System.out.print("Introduce 1 para continuar\n");
            escape = lector.nextInt();
            System.out.print("\u001B[H\u001B[2J");
            while (escape > 2 && escape < 0) {
                System.out.print("Introduce 1 para continuar\n");
                escape = lector.nextInt();
                System.out.print("\u001B[H\u001B[2J");
            }
            turno = 1;
            jugador = 0;
            cpu = 0;
            if (victoriasJugador >= 5) {
                System.out.print("El ganador es Jugador\n");
                System.out.print("¿Desea volver a jugar?\n1:Si                    2:No\nEleccion: ");
                escape = lector.nextInt();
                System.out.print("\u001B[H\u001B[2J");
                while (escape > 3 && escape < 0) {
                    System.out.print("Elige entre 1:Si y 2:No\n");
                    escape = lector.nextInt();
                    System.out.print("\u001B[H\u001B[2J");
                }
                if (escape == 1) {
                    victoriasCpu = 0;
                    victoriasJugador = 0;
                }
            } else if (victoriasCpu >= 5) {
                System.out.print("El ganador es CPU\n");
                System.out.print("¿Desea volver a jugar?\n1:Si                    2:No\nEleccion: ");
                escape = lector.nextInt();
                System.out.print("\u001B[H\u001B[2J");
                while (escape > 3 && escape < 0) {
                    System.out.print("Elige entre 1:Si y 2:No\n");
                    escape = lector.nextInt();
                    System.out.print("\u001B[H\u001B[2J");
                }
                if (escape == 1) {
                    victoriasCpu = 0;
                    victoriasJugador = 0;
                }
            }
        }
        while (victoriasJugador < 5 && victoriasCpu < 5);
        lector.close();
    }
}
package como.ericsospedra.Tema09;

import java.util.Random;
import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.NumberFormatException;
import java.lang.IllegalArgumentException;

public class Ejercicio10Tema9 {
    static Random alea = new Random();
    static Scanner lector = new Scanner(System.in);
    static int tipo, funcion, contador = 1, primerOperandorEntero, segundoOperandorEntero, resultadoEntero;
    static float primerOperandorFloat, segundoOperandorFloat, resultadoAproximado;
    static double primerOperandorDouble, segundoOperandorDouble, resultadoPreciso;
    static char letra;

    public static void main(String[] args) {
        try {
            menu();
        } catch (ArithmeticException AEx) {
            System.out.println("Error aritmetico");
        } catch (NumberFormatException NFEx) {
            System.out.println("Error al intentar transformar un dato");
        } catch (IllegalArgumentException IAEx) {
            System.out.println("Error el argumento introducido no es valido");
        }
    }

    public static void menu() {
        do {
            System.out.println("Bienvenido a la calculador\n1:Calculadora Basica\n2:Calculadora Aproximada\n" +
                    "3:Calculadora Cientifica\n0:Salir del programa");
            System.out.print("Introduce el tipo de calculadora: ");
            if (alea.nextInt(2) + 1 == 1) {
                tipo = alea.nextInt(10);
            } else {
                tipo = letra = (char) alea.nextInt(122 - 97 + 1);
            }
            while (tipo > 3 || tipo < 0) {
                System.out.println("Introduce una opcion permitida entre 0 y 3");
                if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
                    tipo = alea.nextInt(10);
                } else {
                    tipo = letra = (char) alea.nextInt(122 - 97 + 1);
                }
            }
            System.out.print("\u001B[H\u001B[2J");
            if (tipo != 0) {
                do {
                    System.out.println("1:Sumar\n2:Restar\n3:Multiplicar\n4:Dividir\n5:Elevar a base 2\n" +
                            "6:Elevar a base x\n7:Calcular Porcentaje\n8:Resto de una division\n----------------------------------------\n0:Salir");
                    System.out.print("Introduce la funcion que quieras utilizar: ");
                    if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
                        funcion = alea.nextInt(10);
                    } else {
                        funcion = letra = (char) alea.nextInt(122 - 97 + 1);
                    }
                    System.out.print("\u001B[H\u001B[2J");
                    switch (funcion) {
                        case 1:
                            sumar(tipo);
                            break;
                        case 2:
                            resta(tipo);
                            break;
                        case 3:
                            multiplicacion(tipo);
                            break;
                        case 4:
                            division(tipo);
                            break;
                        case 5:
                            elevarADos(tipo);
                            break;
                        case 6:
                            elevarABaseX(tipo);
                            break;
                        case 7:
                            porcentaje(tipo);
                            break;
                        case 8:
                            calcularResto(tipo);
                            break;
                        default:
                            break;
                    }
                }
                while (funcion != 0);
            }
        }
        while (tipo != 0);
    }

    public static void sumar(int tipo) {
        System.out.println("Introduce los numeros a Sumar");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = primerOperandorEntero + segundoOperandorEntero;
            System.out.println("El resultado de la suma de " + primerOperandorEntero + "+" + segundoOperandorEntero + " es: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = primerOperandorFloat + segundoOperandorFloat;
            System.out.println("El resultado de la suma de " + primerOperandorFloat + "+" + segundoOperandorFloat + " es: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            System.out.println("Modo Calculadora Cientifica: activado");
            resultadoPreciso = primerOperandorDouble + segundoOperandorDouble;
            System.out.println("El resultado de la suma de " + primerOperandorDouble + "+" + segundoOperandorDouble + " es: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }

    public static void resta(int tipo) {
        System.out.println("Introduce los numeros a Restar");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = primerOperandorEntero - segundoOperandorEntero;
            System.out.println("El resultado de la resta de " + primerOperandorEntero + "-" + segundoOperandorEntero + " es: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = primerOperandorFloat - segundoOperandorFloat;
            System.out.println("El resultado de la resta de " + primerOperandorFloat + "-" + segundoOperandorFloat + " es: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            System.out.println("Modo Calculadora Cientifica: activado");
            resultadoPreciso = primerOperandorDouble - segundoOperandorDouble;
            System.out.println("El resultado de la resta de " + primerOperandorDouble + "-" + segundoOperandorDouble + " es: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }

    public static void multiplicacion(int tipo) {
        System.out.println("Introduce los numeros a Multiplicar");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = primerOperandorEntero * segundoOperandorEntero;
            System.out.println("El resultado de la multiplicacion de " + primerOperandorEntero + "*" + segundoOperandorEntero + " es: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = primerOperandorFloat * segundoOperandorFloat;
            System.out.println("El resultado de la multiplicacion de " + primerOperandorFloat + "*" + segundoOperandorFloat + " es: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            resultadoPreciso = primerOperandorDouble * segundoOperandorDouble;
            System.out.println("El resultado de la multiplicacion de " + primerOperandorDouble + "*" + segundoOperandorDouble + " es: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }

    public static void division(int tipo) {
        System.out.println("Introduce los numeros a Dividir");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = primerOperandorEntero / segundoOperandorEntero;
            System.out.println("El resultado de la dividir de " + primerOperandorEntero + "/" + segundoOperandorEntero + " es: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = primerOperandorFloat / segundoOperandorFloat;
            System.out.println("El resultado de la dividir de " + primerOperandorFloat + "/" + segundoOperandorFloat + " es: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            resultadoPreciso = primerOperandorDouble / segundoOperandorDouble;
            System.out.println("El resultado de la dividir de " + primerOperandorDouble + "/" + segundoOperandorDouble + " es: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }

    public static void elevarADos(int tipo) {
        System.out.println("Introduce el numero a Elevar a base 2");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            resultadoEntero = primerOperandorEntero * primerOperandorEntero;
            System.out.println("El resultado de elevar " + primerOperandorEntero + " a base 2 es: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            resultadoAproximado = primerOperandorFloat * primerOperandorFloat;
            System.out.println("El resultado de elevar " + primerOperandorFloat + " a base 2 es: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            resultadoPreciso = primerOperandorDouble * primerOperandorDouble;
            System.out.println("El resultado de elevar " + primerOperandorDouble + " a base 2 es: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }

    public static void elevarABaseX(int tipo) {
        System.out.println("Introduce el numero a elevar a base x(Introduce tambien la base)");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = 0;
            while (contador <= segundoOperandorEntero) {
                if (contador == 1) {
                    resultadoEntero = primerOperandorEntero * primerOperandorEntero;
                    contador++;
                } else if (contador < segundoOperandorEntero) {
                    resultadoEntero = resultadoEntero * primerOperandorEntero;
                    contador++;
                } else {
                    contador++;
                    System.out.println("El resultado de elevar " + primerOperandorEntero + " a base " + segundoOperandorEntero + " es: " + resultadoEntero);
                    System.out.println("Presiona enter para continuar...");
                    lector.nextLine();
                }
            }
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = 0;
            while (contador <= segundoOperandorFloat) {
                if (contador == 1) {
                    resultadoAproximado = primerOperandorFloat * primerOperandorFloat;
                    contador++;
                } else if (contador < segundoOperandorFloat) {
                    resultadoAproximado = resultadoAproximado * primerOperandorFloat;
                    contador++;
                } else {
                    contador++;
                    System.out.println("El resultado de elevar " + primerOperandorFloat + " a base " + segundoOperandorFloat + " es: " + resultadoAproximado);
                    System.out.println("Presiona enter para continuar...");
                    lector.nextLine();
                }
            }
        } else {
            resultadoPreciso = 0;
            while (contador <= segundoOperandorDouble) {
                if (contador == 1) {
                    resultadoPreciso = primerOperandorDouble * primerOperandorDouble;
                    contador++;
                } else if (contador < segundoOperandorDouble) {
                    resultadoPreciso = resultadoPreciso * primerOperandorDouble;
                    contador++;
                } else {
                    contador++;
                    System.out.println("El resultado de elevar " + primerOperandorDouble + " a base " + segundoOperandorDouble + " es: " + resultadoPreciso);
                    System.out.println("Presiona enter para continuar...");
                    lector.nextLine();
                }
            }
        }
    }

    public static void porcentaje(int tipo) {
        System.out.println("Introduce los numeros a sacar Porcentaje");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = (primerOperandorEntero * segundoOperandorEntero) / 100;
            System.out.println("El porcentaje de " + primerOperandorEntero + " por " + segundoOperandorEntero + " es: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = (primerOperandorFloat * segundoOperandorFloat) / 100;
            System.out.println("El porcentaje de " + primerOperandorFloat + " por " + segundoOperandorFloat + " es: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            resultadoPreciso = (primerOperandorDouble * segundoOperandorDouble) / 100;
            System.out.println("El porcentaje de " + primerOperandorDouble + " por " + segundoOperandorDouble + " es: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }

    public static void calcularResto(int tipo) {
        System.out.println("Introduce los numeros de la division que quieras conocer su resto");
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            primerOperandorDouble = alea.nextInt(10);
        } else {
            primerOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (alea.nextInt(2 - 1 + 1) + 1 == 1) {
            segundoOperandorDouble = alea.nextInt(10);
        } else {
            segundoOperandorDouble = letra = (char) alea.nextInt(122 - 97 + 1);
        }
        if (tipo == 1) {
            System.out.println("Modo Calculadora Basica: activado");
            primerOperandorEntero = (int) primerOperandorDouble;
            segundoOperandorEntero = (int) segundoOperandorDouble;
            resultadoEntero = primerOperandorEntero % segundoOperandorEntero;
            System.out.println("La dividion de " + primerOperandorEntero + " por " + segundoOperandorEntero + " tiene un resto de: " + resultadoEntero);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else if (tipo == 2) {
            System.out.println("Modo Calculadora Aproximada: activado");
            primerOperandorFloat = (float) primerOperandorDouble;
            segundoOperandorFloat = (float) segundoOperandorDouble;
            resultadoAproximado = primerOperandorFloat % segundoOperandorFloat;
            System.out.println("La dividion de " + primerOperandorFloat + " por " + segundoOperandorFloat + " tiene un resto de: " + resultadoAproximado);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        } else {
            resultadoPreciso = primerOperandorDouble % segundoOperandorDouble;
            System.out.println("La dividion de " + primerOperandorDouble + " por " + segundoOperandorDouble + " tiene un resto de: " + resultadoPreciso);
            System.out.println("Presiona enter para continuar...");
            lector.nextLine();
        }
    }
}

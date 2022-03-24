package Tema04;

import java.util.Scanner;

public class CalculadoraTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int control;
        int tipo;
        int funcion;
        int contador = 1;
        int primerOperandorEntero;
        int segundoOperandorEntero;
        float primerOperandorFloat;
        float segundoOperandorFloat;
        double primerOperandorDouble;
        double segundoOperandorDouble;
        int resultadoEntero;
        float resultadoAproximado;
        double resultadoPreciso;
        do {
            System.out.println("Bienvenido a la calculador\n1:Calculadora Basica\n2:Calculadora Aproximada\n3:Calculadora Cientifica");
            System.out.print("Introduce el tipo de calculadora: ");
            tipo = lector.nextInt();
            while (tipo > 3) {
                System.out.println("Introduce una opcion permitida entre 1 y 3");
                tipo = lector.nextInt();
            }
            System.out.print("\u001B[H\u001B[2J");
            System.out.println("1:Sumar\n2:Restar\n3:Multiplicar\n4:Dividir\n5:Elevar a base 2\n6:Elevar a base x\n7:Calcular Porcentaje\n8:Resto de una division\n----------------------------------------\n0:Salir");
            System.out.print("Introduce la funcion que quieras utilizar: ");
            funcion = lector.nextInt();
            System.out.print("\u001B[H\u001B[2J");
            switch (funcion) {
                case 1:
                    System.out.println("Introduce los numeros a Sumar");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        segundoOperandorEntero = (int) segundoOperandorDouble;
                        resultadoEntero = primerOperandorEntero + segundoOperandorEntero;
                        System.out.println("El resultado de la suma de " + primerOperandorEntero + "+" + segundoOperandorEntero + " es: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        segundoOperandorFloat = (float) segundoOperandorDouble;
                        resultadoAproximado = primerOperandorFloat + segundoOperandorFloat;
                        System.out.println("El resultado de la suma de " + primerOperandorFloat + "+" + segundoOperandorFloat + " es: " + resultadoAproximado);
                    } else {
                        System.out.println("Modo Calculadora Cientifica: activado");
                        resultadoPreciso = primerOperandorDouble + segundoOperandorDouble;
                        System.out.println("El resultado de la suma de " + primerOperandorDouble + "+" + segundoOperandorDouble + " es: " + resultadoPreciso);
                    }
                    break;
                case 2:
                    System.out.println("Introduce los numeros a Restar");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        segundoOperandorEntero = (int) segundoOperandorDouble;
                        resultadoEntero = primerOperandorEntero - segundoOperandorEntero;
                        System.out.println("El resultado de la resta de " + primerOperandorEntero + "-" + segundoOperandorEntero + " es: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        segundoOperandorFloat = (float) segundoOperandorDouble;
                        resultadoAproximado = primerOperandorFloat - segundoOperandorFloat;
                        System.out.println("El resultado de la resta de " + primerOperandorFloat + "-" + segundoOperandorFloat + " es: " + resultadoAproximado);
                    } else {
                        System.out.println("Modo Calculadora Cientifica: activado");
                        resultadoPreciso = primerOperandorDouble - segundoOperandorDouble;
                        System.out.println("El resultado de la resta de " + primerOperandorDouble + "-" + segundoOperandorDouble + " es: " + resultadoPreciso);
                    }
                    break;
                case 3:
                    System.out.println("Introduce los numeros a Multiplicar");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        segundoOperandorEntero = (int) segundoOperandorDouble;
                        resultadoEntero = primerOperandorEntero * segundoOperandorEntero;
                        System.out.println("El resultado de la multiplicacion de " + primerOperandorEntero + "*" + segundoOperandorEntero + " es: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        segundoOperandorFloat = (float) segundoOperandorDouble;
                        resultadoAproximado = primerOperandorFloat * segundoOperandorFloat;
                        System.out.println("El resultado de la multiplicacion de " + primerOperandorFloat + "*" + segundoOperandorFloat + " es: " + resultadoAproximado);
                    } else {
                        resultadoPreciso = primerOperandorDouble * segundoOperandorDouble;
                        System.out.println("El resultado de la multiplicacion de " + primerOperandorDouble + "*" + segundoOperandorDouble + " es: " + resultadoPreciso);
                    }
                    break;
                case 4:
                    System.out.println("Introduce los numeros a Dividir");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        segundoOperandorEntero = (int) segundoOperandorDouble;
                        resultadoEntero = primerOperandorEntero / segundoOperandorEntero;
                        System.out.println("El resultado de la dividir de " + primerOperandorEntero + "/" + segundoOperandorEntero + " es: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        segundoOperandorFloat = (float) segundoOperandorDouble;
                        resultadoAproximado = primerOperandorFloat / segundoOperandorFloat;
                        System.out.println("El resultado de la dividir de " + primerOperandorFloat + "/" + segundoOperandorFloat + " es: " + resultadoAproximado);
                    } else {
                        resultadoPreciso = primerOperandorDouble / segundoOperandorDouble;
                        System.out.println("El resultado de la dividir de " + primerOperandorDouble + "/" + segundoOperandorDouble + " es: " + resultadoPreciso);
                    }
                    break;
                case 5:
                    System.out.println("Introduce el numero a Elevar a base 2");
                    primerOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        resultadoEntero = primerOperandorEntero * primerOperandorEntero;
                        System.out.println("El resultado de elevar " + primerOperandorEntero + " a base 2 es: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        resultadoAproximado = primerOperandorFloat * primerOperandorFloat;
                        System.out.println("El resultado de elevar " + primerOperandorFloat + " a base 2 es: " + resultadoAproximado);
                    } else {
                        resultadoPreciso = primerOperandorDouble * primerOperandorDouble;
                        System.out.println("El resultado de elevar " + primerOperandorDouble + " a base 2 es: " + resultadoPreciso);
                    }
                    break;
                case 6:
                    System.out.println("Introduce el numero a elevar a base x(Introduce tambien la base)");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
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
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Introduce los numeros a sacar Porcentaje");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        segundoOperandorEntero = (int) segundoOperandorDouble;
                        resultadoEntero = (primerOperandorEntero * segundoOperandorEntero) / 100;
                        System.out.println("El porcentaje de " + primerOperandorEntero + " por " + segundoOperandorEntero + " es: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        segundoOperandorFloat = (float) segundoOperandorDouble;
                        resultadoAproximado = (primerOperandorFloat * segundoOperandorFloat) / 100;
                        System.out.println("El porcentaje de " + primerOperandorFloat + " por " + segundoOperandorFloat + " es: " + resultadoAproximado);
                    } else {
                        resultadoPreciso = (primerOperandorDouble * segundoOperandorDouble) / 100;
                        System.out.println("El porcentaje de " + primerOperandorDouble + " por " + segundoOperandorDouble + " es: " + resultadoPreciso);
                    }
                    break;
                case 8:
                    System.out.println("Introduce los numeros de la division que quieras conocer su resto");
                    primerOperandorDouble = lector.nextDouble();
                    segundoOperandorDouble = lector.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Modo Calculadora Basica: activado");
                        primerOperandorEntero = (int) primerOperandorDouble;
                        segundoOperandorEntero = (int) segundoOperandorDouble;
                        resultadoEntero = primerOperandorEntero % segundoOperandorEntero;
                        System.out.println("La dividion de " + primerOperandorEntero + " por " + segundoOperandorEntero + " tiene un resto de: " + resultadoEntero);
                    } else if (tipo == 2) {
                        System.out.println("Modo Calculadora Aproximada: activado");
                        primerOperandorFloat = (float) primerOperandorDouble;
                        segundoOperandorFloat = (float) segundoOperandorDouble;
                        resultadoAproximado = primerOperandorFloat % segundoOperandorFloat;
                        System.out.println("La dividion de " + primerOperandorFloat + " por " + segundoOperandorFloat + " tiene un resto de: " + resultadoAproximado);
                    } else {
                        resultadoPreciso = primerOperandorDouble % segundoOperandorDouble;
                        System.out.println("La dividion de " + primerOperandorDouble + " por " + segundoOperandorDouble + " tiene un resto de: " + resultadoPreciso);
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Quiere calcular algo mas:\n0:No        1:Si");
            control = lector.nextInt();
            lector.nextLine();
            System.out.print("\u001B[H\u001B[2J");
        }
        while (control == 1);
    }
}
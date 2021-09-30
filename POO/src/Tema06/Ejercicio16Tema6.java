package Tema06;

import java.util.Scanner;

public class Ejercicio16Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        char letra;
        System.out.println("Introduzca la letra que quiere que sustituya al numero que desee entre el 0 y 9");
        letra = lector.next().charAt(0);
        num = lector.nextInt();
        letra(num, letra);
    }

    static void letra(int num, char letra) {
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        for (int i = 0; i <= 10; i++) {
            if (dig1 == 9 && dig2 == 9 && dig3 == 9 && dig4 == 9) {
                if (dig1 != num && dig2 != num && dig3 != num && dig4 != num) {
                    System.out.print(dig1 + "-" + dig2 + "-" + dig3 + "-" + dig4);
                } else {
                    System.out.print(letra + "-" + letra + "-" + letra + "-" + letra);
                }
                i = 11;
            } else {
                if (dig1 == 10) {
                    dig1 = 9;
                    if (dig1 != num) {
                        System.out.print(dig1);
                    } else {
                        System.out.print(letra);
                    }
                } else if (dig1 != num) {
                    System.out.print(dig1);
                } else {
                    System.out.print(letra);
                }
                if (dig2 == 10) {
                    dig2 = 9;
                    if (dig2 != num) {
                        System.out.print("-" + dig2);
                    } else {
                        System.out.print(letra);
                    }
                    i = 0;
                    dig2 = 0;
                    dig1++;
                } else if (dig2 != num) {
                    System.out.print("-" + dig2);
                } else {
                    System.out.print("-" + letra);
                }
                if (dig3 == 10) {
                    dig3 = 9;
                    if (dig3 != num) {
                        System.out.print("-" + dig3);
                    } else {
                        System.out.print(letra);
                    }
                    i = 0;
                    dig3 = 0;
                    dig2++;
                } else if (dig3 != num) {
                    System.out.print("-" + dig3);
                } else {
                    System.out.print("-" + letra);
                }
                if (dig4 != num && dig4 != 10) {
                    System.out.print("-" + dig4);
                    System.out.println();
                    dig4++;
                } else {
                    System.out.print("-" + letra);
                    System.out.println();
                    dig4++;
                }
                if (dig4 == 10) {
                    i = 0;
                    dig4 = 0;
                    dig3++;
                }
            }
        }
    }
}

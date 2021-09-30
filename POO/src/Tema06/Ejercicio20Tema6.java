package Tema06;

import java.util.Scanner;

public class Ejercicio20Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String fecha;
        int resultado;
        System.out.println("Introduceme tu fecha de nacimiento con esto formato dd-mm-aaaa icluyendo los guiones");
        fecha = lector.next();
        resultado = numeroDeLaSuerte(fecha);
        System.out.println("Tu numero de la suerte es: " + resultado);
    }

    static int numeroDeLaSuerte(String nacimiento) {
        int resultado = 0;
        int simplificado = 0;
        nacimiento = nacimiento.replaceAll("-", "");
        nacimiento = nacimiento.trim();
        char[] fecha = new char[nacimiento.length()];
        for (int i = 0; i < nacimiento.length(); i++) {
            fecha[i] = nacimiento.charAt(i);
            resultado = resultado + Integer.parseInt(Character.toString(fecha[i]));
        }
        for (int j = 0; j < Integer.toString(resultado).length(); j++) {
            simplificado = Integer.parseInt(Character.toString(Integer.toString(resultado).charAt(j))) + simplificado;
        }
        return simplificado;
    }
}
package Tema04;

import java.util.Scanner;

public class DominioTema4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        String dominio;
        System.out.println("Digame su nombre");
        nombre = lector.nextLine();
        System.out.println("Digame su dominio");
        dominio = lector.nextLine();
        System.out.println("Su correo electronico es " + nombre + "\u0040" + dominio);
    }
}
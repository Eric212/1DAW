package como.ericsospedra.Tema08.Ejercicio4;

import java.util.Random;

public class PrincipalPunto {
    public static Random alea = new Random();

    public static void main(String[] args) {
        double a, b, c;
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();
        Punto punto4 = new Punto();
        a = punto1.calcularDistancia(punto2);
        b = punto2.calcularDistancia(punto3);
        c = punto2.calcularDistancia(punto4);
        System.out.printf("Posicion del Punto 1" + "%7s\t" + "Distancia entre Punto1 y Punto 2: " + "%5.2f\n", punto1.visualizarPunto(), a);
        System.out.printf("Posicion del Punto 2" + "%7s\t" + "Distancia entre Punto2 y Punto 3: " + "%5.2f\n", punto2.visualizarPunto(), b);
        System.out.printf("Posicion del Punto 3" + "%7s\t" + "Distancia entre Punto3 y Punto 4: " + "%5.2f\n", punto3.visualizarPunto(), c);
    }
}

package como.ericsospedra.Tema10.Ejercicio01;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {
    static Random alea = new Random();
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = alea.nextInt(51)+1;
            System.out.print(numeros[i] + "\t");
        }
        ArrayList<Integer> ordenada = ordenarEnArrayList(numeros);
        System.out.println();
        for (int i = 0; i < ordenada.size(); i++) {
            System.out.print(ordenada.get(i) + "\t");
        }
    }

    public static ArrayList<Integer> ordenarEnArrayList(int[] numeros) {
        ArrayList<Integer> ordenada = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                ordenada.add(numeros[i]);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                ordenada.add(numeros[i]);
            }
        }
        return ordenada;
    }
}

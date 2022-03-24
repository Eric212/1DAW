import java.util.Scanner;

public class Ejercicio1Tema6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int resultado;
        int x;
        int y;
        System.out.println("Introduce los dos numeros que quieres sumar");
        x = lector.nextInt();
        lector.nextLine();
        y = lector.nextInt();
        resultado = suma(x, y);
        System.out.println(resultado);
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
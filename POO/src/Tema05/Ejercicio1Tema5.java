import java.util.Scanner;

public class Ejercicio1Tema5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int resultado;
        int num1;
        int num2;
        System.out.println("Introduce los dos numeros que quieres sumar");
        num1 = lector.nextInt();
        lector.nextLine();
        num2 = lector.nextInt();
        resultado = suma(num1, num2);
        System.out.println(resultado);
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
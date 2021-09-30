package como.ericsospedra.Tema08.PilasYColas.Ejercicio2;

import como.ericsospedra.Tema08.PilasYColas.Ejercicio1.Pila;

public class Ejercicio2Tema8 {
    static Pila rpn = new Pila(10);

    public static void main(String[] args) {
        int num1, num2;
        char[] operaciones = {'1', '2', '+', '6', '5', '*', '7', '2', '/', '+', '-'};
        for (int i = 0; i < operaciones.length; i++) {
            if (operaciones[i] == '+' || operaciones[i] == '-' || operaciones[i] == '*' || operaciones[i] == '/') {
                num1 = rpn.pop();
                num2 = rpn.pop();
                operacion(num1, num2, operaciones[i]);
                System.out.print(rpn.top() + "\n");
            } else {
                rpn.push(Character.getNumericValue(operaciones[i]));
            }
        }
    }

    public static void operacion(int num1, int num2, char signo) {
        if (signo == '+') {
            rpn.push(num1 + num2);
        } else if (signo == '-') {
            rpn.push(num1 - num2);
        } else if (signo == '*') {
            rpn.push(num1 * num2);
        } else if (signo == '/') {
            rpn.push(num1 / num2);
        }
    }
}
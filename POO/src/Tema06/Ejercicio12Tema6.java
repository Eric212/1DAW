package Tema06;

import java.util.Random;

public class Ejercicio12Tema6 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int nota = aleatorio.nextInt(10) + 1;
        String calificacion;
        for (int i = 1; i <= 50; i++) {
            nota = aleatorio.nextInt(11);
            calificaciones(nota, i);
        }
    }

    static void calificaciones(int nota, int alumno) {
        String calificacion;
        int notaReal = nota;
        if (nota >= 0 && nota < 5) {
            nota = 4;
        } else if (nota > 6 && nota < 9) {
            nota = 7;
        } else if (nota > 8 && nota <= 10) {
            nota = 9;
        }
        switch (nota) {
            case 4:
                calificacion = "INSUFICIENTE";
                System.out.println("Alumno " + alumno + " con nota:" + notaReal + " tiene un " + calificacion);
                break;
            case 5:
                calificacion = "SUFICIENTE";
                System.out.println("Alumno " + alumno + " con nota:" + notaReal + " tiene un " + calificacion);
                break;
            case 6:
                calificacion = "BIEN";
                System.out.println("Alumno " + alumno + " con nota:" + notaReal + " tiene un " + calificacion);
                break;
            case 7:
                calificacion = "NOTABLE";
                System.out.println("Alumno " + alumno + " con nota:" + notaReal + " tiene un " + calificacion);
                break;
            case 9:
                calificacion = "EXCELENTE";
                System.out.println("Alumno " + alumno + " con nota:" + notaReal + " tiene un " + calificacion);
                break;
            default:
                break;
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class Ejercicio29Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random alea = new Random();
        int comp = -1;
        int alumnos, aprobados;
        float media = 0;
        System.out.print("Introduce el numero de alumnos\nAlumnos: ");
        alumnos = lector.nextInt();
        System.out.println();
        float[][] alumno = new float[alumnos + 2][4];
        for (int i = 0; i < alumno.length; i++) {
            for (int j = 0; j < alumno[i].length; j++) {
                alumno[i][j] = alea.nextFloat() * 10;
            }
        }
        System.out.println();
        System.out.printf("%29s\t", "Mod1");
        System.out.printf("%20s\t", "Mod2");
        System.out.printf("%20s\t", "Mod3");
        System.out.printf("%20s\n", "Media");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < alumno.length; i++) {
            for (int j = 0; j < alumno[i].length; j++) {
                if (j == alumno[i].length - 1) {
                    media /= alumno[i].length - 1;
                    alumno[i][j] = media;
                    media = 0;
                } else {
                    media += alumno[i][j];
                }
                if (comp != i) {
                    if (i < 9 && alumno.length > 10) {
                        System.out.printf("Alumno 0" + (i + 1) + "%20.2f\t", alumno[i][j]);
                    } else if (i == alumno.length - 2 && i > alumno.length - 3) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        alumno[i][j] = mayor(alumno, j);
                        System.out.printf("Nota  maxima " + "%16.2f\t", alumno[i][j]);
                    } else if (i == alumno.length - 1 && i > alumno.length - 3) {
                        alumno[i][j] = mediaModulo(alumno, j);
                        aprobados = aprobados(alumno[i][j], alumno, j);
                        System.out.printf("Media (" + (alumno.length - 2) + " Alumnos) " + "%10.2f(%d)", alumno[i][j], aprobados);
                    } else {
                        System.out.printf("Alumno " + (i + 1) + "%20.2f\t", alumno[i][j]);
                    }
                } else {
                    if (i == alumno.length - 2 && i > alumno.length - 3) {
                        alumno[i][j] = mayor(alumno, j);
                        System.out.printf("%20.2f\t", alumno[i][j]);
                    } else if (i == alumno.length - 1 && i > alumno.length - 3) {
                        alumno[i][j] = mediaModulo(alumno, j);
                        aprobados = aprobados(alumno[i][j], alumno, j);
                        System.out.printf("%20.2f(%d)", alumno[i][j], aprobados);
                    } else {
                        System.out.printf("%20.2f\t", alumno[i][j]);
                    }
                }
                comp = i;
            }
            System.out.println();
        }
    }

    public static float mayor(float[][] alumno, int l) {
        float[][] reves = new float[alumno[0].length][alumno.length - 2];
        float maximo;
        for (int i = 0; i < reves.length; i++) {
            for (int j = 0; j < reves[i].length; j++) {
                reves[i][j] = alumno[j][i];
            }
        }
        maximo = reves[0][0];
        for (int j = 0; j < reves[l].length; j++) {
            if (maximo < reves[l][j]) {
                maximo = reves[l][j];
            }
        }
        return maximo;
    }

    public static float mediaModulo(float[][] alumno, int l) {
        float[][] reves = new float[alumno[0].length][alumno.length - 2];
        float media = 0;
        for (int i = 0; i < reves.length; i++) {
            for (int j = 0; j < reves[i].length; j++) {
                reves[i][j] = alumno[j][i];
            }
        }
        for (int j = 0; j < reves[l].length; j++) {
            media += reves[l][j];
            if (j == reves[l].length - 1) {
                media /= reves[l].length;
            }
        }
        return media;
    }

    public static int aprobados(float media, float[][] alumno, int l) {
        float[][] reves = new float[alumno[0].length][alumno.length - 2];
        int aprobados = 0;
        for (int i = 0; i < reves.length; i++) {
            for (int j = 0; j < reves[i].length; j++) {
                reves[i][j] = alumno[j][i];
            }
        }
        for (int j = 0; j < reves[l].length; j++) {
            if (reves[l][j] >= media) {
                aprobados++;
            }
        }
        return aprobados;
    }
}
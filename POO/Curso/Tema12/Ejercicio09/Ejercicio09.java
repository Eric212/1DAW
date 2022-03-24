package como.ericsospedra.Tema12.Ejercicio09;
import java.io.*;
import java.util.Scanner;
public class Ejercicio09 {
    static String[] alumnos;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try {
            System.out.print("""
                    Elige sistema operativo
                    1.Windows
                    2.Linux
                    Opcion:\s
                    """);
            if (Integer.parseInt(lector.nextLine())==1) {
                File fichero = new File("C:\\Users\\halor\\IdeaProjects\\POO\\src\\como\\ericsospedra\\Tema12\\ficherosalumnos.txt");
                insertarAlumnos(fichero);
                eliminarAlumno(fichero);
            }else {
                File fichero = new File("/home/eric/IdeaProjects/POO/src/como/ericsospedra/Tema12/ficheros/alumnos.txt");
                insertarAlumnos(fichero);
                eliminarAlumno(fichero);
            }
        }catch (NumberFormatException e){
            System.out.println("La opcion es valida");
            lector.nextLine();
        }
    }
    public static void insertarAlumnos(File fichero){
        try {
            FileReader alumnosFichero = new FileReader(fichero);
            BufferedReader lectorFichero = new BufferedReader(alumnosFichero);
            int contador =0;
            while (lectorFichero.readLine() != null) {
                contador++;
            }
            alumnos = new String[contador];
            for (int i = 0; i < alumnos.length; i++) {
                alumnos[i] = lectorFichero.readLine();
            }
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    public static void eliminarAlumno(File fichero){
        try {
            FileWriter alumnos = new FileWriter(fichero);
            BufferedWriter modificacionFichero = new BufferedWriter(alumnos);

        }catch(IOException e){
            System.out.println("Error");
        }
    }
}

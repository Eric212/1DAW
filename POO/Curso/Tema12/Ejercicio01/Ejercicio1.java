package como.ericsospedra.Tema12.Ejercicio01;

import java.io.File;

public class Ejercicio1 {
    public static void main(String[] args) {
        File fichero = new File("/home/eric/IdeaProjects/POO/src/como/ericsospedra/Tema12/ficheros/");
        System.out.println(fichero.isDirectory());
        System.out.println(fichero.exists());
    }
}

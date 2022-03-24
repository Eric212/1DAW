package como.ericsospedra.Tema12.Ejercicio03;

import java.io.File;

public class Ejercicio3 {
    public static void main(String[] args) {
        File fichero=new File("/home/eric/IdeaProjects/POO/src/como/ericsospedra/Tema12/ficheros/");
        System.out.println(fichero.isDirectory());
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.canRead());
        System.out.println(fichero.canWrite());
    }
}

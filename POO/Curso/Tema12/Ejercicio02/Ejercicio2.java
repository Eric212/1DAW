package como.ericsospedra.Tema12.Ejercicio02;
import java.io.File;
public class Ejercicio2 {
    public static void main(String[] args) {
        File fichero=new File("/home/eric/IdeaProjects/POO/src/como/ericsospedra/Tema12/ficheros/");
        String[] ficheros=fichero.list();
        for(int i=0;i< ficheros.length;i++){
            System.out.println(ficheros[i]);
        }
    }
}

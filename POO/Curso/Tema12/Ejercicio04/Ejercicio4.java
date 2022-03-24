package como.ericsospedra.Tema12.Ejercicio04;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio4 {
    public static void main(String[] args) {
        File fichero = new File("/home/eric/IdeaProjects/POO/src/como/ericsospedra/Tema12/ficheros/winrar-x64-601es.exe");
        System.out.println(fichero.getName());
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.isHidden());
        System.out.println(fichero.canRead());
        System.out.println(fichero.canWrite());
        System.out.println(new SimpleDateFormat("dd-mm-yyyy hh:mm:ss").format(new Date(fichero.lastModified())));
        System.out.println(fichero.length()/1024);
        System.out.println(fichero.length()/1048576);
    }
}

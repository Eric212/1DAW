package como.ericsospedra.Tema12.Ejercicio08;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                FileReader leerFichero = new FileReader(args[i]);
                int valor=leerFichero.read();
                System.out.println("Fichero "+(i+1)+"\n----------");
                while (valor!=-1){
                    System.out.print((char)valor);
                    valor=leerFichero.read();
                }
                System.out.println();
                System.out.println();
                leerFichero.close();
            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}

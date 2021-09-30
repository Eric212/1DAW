package como.ericsospedra.Tema12.Ejercicio06;
import como.ericsospedra.Tema12.Ejercicio05.GestionDeArchivos;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio6 extends GestionDeArchivos {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        leerArchivo();
        escribirArchivo();
        leerArchivo();
    }
    public static void leerArchivo(){
        System.out.print("Introduce la ruta del archivo que quieras leer\nRuta: ");
        try {
            FileReader leerFichero = new FileReader(lector.nextLine());
            int valor=leerFichero.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=leerFichero.read();
            }
            leerFichero.close();
        }catch (FileNotFoundException ex){
            System.out.println("El archivo no se encuentra");
        }catch (IOException ex){
            System.out.println("Error");
        }
    }
    public static void escribirArchivo(){
        System.out.println();
        System.out.print("Introduce la ruta del archivo que quieras modificar\nRuta: ");
        try {
            FileWriter escribirFichero = new FileWriter(lector.nextLine(),true);
            escribirFichero.write("\nPrueba");
            escribirFichero.close();
        }catch (FileNotFoundException ex){
            System.out.println("El archivo no se encuentra");
        }catch (IOException ex){
            System.out.println("Error");
        }
    }
}

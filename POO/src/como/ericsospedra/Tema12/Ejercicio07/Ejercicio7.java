package como.ericsospedra.Tema12.Ejercicio07;

import como.ericsospedra.Tema12.Ejercicio06.Ejercicio6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio7 extends Ejercicio6 {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        verHexadecximal();
    }
    public static void verHexadecximal(){
        System.out.print("Introduce la ruta del archivo\nRuta: ");
        try {
            int contador=0;
            FileInputStream lectorFichero=new FileInputStream(lector.nextLine());
            int valor=lectorFichero.read();
            StringBuilder hexadecimal=new StringBuilder();
            while (valor!=-1){
                if(hexadecimal.length()%31==0&&hexadecimal.length()!=0) {
                    hexadecimal.insert(hexadecimal.length(),"\n");
                }
                if(valor!=32){
                    hexadecimal.insert(hexadecimal.length(),(char) valor);
                }else {
                    hexadecimal.insert(hexadecimal.length()," ");
                }
                valor=lectorFichero.read();
                contador++;
            }
            System.out.println(transformaAHexadecimal(hexadecimal.toString()));
        }catch (FileNotFoundException FNFex){
            System.out.println("El archivo no se ha encontrado");
        }catch (IOException IOex){
            System.out.println("No tiene contenido el fichero");
        }
    }
    public static String transformaAHexadecimal(String a){
        String[] conversion=a.split(" ");
        StringBuilder comodin=new StringBuilder();
        for (int i=0;i<conversion.length;i++) {
            if(i%2==0&&i>0){
                comodin.insert(comodin.length()," ");
            }
            if (conversion[i].equalsIgnoreCase("10")){
                comodin.insert(comodin.length(), "A");
            } else if (conversion[i].equalsIgnoreCase("11")) {
                comodin.insert(comodin.length(), "B");
            } else if (conversion[i].equalsIgnoreCase("12")){
                comodin.insert(comodin.length(), "C");
            } else if (conversion[i].equalsIgnoreCase("13")) {
                comodin.insert(comodin.length(), "D");
            } else if (conversion[i].equalsIgnoreCase("14")) {
                comodin.insert(comodin.length(), "E");
            } else if (conversion[i].equalsIgnoreCase("15")) {
                comodin.insert(comodin.length(), "F");
            }else {
                comodin.insert(comodin.length(), conversion[i]);
            }
        }
        return comodin.toString();
    }
}

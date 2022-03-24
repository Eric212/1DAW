package como.ericsospedra.Tema10.Ejercicio06;
import java.util.Scanner;
import java.util.TreeMap;
public class Ejercicio6 {
    static TreeMap<String,String> palabras=new TreeMap<>();
    static TreeMap<String,String> palabrasInvertidas=new TreeMap<>();
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.print("MENU PRINCIPAL\n===============\n"
            +"1. Introducir pareja de palabras.\n"
            +"2. Traducir palabras.\n"
            +"0. Salir de la aplición.\n"
            +"Elige una opcion: ");
            opcion= Integer.parseInt(lector.nextLine());
            switch (opcion) {
                case 1:
                    if(palabras.size()>0){
                        palabras.clear();
                    }
                    System.out.print("¿Cuantas parejas deseas introducir? ");
                    int respuesta=Integer.parseInt(lector.nextLine());
                    for (int i = 0; i < respuesta; i++) {
                        System.out.print("Introducce palabra en inglés: ");
                        String pal1 = lector.nextLine();
                        System.out.print("Introducce palabra en valenciano: ");
                        String pal2 = lector.nextLine();
                        palabras.put(pal2, pal1);
                        palabrasInvertidas.put(pal1,pal2);
                    }
                    break;
                case 2:
                    System.out.print(palabras.size()+"\nPalabra a buscar: ");
                    String palabraABuscar = lector.nextLine();
                    int cont = 0;
                    for (Object pal1 : palabras.values()) {
                        if (palabraABuscar.equalsIgnoreCase(pal1.toString())) {
                            System.out.println("La traduccion de " + pal1 + " en valenciano es " + palabrasInvertidas.get(pal1));
                            break;
                        }
                    }
                    for(Object pal2: palabrasInvertidas.values()){
                        if (palabraABuscar.equalsIgnoreCase(pal2.toString())) {
                            System.out.println("La traduccion de " + pal2 + " en ingles es " + palabras.get(pal2));
                            break;
                        }
                        cont++;
                    }
                    if (cont == palabras.size()||cont==palabrasInvertidas.size()) {
                        System.out.println("La palabra no existe");
                    }
                    break;
                default:
                    if(opcion<0||opcion>2){
                        System.out.print("La opcion que has introducido no es correcto\n");
                    }
                break;
            }
        }
        while(opcion>0);
    }
}

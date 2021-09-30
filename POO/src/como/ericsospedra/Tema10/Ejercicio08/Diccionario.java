package como.ericsospedra.Tema10.Ejercicio08;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Diccionario {
    static Map<String, String> dictionary = new TreeMap<>();
    static int option;
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.print(
                    "***********************\n"
                            + "* GESTIÓN DICCIONARIO *\n"
                            + "***********************\n"
                            + "1. Añadir palabra\n"
                            + "2. Modificar palabra\n"
                            + "3. Eliminar palabra\n"
                            + "4. Consultar palabra\n"
                            + "5. Mostrar diccionario\n"
                            + "6. Jugar\n"
                            + "7. Mejores Puntaciones\n"
                            + "----------------------\n"
                            + "0. Salir\n"
                            + "Opcion: ");
            option = Integer.parseInt(lector.nextLine());
            switch (option) {
                case 1:
                    addWord();
                    break;
                case 2:
                    modifyWord();
                    break;
                case 3:
                    deleteWord();
                    break;
                case 4:
                    consultWord();
                    break;
                case 5:
                    showDyctionary();
                    break;
                default:
                    while (option < 0 || option > 7) {
                        System.out.println("La opcion es incorrecta, elige una opcion entre 0 y 7");
                    }
                    break;
            }
        }
        while (option != 0);
    }

    public static void addWord() {
        int counter = 0;
        System.out.print("¿Cuantas palabras desea introducir?\nNumero de palabras: ");
        int end = Integer.parseInt(lector.nextLine());
        do {
            System.out.print("Introduce la palabra a añadir\nPalabra: ");
            String word = lector.nextLine();
            if (searchWord(word)) {
                System.out.println("La palabra ya existe");
                System.out.print("Pulsar enter para continuar...");
                lector.nextLine();
            } else {
                System.out.print("Introduce la definición\nDefinición: ");
                String defynition = lector.nextLine();
                dictionary.put(word, defynition);
            }
            counter++;
        }
        while (counter < end);
    }

    public static void modifyWord() {
        showDyctionary();
        System.out.print("Introduce la palabra a modificar\nPalabra: ");
        String word = lector.nextLine();
        if (searchWord(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(word)) {
                    System.out.print("Introduce la definición\nDefinición: ");
                    String defynition = lector.nextLine();
                    dictionary.replace(entry.getKey(), defynition);
                }
            }
        }
    }

    public static void deleteWord() {
        showDyctionary();
        System.out.print("Introduce la palabra a borrar\nPalabra: ");
        String word = lector.nextLine();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (searchWord(word)) {
                if (word.equalsIgnoreCase(entry.getKey()))
                    dictionary.remove(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void consultWord() {
        System.out.print("Introduce la palabra a buscar\nPalabra: ");
        String word = lector.nextLine();
        if (searchWord(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(word)) {
                    System.out.printf("%2s" + ":" + "%5s\n", entry.getKey(), entry.getValue());
                }
            }
            System.out.print("Pulsar enter para continuar...");
            lector.nextLine();
        }
    }

    public static void showDyctionary() {
        if (!isEmpty()) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                System.out.printf("%2s" + ":" + "%3s\n", entry.getKey(), entry.getValue());
            }
            System.out.print("Pulsar enter para continuar...");
            lector.nextLine();
        }
    }

    public static boolean searchWord(String word) {
        boolean exist = false;
        if (dictionary.size() > 0) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(word)) {
                    exist = true;
                    break;
                }
            }
        }
        return exist;
    }

    public static boolean isEmpty() {
        return dictionary.size() <= 0;
    }
}
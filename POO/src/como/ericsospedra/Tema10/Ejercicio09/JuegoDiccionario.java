package como.ericsospedra.Tema10.Ejercicio09;
import java.util.*;
public class JuegoDiccionario {
    static Map<String, String> dictionary = new TreeMap<>();
    static SortedMap<Integer,String> highScore=new TreeMap<>(java.util.Collections.reverseOrder());
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
                case 6:
                    game();
                    break;
                case 7:
                    highScore(2);
                    break;
                default:
                    while(option<0||option>7){
                        System.out.println("La opcion es incorrecta, elige una opcion entre 0 y 7");
                    }
                    break;
            }
        }
        while (option != 0);
    }

    public static void addWord() {
        int counter=0;
        System.out.print("¿Cuantas palabras desea introducir?\nNumero de palabras: ");
        int end=Integer.parseInt(lector.nextLine());
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
                dictionary.put(word,defynition);
            }
            counter++;
        }
        while(counter<end);
    }

    public static void modifyWord() {
        showDyctionary();
        System.out.print("Introduce la palabra a modificar\nPalabra: ");
        String word = lector.nextLine();
        if(searchWord(word)){
            for (Map.Entry<String,String>entry: dictionary.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(word)) {
                    System.out.print("Introduce la definición\nDefinición: ");
                    String defynition=lector.nextLine();
                    dictionary.replace(entry.getKey(),defynition);
                }
            }
        }
    }

    public static void deleteWord() {
        showDyctionary();
        System.out.print("Introduce la palabra a borrar\nPalabra: ");
        String word= lector.nextLine();
        for(Map.Entry<String,String> entry:dictionary.entrySet()) {
            if (searchWord(word)){
                if(word.equalsIgnoreCase(entry.getKey()))
                dictionary.remove(entry.getKey(),entry.getValue());
            }
        }
    }

    public static void consultWord() {
        System.out.print("Introduce la palabra a buscar\nPalabra: ");
        String word = lector.nextLine();
        if (searchWord(word)) {
            for (Map.Entry<String,String>entry:dictionary.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(word)) {
                    System.out.printf("%2s" + ":" + "%5s\n",entry.getKey(),entry.getValue());
                }
            }
            System.out.print("Pulsar enter para continuar...");
            lector.nextLine();
        }
    }

    public static void showDyctionary() {
        if(!isEmpty()) {
            for (Map.Entry<String,String>entry:dictionary.entrySet()) {
                System.out.printf("%2s" + ":" + "%3s\n", entry.getKey(),entry.getValue());
            }
            System.out.print("Pulsar enter para continuar...");
            lector.nextLine();
        }
    }

    public static boolean searchWord(String word) {
        boolean exist = false;
        if (dictionary.size() > 0) {
            for (Map.Entry<String,String>entry:dictionary.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(word)) {
                    exist = true;
                    break;
                }
            }
        }
        return exist;
    }
    public static boolean isEmpty(){
        return dictionary.size() <= 0;
    }
    public static void game(){
        int score=0;
        boolean control=true;
        System.out.println("Bienvenido al juego de adivinar la palabra");
        System.out.print("Introduce nombre de jugador\nNombre: ");
        String player= lector.nextLine();
        do {
            for (Map.Entry<String,String>entry:dictionary.entrySet()) {
                int random=new Random().nextInt(dictionary.size()-1+1);
                int counter=new Random().nextInt(dictionary.size()-1+1);
                if(random==counter){
                    System.out.print(entry.getKey() + "\nPalabra: ");
                    if (entry.getValue().equalsIgnoreCase(lector.nextLine())) {
                        System.out.println("Has acertado");
                        score++;
                    }else{
                        System.out.println("Has perdido");
                        control=false;
                        checkHighScore(score,player);
                        highScore(1);
                        System.out.printf("%1s\n"+"%10s"+"%10s\n","------------------------",player,score);
                        System.out.println("Presione enter...");
                        lector.nextLine();
                        break;
                    }
                }
            }
        }
        while(control);
    }
    public static void checkHighScore(int score,String name){
        if(highScore.size()>0){
            if (highScore.size() < 5) {
                    boolean answer = true;
                    while (answer) {
                        answer = checkName(name);
                    }
                    highScore.put(score, name);
            }else{
                int lowerScore = 0,counter=0;
                String lowerPlayer = "";
                for (Map.Entry<Integer, String> a : highScore.entrySet()) {
                    if (a.getKey() < score) {
                        lowerScore = a.getKey();
                        lowerPlayer = a.getValue();
                        counter++;
                    }
                }
                if (counter>0) {
                    highScore.remove(lowerScore, lowerPlayer);
                    boolean answer = true;
                    while (answer) {
                        answer = checkName(name);
                    }
                    highScore.put(score, name);
                }
            }
        }else{
            boolean answer=true;
            while(answer){
                answer=checkName(name);
            }
            highScore.put(score,name);
        }
    }
    public static void highScore(int n){
        System.out.printf("%10s"+"%10s\n"+"%1s\n","Name","Score",
                "************************");
        for (Map.Entry<Integer,String> entry : highScore.entrySet()) {
            System.out.printf("%10s"+"%10d\n",entry.getValue(),entry.getKey());
        }
        if(n==2) {
            System.out.println("Presione enter para continuar.....");
            lector.nextLine();
        }
    }
    public static boolean checkName(String name){
        boolean answer=true;
        System.out.printf("%1s\n"+"%12s\n"+"%1s\n"+"%1s\n"+"%5s","********************",name,"********************","Tu nombre esta bien","Si/No:");
        if(lector.nextLine().equalsIgnoreCase("Si")){
            answer=false;
        }
        return answer;
    }
    public static boolean checkAnswer(String answer){
        boolean control=false;
        while(!answer.equalsIgnoreCase("Si")&&!answer.equalsIgnoreCase("No")){
            System.out.print("Introduce Si o No");
            answer= lector.nextLine();
        }
        if(answer.equalsIgnoreCase("Si")){
            control=true;
        }
        return control;
    }

}
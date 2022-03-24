package como.ericsospedra.Tema10.Ejercicio10;
import java.util.Random;
public class GeneratorDni {
    private int alea;
    char letra;
    GeneratorDni(){
    }
    public String generateDni(){
        StringBuilder numberDni = new StringBuilder();
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        for(int i=0;i<8;i++){
            alea=new Random().nextInt(9)+1;
            numberDni.insert(numberDni.length(),alea);
        }
        int operation=Integer.parseInt(numberDni.toString())%23;
        letra=letras[operation];
        return numberDni.toString()+letra;
    }
}

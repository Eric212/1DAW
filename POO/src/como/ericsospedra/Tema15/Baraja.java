package como.ericsospedra.Tema15;
import java.util.ArrayList;
public class Baraja {
    private ArrayList<Carta> baraja;
    public Baraja(){
        baraja=iniciarBaraja();
    }
    public ArrayList<Carta> iniciarBaraja(){
        String[] palos={"Trebol","Diamante","Pica","Corazon"};
        ArrayList<Carta> comodin=new ArrayList<>();
        int valor;
        String numero;
        int palo=0;
        Carta carta;
        do{
            for(int i=1;i<14;i++){
                switch (i){
                    case 1:
                        valor=i;
                        numero="A";
                        carta=new Carta(numero,palos[palo],valor);
                        comodin.add(carta);
                    break;
                    case 2,3,4,5,6,7,8,9,10:
                        valor=i;
                        numero=Integer.toString(i);
                        carta=new Carta(numero,palos[palo],valor);
                        comodin.add(carta);
                    break;
                    case 11:
                        valor=10;
                        numero="J";
                        carta=new Carta(numero,palos[palo],valor);
                        comodin.add(carta);
                    break;
                    case 12:
                        valor=10;
                        numero="Q";
                        carta=new Carta(numero,palos[palo],valor);
                        comodin.add(carta);
                    break;
                    case 13:
                        valor=10;
                        numero="K";
                        carta=new Carta(numero,palos[palo],valor);
                        comodin.add(carta);
                    break;
                    default:
                        System.out.println("Error");
                    break;
                }
            }
            palo++;
        }while(palo<4);
        return comodin;
    }
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
}

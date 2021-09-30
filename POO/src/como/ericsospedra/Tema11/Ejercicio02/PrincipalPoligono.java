package como.ericsospedra.Tema11.Ejercicio02;
import como.ericsospedra.Tema11.Ejercicio01.Punto;
import java.util.LinkedList;
import java.util.Queue;
public class PrincipalPoligono {
    public static void main(String[] args) {
        Queue<Punto> poligono=new LinkedList<>();
        poligono.add(new Punto(0,0));
        poligono.add(new Punto(2,0));
        poligono.add(new Punto(2,2));
        poligono.add(new Punto(0,2));
        Poligono pol1=new Poligono(poligono);
        System.out.printf("%-5d\n"+"%-5s"+"%-5s\n",pol1.numVertex(),pol1.toString(pol1),pol1.perimetro());
        pol1.traslada(5,4);
        System.out.printf("%-5d\n"+"%-5s"+"%-5s\n",pol1.numVertex(),pol1.toString(pol1),pol1.perimetro());
    }
}

package como.ericsospedra.Tema11.Ejercicio01;
public class PrincipalPunto {
    public static void main(String[] args) {
        Punto a=new Punto();
        Punto b=new Punto(15.24,34.30);
        System.out.println(a.distancia(b));
        System.out.println(b.distancia(a));
        System.out.println(a.toString(a));
        System.out.println(a.toString(b));
    }
}

package como.ericsospedra.Tema10.Ejercicio03;

public class PrincipalPila {
    static Pila miPila=new Pila();
    public static void main(String[] args) {
        System.out.println(miPila.toString());
        System.out.print(miPila.push(" Ola"));
        System.out.print(miPila.push(" ke"));
        System.out.print(miPila.push(" ase"));
        System.out.print(miPila.push(" programa"));
        System.out.print(miPila.push(" o"));
        System.out.print(miPila.push(" ke"));
        System.out.print(miPila.push(" ase"));
        System.out.println();
        System.out.print(miPila.size());
        System.out.println();
        System.out.print(miPila.pop());
        System.out.print(miPila.pop());
        System.out.print(miPila.pop());
        System.out.print(miPila.pop());
        System.out.print(miPila.pop());
        System.out.print(miPila.pop());
        System.out.print(miPila.pop());
        System.out.println();
        System.out.print(miPila.pop());
    }
}

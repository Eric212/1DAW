package como.ericsospedra.Tema08.Ejercicio2;

public class PrincipalAsignaturas {
    static Asignaturas asignatura1 = new Asignaturas("Programacion", 1007, 1);
    static Asignaturas asignatura2 = new Asignaturas("Sistemas", 1010, 1);
    static Asignaturas asignatura3 = new Asignaturas("Lenguaje de Marcas", 1001, 2);

    public static void main(String[] args) {
        System.out.println(asignatura1.imprimirAsignaturas());
        System.out.println(asignatura2.imprimirAsignaturas());
        System.out.println(asignatura3.imprimirAsignaturas());
    }
}

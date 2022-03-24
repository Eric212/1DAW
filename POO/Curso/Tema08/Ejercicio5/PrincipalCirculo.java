package como.ericsospedra.Tema08.Ejercicio5;

import como.ericsospedra.Tema08.Ejercicio4.PrincipalPunto;
import como.ericsospedra.Tema08.Ejercicio4.Punto;

public class PrincipalCirculo {
    static Circulo circulo1 = new Circulo();
    static Circulo circulo2 = new Circulo(new Punto(), PrincipalPunto.alea.nextDouble() * 10);
    static Circulo circulo3 = new Circulo(2.446, 5.7675, 10.456);

    public static void main(String[] args) {
        System.out.printf("\n%40s" + "%60s" + "%60s\n", "Circulo1", "Circulo2", "Circulo3");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s" + "%55s" + "%58s" + "%58s\n", "Posicion", circulo1.visualizarCirculo(), circulo2.visualizarCirculo(), circulo3.visualizarCirculo());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%11s" + "%28.2f" + "%60.2f" + "%60.2f\n", "Perimetro", circulo1.calcularPerimetro(), circulo2.calcularPerimetro(), circulo3.calcularPerimetro());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%6s" + "%33.2f" + "%60.2f" + "%60.2f\n", "Area", circulo1.calcularArea(), circulo2.calcularArea(), circulo3.calcularArea());
    }
}

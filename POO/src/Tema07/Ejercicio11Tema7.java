import java.util.Scanner;

public class Ejercicio11Tema7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        System.out.println("Introduce tu nombre");
        nombre = lector.nextLine();
        System.out.println("Introduce tu primer apellido");
        apellido1 = lector.nextLine();
        System.out.println("Introduce tu segundo apellido");
        apellido2 = lector.nextLine();
        modificacion(nombre, apellido1, apellido2);
    }

    static void modificacion(String nombre, String apellido1, String apellido2) {
        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
        StringBuilder st = new StringBuilder(nombreCompleto);
        int contador = 0;
        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto.length());
        for (int i = 0; i < 5 && i < nombreCompleto.length(); i++) {
            System.out.print(nombreCompleto.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < 2 && i < nombreCompleto.length(); i++) {
            System.out.print(st.reverse().charAt(i));
        }
        System.out.println();
        char ultima = st.reverse().charAt(0);
        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (nombreCompleto.charAt(i) == ultima) {
                contador++;
            }
            if (i == nombreCompleto.length() - 1) {
                System.out.println(ultima + " aparece " + contador + " en tu nombre completo");
            }
        }
        String[] particion = nombreCompleto.split(" ");
        String[] modificacion = new String[particion.length * 2];
        int j = 0;
        for (int i = 0; i < particion.length; i++) {
            modificacion[j] = particion[i].substring(0, 1).toUpperCase();
            j++;
            modificacion[j] = particion[i].substring(1, particion[i].length());
            j++;
            if (i == particion.length - 1) {
                for (int k = 0; k < modificacion.length; k++) {
                    if (k != 0 && k % 2 == 0) {
                        System.out.print(" " + modificacion[k]);
                    } else {
                        System.out.print(modificacion[k]);
                    }
                }
            }
        }
        System.out.println();
        st = st.reverse();
        for (int i = 0; i < 3; i++) {
            st = (st.insert(0, '*'));
            st = (st.insert(st.length(), '*'));
            if (i == 2) {
                System.out.println(st);
            }
        }
        System.out.println(st.reverse());
    }
}
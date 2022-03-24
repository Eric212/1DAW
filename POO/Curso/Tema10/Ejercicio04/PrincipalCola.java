package como.ericsospedra.Tema10.Ejercicio04;

public class PrincipalCola {
    static Cola miCola=new Cola();
    public static void main(String[] args) {
        if(miCola.add(" Ola")){
            System.out.print("Añadido correctamente\n");
        }
        if(miCola.add(" ke")){
            System.out.print("Añadido correctamente\n");
        }
        if(miCola.add(" ase")){
            System.out.print("Añadido correctamente\n");
        }
        if(miCola.add(" programa")){
            System.out.print("Añadido correctamente\n");
        }
        if(miCola.add(" o")){
            System.out.print("Añadido correctamente\n");
        }
        if(miCola.add(" ke")){
            System.out.print("Añadido correctamente\n");
        }
        if(miCola.add(" ase")){
            System.out.print("Añadido correctamente");
        }
        System.out.println();
        System.out.print(miCola.size());
        System.out.println();
        System.out.print(miCola.remove());
        System.out.print(miCola.remove());
        System.out.print(miCola.remove());
        System.out.print(miCola.remove());
        System.out.print(miCola.remove());
        System.out.print(miCola.remove());
        System.out.print(miCola.remove()+"\n");
        System.out.print(miCola.remove());
    }
}

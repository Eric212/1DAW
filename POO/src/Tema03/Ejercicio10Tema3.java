package Tema03;

public class Ejercicio10Tema3 {
    public enum meses {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}

    public enum notasMusicales {DO, RE, MI, FA, SOL, LA}

    public enum notasAlumno {INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE}

    public static void main(String arg[]) {
        for (meses m : meses.values()) {
            System.out.print(m.toString() + " - ");
        }
        System.out.println();
        for (notasMusicales nM : notasMusicales.values()) {
            System.out.print(nM.toString() + " - ");
        }
        System.out.println();
        for (notasAlumno nA : notasAlumno.values()) {
            System.out.print(nA.toString() + " - ");
        }
    }
}
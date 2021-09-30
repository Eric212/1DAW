package como.ericsospedra.Tema08.Ejercicio2;

public class Asignaturas {
    private String nombre;
    private int codigoAsig, curso;

    public Asignaturas(String nombre, int codigoAsig, int curso) {
        this.nombre = nombre;
        this.codigoAsig = codigoAsig;
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCodigoAsig(int codigoAsig) {
        this.codigoAsig = codigoAsig;
    }

    public int getCodigoAsig() {
        return this.codigoAsig;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String imprimirAsignaturas() {
        return "Asignatura: " + nombre + "\nCodigo Asignatura: " + codigoAsig + "\nCurso: " + curso;
    }
}

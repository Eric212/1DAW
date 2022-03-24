package como.ericsospedra.Tema09.Ejercicio5;

public class Alumno {
    private String nombre;
    private float altura;
    private int edad;
    public Alumno(String nombre, float altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public float getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
}

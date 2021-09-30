package como.ericsospedra.Tema10.Ejercicio05;
import java.time.LocalDate;
public class Paciente {
    private int id;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private char sexo;
    private float altura;
    private float peso;
    public Paciente(int id, String nombre, LocalDate fechaDeNacimiento, char sexo, float altura, float peso) {
        this.id = id;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
}

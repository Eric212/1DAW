package como.ericsospedra.Tema08.Ejercicio7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Queue;

public class Paciente {
    private int sip;
    private String nombre;
    private char sexo;
    private LocalDate fechaDeEntrada;
    private LocalDateTime horaDeEntrada;
    private int edad;
    private String sintomatologia;
    private Queue<Float> preRev;
    private LocalDate fechaAlta;
    private LocalDateTime horaDeAlta;
    private String motivoDeAlta;
    private boolean menorDeUnAnyo;
    private boolean atendido;

    public Paciente(int sip, String nombre, char sexo, LocalDate fechaDeEntrada, LocalDateTime horaDeEntrada, int edad, String sintomatologia, Queue<Float> preRev, LocalDate fechaAlta, LocalDateTime horaDeAlta, String motivoDeAlta, boolean menorDeUnAnyo) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaDeEntrada = fechaDeEntrada;
        this.horaDeEntrada = horaDeEntrada;
        this.edad = edad;
        this.sintomatologia = sintomatologia;
        this.preRev = preRev;
        this.fechaAlta = fechaAlta;
        this.horaDeAlta = horaDeAlta;
        this.motivoDeAlta = motivoDeAlta;
        this.menorDeUnAnyo = menorDeUnAnyo;
        this.atendido = false;
    }

    public int getSip() {
        return sip;
    }

    public void setSip(int sip) {
        this.sip = sip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(LocalDate fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public LocalDateTime getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(LocalDateTime horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    public void setSintomatologia(String sintomatologia) {
        this.sintomatologia = sintomatologia;
    }

    public Queue<Float> getPreRev() {
        return preRev;
    }

    public void setPreRev(Queue<Float> preRev) {
        this.preRev = preRev;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDateTime getHoraDeAlta() {
        return horaDeAlta;
    }

    public void setHoraDeAlta(LocalDateTime horaDeAlta) {
        this.horaDeAlta = horaDeAlta;
    }

    public String getMotivoDeAlta() {
        return motivoDeAlta;
    }

    public void setMotivoDeAlta(String motivoDeAlta) {
        this.motivoDeAlta = motivoDeAlta;
    }

    public boolean getMenorDeUnAnyo() {
        return menorDeUnAnyo;
    }

    public void setMenorDeUnAnyo(boolean menorDeUnAnyo) {
        this.menorDeUnAnyo = menorDeUnAnyo;
    }

    public boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}

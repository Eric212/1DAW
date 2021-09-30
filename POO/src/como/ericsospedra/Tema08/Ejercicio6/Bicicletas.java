package como.ericsospedra.Tema08.Ejercicio6;

import java.util.GregorianCalendar;

public class Bicicletas {
    private int referencia;
    private String marca;
    private String modelo;
    private float peso;
    private float ruedasPulgadas;
    private boolean motor;
    private GregorianCalendar fechaDeFabricacion;
    private float precio;
    private int existencias;

    public Bicicletas(int referencia, String marca, String modelo, float peso, float ruedasPulgadas, boolean motor, GregorianCalendar fechaDeFabricacion, float precio, int existencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.ruedasPulgadas = ruedasPulgadas;
        this.motor = motor;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public int getReferencia() {
        return this.referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getRuedasPulgadas() {
        return this.ruedasPulgadas;
    }

    public void setRuedasPulgadas(float ruedasPulgadas) {
        this.ruedasPulgadas = ruedasPulgadas;
    }

    public String getMotor() {
        if (this.motor) {
            return "Si";
        } else {
            return "No";
        }
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public GregorianCalendar getFechaDeFabricacion() {
        return this.fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(GregorianCalendar fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return this.existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
}

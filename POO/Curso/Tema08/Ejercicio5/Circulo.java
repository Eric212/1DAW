package como.ericsospedra.Tema08.Ejercicio5;

import como.ericsospedra.Tema08.Ejercicio4.PrincipalPunto;
import como.ericsospedra.Tema08.Ejercicio4.Punto;

public class Circulo {
    private Punto centro;
    private double radio;
    private double area;
    private double perimetro;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(x, y);
        this.radio = radio;
    }

    public Circulo() {
        this.centro = new Punto();
        this.radio = PrincipalPunto.alea.nextDouble() * 10;
    }

    public Punto getCentro() {
        return this.centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double calcularPerimetro() {
        return this.perimetro = 2 * Math.PI * this.radio;
    }

    public double calcularArea() {
        return this.area = Math.PI * Math.pow(this.radio, 2);
    }

    public String visualizarCirculo() {
        if (this.centro.getX() == 0 && this.centro.getY() == 0) {
            return "Círculo de radio " + Math.round(this.radio) + " cm situado en el origen de coordenadas.";
        } else {
            return "Círculo de radio " + Math.round(this.radio) + " cm situado en el punto (" + Math.round(this.centro.getX()) + "," + Math.round(this.centro.getY()) + ").";
        }
    }
}
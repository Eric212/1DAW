package como.ericsospedra.Tema08.Ejercicio4;

public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = PrincipalPunto.alea.nextDouble() * 10;
        this.y = PrincipalPunto.alea.nextDouble() * 10;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto x) {
        double resultado = Math.sqrt(Math.pow(this.x - x.getX(), 2) + Math.pow(this.y - x.getY(), 2));
        return resultado;
    }

    public String visualizarPunto() {
        return "(" + Math.round(this.x) + "," + Math.round(this.y) + ")";
    }
}

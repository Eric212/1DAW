package como.ericsospedra.Tema11.Ejercicio01;
public class Punto {
    private double x;
    private double y;

    public Punto() {
        this.x=35.63;
        this.y=50.35;
    }
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distancia(Punto a){
        return Math.sqrt(Math.pow((this.x-a.getX()),2)+Math.pow((this.y-a.getY()),2));
    }
    public String toString(Punto a){
        return "("+a.getX()+","+a.getY()+")";
    }
}

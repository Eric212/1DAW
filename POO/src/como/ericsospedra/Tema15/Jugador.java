package como.ericsospedra.Tema15;
public class Jugador {
    private int partidas;
    private int puntos;
    private float dinero;
    public Jugador(){
        this.dinero=1000;
        this.puntos=0;
        this.partidas=0;
    }
    public int getPartidas() {
        return partidas;
    }
    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public float getDinero() {
        return dinero;
    }
    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}

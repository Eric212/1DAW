package como.ericsospedra.Tema10.Ejercicio11;

public class ClassRoom {
    private int id;
    private float squareMeter;
    public ClassRoom(int id, float squareMeter) {
        this.id = id;
        this.squareMeter = squareMeter;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getSquareMeter() {
        return squareMeter;
    }
    public void setSquareMeter(float squareMeter) {
        this.squareMeter = squareMeter;
    }
}

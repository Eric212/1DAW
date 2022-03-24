package como.ericsospedra.Tema10.Ejercicio07;
public class Divisa implements Map {
    @Override
    public float usd(float euros) {
        return euros*1.21f;
    }
    @Override
    public float gbp(float euros) {
        return euros*0.87f;
    }
    @Override
    public float inr(float euros) {
        return euros*90.65f;
    }
    @Override
    public float aud(float euros) {
        return euros*1.56f;
    }
    @Override
    public float cad(float euros) {
        return euros*1.51f;
    }
    @Override
    public float ars(float euros) {
        return euros*112.67f;
    }
    @Override
    public float bob(float euros) {
        return euros*8.25f;
    }
    @Override
    public float clp(float euros) {
        return euros*862.78f;
    }
    @Override
    public float vez(float euros) {
        return euros*4388f;
    }
    @Override
    public float crc(float euros) {
        return euros*740.95f;
    }
    @Override
    public float cup(float euros) {
        return euros*29.04f;
    }
    @Override
    public float dop(float euros) {
        return euros*68.71f;
    }
    @Override
    public float mxn(float euros) {
        return euros*23.99f;
    }
}

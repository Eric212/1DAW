package como.ericsospedra.Tema08.PilasYColas.Ejercicio3;

public class Cola {
    private int cola[];
    private int k, j;

    public Cola(int a) {
        this.cola = new int[a];
        this.k = -1;
        this.j = cola.length;
    }

    public void add(int a) {
        this.k++;
        this.cola[k] = a;
    }

    public int remove() {
        int aux = this.cola[j];
        this.cola[this.j] = 0;
        this.k--;
        return aux;
    }

    public boolean full() {
        if (this.cola.length - 1 == k) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return k;
    }

    public int top() {
        return this.cola[k];
    }
}

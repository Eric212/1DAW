package como.ericsospedra.Tema08.PilasYColas.Ejercicio1;

public class Pila {
    private int pila[];
    private int k;

    public Pila(int a) {
        this.pila = new int[a];
        this.k = -1;
    }

    public void push(int a) {
        this.k++;
        this.pila[k] = a;
    }

    public int pop() {
        int aux = this.pila[k];
        this.pila[k] = 0;
        this.k--;
        return aux;
    }

    public boolean full() {
        if (this.pila.length - 1 == k) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return k;
    }

    public int top() {
        return this.pila[k];
    }
}

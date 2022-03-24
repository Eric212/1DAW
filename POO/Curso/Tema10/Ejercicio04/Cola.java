package como.ericsospedra.Tema10.Ejercicio04;

import java.util.ArrayList;

public class Cola implements ICola{
    private ArrayList<String> lista = new ArrayList<>();
    @Override
    public boolean add(String e) {
        this.lista.add(e);
        if (this.lista.get(this.lista.size() - 1).equalsIgnoreCase(e)) {
            return true;
        }
        return false;
    }
    @Override
    public String remove() {
        if(isEmpty()){
            return "No quedan mas datos en la cola";
        }else{
            String top = this.lista.get(0);
            this.lista.remove(this.lista.get(0));
            return top;
        }
    }
    @Override
    public int size() {
        return this.lista.size();
    }
    @Override
    public String peek() {
        return this.lista.get(0);
    }
    @Override
    public boolean isEmpty() {
        return this.lista.isEmpty();
    }
}

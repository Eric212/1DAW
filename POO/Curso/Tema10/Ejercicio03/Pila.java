package como.ericsospedra.Tema10.Ejercicio03;
import java.util.ArrayList;
public class Pila<T> implements IPila {
        ArrayList<T> lista = new ArrayList<T>();
        @Override
        public Object push(Object T) {
            lista.add((T) T);
            return T;
        }
        @Override
        public Object pop() {
            if(isEmpty()){
                return "No quedan mas datos en la pila";
            }else {
                return lista.remove(lista.size() - 1);
            }
        }
        @Override
        public int size() {
            return lista.size();
        }
        @Override
        public Object top() {
            return this.lista.get(this.lista.size() - 1);
        }
        @Override
        public boolean isEmpty() {
            return this.lista.isEmpty();
        }
}

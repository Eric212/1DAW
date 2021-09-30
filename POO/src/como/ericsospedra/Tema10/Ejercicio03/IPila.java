package como.ericsospedra.Tema10.Ejercicio03;

public interface IPila<String> {
    String push(String e);
    String pop();
    int size();
    String top();
    boolean isEmpty();
}

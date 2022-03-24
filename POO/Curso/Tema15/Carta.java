package como.ericsospedra.Tema15;
public class Carta {
    private String numero;
    private String palo;
    private int valor;
    public Carta(String numero, String palo, int valor) {
        this.numero = numero;
        this.palo = palo;
        this.valor = valor;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String toString() {
        return numero+" "+palo;
    }
}

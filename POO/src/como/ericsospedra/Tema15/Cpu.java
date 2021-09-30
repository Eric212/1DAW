package como.ericsospedra.Tema15;
public class Cpu {
    private int partidas;
    private int puntos;
    public float dinero;
    public Cpu(){
        this.puntos=0;
        this.partidas=0;
        this.dinero=1000;
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

    public static class Carta {
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
}
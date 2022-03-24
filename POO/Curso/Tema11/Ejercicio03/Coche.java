package como.ericsospedra.Tema11.Ejercicio03;
import java.util.ArrayList;
public abstract class Coche {
    private String matricula;
    private int velocidadActual;
    private int marchaActual;
    private ArrayList<Integer> velocidadMaximaPorMarcha;
    public Coche(String matricula, ArrayList<Integer> velocidadMaximaPorMarcha) {
        this.matricula = matricula;
        this.velocidadActual = 0;
        this.marchaActual = 0;
        this.velocidadMaximaPorMarcha = velocidadMaximaPorMarcha;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public int getMarchaActual() {
        return marchaActual;
    }
    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }
    public ArrayList<Integer> getVelocidadMaximaPorMarcha() {
        return velocidadMaximaPorMarcha;
    }
    public void setVelocidadMaximaPorMarcha(ArrayList<Integer> marchas) {
        for(int i=0;i<marchas.size();i++){
            this.velocidadMaximaPorMarcha.add(marchas.get(i));
        }
    }
    public void acelerar(int incremento){
        this.velocidadActual=this.velocidadActual+incremento;
    }
    public void frenar(int decremento){
        this.velocidadActual=this.velocidadActual+decremento;
    }
    public String toString(Coche coche){
        return this.matricula+"\n"+this.velocidadActual+"\n"+this.marchaActual+"\n"+this.velocidadMaximaPorMarcha.toString();
    }
    protected abstract void cambiarMarcha(int marcha);
    public String toString(ArrayList<Integer> velocidadesMarchas){
        StringBuilder velocidades=new StringBuilder();
        for(int i=0;i<velocidadesMarchas.size();i++){
            velocidades.insert(velocidades.length(),velocidadesMarchas.get(i)+" ");
        }
        return velocidades.toString();
    }
}

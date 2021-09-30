package como.ericsospedra.Tema11.Ejercicio03;
import java.util.ArrayList;
public class CocheCambioAutomatico extends Coche{
    public CocheCambioAutomatico(String matricula, ArrayList<Integer> velocidadMaximaPorMarcha) {
        super(matricula, velocidadMaximaPorMarcha);
    }

    @Override
    protected void cambiarMarcha(int marcha) {
        setMarchaActual(marcha);
    }
    public void acelerar(int incremento){
        if(super.getMarchaActual()==0) {
            if (super.getVelocidadActual() + incremento < super.getVelocidadMaximaPorMarcha().get(super.getVelocidadMaximaPorMarcha().size() - 1)) {
                for (int i = 0; i < super.getVelocidadMaximaPorMarcha().size(); i++) {
                    if (super.getVelocidadActual()+incremento<=super.getVelocidadMaximaPorMarcha().get(i)) {
                        super.setMarchaActual(i+1);
                        break;
                    }
                }
                super.setVelocidadActual(super.getVelocidadActual() + incremento);
            } else {
                System.out.println("No puedes acelerar mas");
            }
        }
    }
    public void frenar(int decremento){
        acelerar(decremento);
    }
}
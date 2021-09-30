package como.ericsospedra.Tema11.Ejercicio03;
import java.util.ArrayList;
public class CocheCambioManual extends Coche{
    public CocheCambioManual(String matricula, ArrayList<Integer> velocidadMaximaPorMarcha) {
        super(matricula, velocidadMaximaPorMarcha);
    }
    @Override
    public void cambiarMarcha(int marcha) {
        if(marcha>0){
            super.setMarchaActual(marcha);
        }else{
            System.out.println("No puedes cambiar a una marcha negativa");
        }
    }
}

package como.ericsospedra.Tema11.Ejercicio04;

public class Lavadora extends Electrodomestico{
    private float carga=5f;
    public Lavadora() {
    }
    public Lavadora(float preicoBase, float peso) {
        super(preicoBase, peso);
    }
    public Lavadora(float preicoBase, String color, char consumoEnergetico, float peso, float carga) {
        super(preicoBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    public float getCarga() {
        return carga;
    }
    public float precioFinal(){
        float precio=this.getPreicoBase();
        if(getConsumoEnergetico()=='A'){
            precio+=100f;
        }else if(getConsumoEnergetico()=='B'){
            precio+=80f;
        }else if(getConsumoEnergetico()=='C'){
            precio+=60f;
        }else if(getConsumoEnergetico()=='D'){
            precio+=50f;
        }else if(getConsumoEnergetico()=='E'){
            precio+=30f;
        }else{
            precio+=10f;
        }
        if(getPeso()>0&&getPeso()<20){
            precio+=10f;
        }else if(getPeso()>19&&getPeso()<50){
            precio+=50f;
        }else if(getPeso()>49&&getPeso()<80){
            precio+=80f;
        }else{
            precio+=100f;
        }
        if(this.carga>30f){
            return precio+=50f;
        }
        return precio;
    }
}

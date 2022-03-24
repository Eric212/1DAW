package como.ericsospedra.Tema11.Ejercicio04;

public class Television extends Electrodomestico{
    private float pulgadas=20f;
    private boolean smartTV=false;

    public Television() {
    }
    public Television(float preicoBase, float peso) {
        super(preicoBase, peso);
    }

    public Television(float preicoBase, String color, char consumoEnergetico, float peso, float pulgadas, boolean smartTV) {
        super(preicoBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.smartTV = smartTV;
    }
    public float getPulgadas() {
        return pulgadas;
    }
    public boolean isSmartTV() {
        return smartTV;
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
        if(this.pulgadas>40f){
            precio+=(precio-((precio*30)/100));
        }
        return precio;
    }
}

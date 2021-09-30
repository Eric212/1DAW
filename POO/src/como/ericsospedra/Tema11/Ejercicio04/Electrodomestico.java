package como.ericsospedra.Tema11.Ejercicio04;

public abstract class Electrodomestico {
    private float preicoBase=100f;
    private String color="Blanco";
    private char consumoEnergetico='F';
    private float peso=5f;
    public Electrodomestico() {
    }
    public Electrodomestico(float preicoBase,float peso){
        this.preicoBase=preicoBase;
        this.peso=peso;
    }
    public Electrodomestico(float preicoBase, String color, char consumoEnergetico, float peso) {
        this.preicoBase = preicoBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    public float getPreicoBase() {
        return preicoBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public float getPeso() {
        return peso;
    }
    private char comprobarConsumoEnergetico(char consumo){
        char[] consumos={'A','B','C','D','E','F'};
        for(int i=0;i<consumos.length;i++){
            if(consumo==consumos[i]){
                return consumos[i];
            }
        }
        return 'F';
    }
    private String comprobarColor(String color){
        String[] colores={"Blanco","Negro","Azul","Rojo","Gris"};
        for(int i =0;i< colores.length;i++){
            if (color.equalsIgnoreCase(colores[i])){
                return colores[i];
            }
        }
        return "Blanco";
    }
    public float precioFinal(){
        float precio=this.preicoBase;
        if(this.consumoEnergetico=='A'){
            precio+=100f;
        }else if(this.consumoEnergetico=='B'){
            precio+=80f;
        }else if(this.consumoEnergetico=='C'){
            precio+=60f;
        }else if(this.consumoEnergetico=='D'){
            precio+=50f;
        }else if(this.consumoEnergetico=='E'){
            precio+=30f;
        }else{
            precio+=10f;
        }
        if(this.peso>0&&this.peso<20){
            precio+=10f;
        }else if(this.peso>19&&this.peso<50){
            precio+=50f;
        }else if(this.peso>49&&this.peso<80){
            precio+=80f;
        }else{
            precio+=100f;
        }
        return precio;
    }
}

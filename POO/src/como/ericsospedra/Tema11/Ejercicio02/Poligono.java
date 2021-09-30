package como.ericsospedra.Tema11.Ejercicio02;
import como.ericsospedra.Tema11.Ejercicio01.Punto;
import java.util.Queue;
public class Poligono extends Punto {
    Queue<Punto> poligono;
    public Poligono(Queue<Punto> poligono) {
        this.poligono = poligono;
    }
    public void traslada(double x,double y){
        Punto aux;
        for(int i=0;i<poligono.size();i++){
            aux=poligono.poll();
            aux.setX(aux.getX()+x);
            aux.setY(aux.getY()+y);
            poligono.add(aux);
        }
    }
    public Queue<Punto> getPoligono() {
        return poligono;
    }
    public void setPoligono(Queue<Punto> poligono) {
        this.poligono = poligono;
    }
    public int numVertex(){
        return this.poligono.size();
    }
    public String toString(Poligono poligono){
        Punto aux;
        StringBuilder coordenadas=new StringBuilder();
        for(int i=0;i<this.poligono.size();i++){
            aux=this.poligono.poll();
            coordenadas.insert(coordenadas.length(),"(");
            coordenadas.insert(coordenadas.length(),aux.getX());
            coordenadas.insert(coordenadas.length()," , ");
            coordenadas.insert(coordenadas.length(),aux.getY());
            coordenadas.insert(coordenadas.length(),")\n");
            this.poligono.add(aux);
        }
        return coordenadas.toString();
    }
    public double perimetro(){
        Punto aux1,aux2;
        double resul=0;
        for(int i=0;i<this.poligono.size();i++){
            aux1=this.poligono.poll();
            aux2=this.poligono.poll();
            resul=aux1.distancia(aux2)+resul;
            this.poligono.add(aux1);
            this.poligono.add(aux2);
        }
        return resul;
    }
}

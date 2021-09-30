import java.util.Random;

public class Ejercicio22Tema7 {
    public static void main(String[] args) {
        Random alea = new Random();
        int[] p = new int[10];
        for (int i = 0; i < p.length; i++) {
            p[i] = alea.nextInt(20 - 0 + 1);
        }
        filtrado(p);
    }

    static void filtrado(int[] p) {
        int[] s = new int[p.length];
        int k = 1;
        for (int i = 0; i < s.length; i++) {
            if (p[i] >= 10) {
                s[i] = p[i];
                System.out.print("Valor " + k + ":\t" + s[i] + "\n");
            } else {
                s[i] = -1;
                System.out.print("Valor " + k + ":\t" + s[i] + "\n");
            }
            k++;
        }
    }
}
    /*public static int[] getSliceOfArray(int[] p,int start, int end){
         int[] s= new int[end-start]; 
         for (int i =0;i<s.length;i++){ 
            s[i]= p[start+i]; 
        }
        return s; 
    } 
	static int[] quicksort(int p[], int izq, int der){
        if(izq!=der){
            int pivote;
            int aux;
            pivote = 10;
            while(izq!=der){
                while(p[der]>=pivote && izq<der){
                    der--;
                }
                while(p[izq]<pivote && izq<der){
                    izq++;
                }
                if(der!=izq){
                    aux=p[der];
                    p[der]=p[izq];
                    p[izq]=aux;
                }         
            }
        }
        int[] s=getSliceOfArray(p,izq+1,p.length);
        return s;
    }
}*/
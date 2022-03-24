
public class Main
{
    public static void main(String[] args)
    {
    int []arreglo = {5,11,7,15,4,12,75,1,3,5,6,7,23,3,4,2,45,13};    
    Ordenador o = new Ordenador();
    o.ordenarQuicksort(arreglo);
    
    for(int i =0;i<arreglo.length;i++)
    {
    System.out.print(arreglo[i]+" ");
    }
}
}

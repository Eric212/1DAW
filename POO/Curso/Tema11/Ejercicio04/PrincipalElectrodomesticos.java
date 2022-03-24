package como.ericsospedra.Tema11.Ejercicio04;
import java.util.Scanner;
public class PrincipalElectrodomesticos {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        float precioLavadoras=0f,precioTelevisiones=0f,precioElectrodomesticos=0f;
        Electrodomestico[] electrodomesticos=new Electrodomestico[10];
        for(int i=0;i<electrodomesticos.length;i++){
            Electrodomestico elec;
            System.out.print("El electrodomestico es una lavadora o una televisión\nRespuesta: ");

            switch (lector.nextLine().toLowerCase()){
                case "lavadora":
                    elec=new Lavadora(150.50f,45.5f);
                break;
                case "television":
                break;
                default:
                break;
            }
        }
        for(int i=0;i< electrodomesticos.length;i++){
            precioElectrodomesticos+=electrodomesticos[i].precioFinal();
            if(electrodomesticos[i] instanceof Lavadora) {
                System.out.printf("%-40s"+"%-8.2f"+"%-1s\n","El precio de la lavadora es: ",electrodomesticos[i].precioFinal(),"€");
                precioLavadoras+=electrodomesticos[i].precioFinal();
            }else{
                System.out.printf("%-40s"+"%-8.2f"+"%-1s\n","El precio de la television es: ",electrodomesticos[i].precioFinal(),"€");
                precioTelevisiones+=electrodomesticos[i].precioFinal();
            }
            if(i==electrodomesticos.length-1){
                System.out.printf("%-1s\n"+"%-40s"+"%-8.2f"+"%-1s\n","----------------------------------------------------"
                        ,"El precio de las televisiones es: ",precioTelevisiones,"€");
                System.out.printf("%-40s"+"%-8.2f"+"%-1s\n","El precio de las lavadoras es: ",precioLavadoras,"€");
                System.out.printf("%-40s"+"%-8.2f"+"%-1s\n","El precio de los electrodomesticos es: ",precioElectrodomesticos,"€");
            }
        }
    }
    //{lav1=new Lavadora(150.50f,45.5f),new Television(230.56f,34.5f)
    //                ,new Lavadora(230.45f,63.4f),new Television(954.56f,25.6f)
    //                ,new Lavadora(100f,55.4f),new Television(649.99f,33.6f)
    //                ,new Lavadora(699.45f,65.3f),new Television(249.54f,37.5f)
    //                ,new Lavadora(1049.45f,58.4f),new Television(3965.65f,40.5f)};
}

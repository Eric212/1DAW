import java.util.Scanner;
public class Envia {
    public static void main(String[] args) {
        float peso,coste=0f;
        int pesoRedon, codPais;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el codigo del pais");
        codPais=lector.nextInt();
        lector.nextLine();
        while(codPais<1||codPais>15){
            System.out.println("Introduce un codigo de pais valido, entre 1 y 15");
            codPais=lector.nextInt();
            lector.nextLine();
        }
        System.out.println("Introduce el peso del paquete");
        peso=lector.nextFloat();
        while(peso<1||peso>20){
            System.out.println("Introduce un peso valido, entre 1 y 20");
            codPais=lector.nextInt();
            lector.nextLine();
        }
        pesoRedon=Math.round(peso);
        while(pesoRedon!=0){
            if(codPais>=5&&codPais<=8){
                if(pesoRedon>10){
                    if(pesoRedon%10==0){
                        coste=coste+(10f*2f);
                        pesoRedon=pesoRedon-10;
                    }else{
                        coste=coste+(pesoRedon%10f*2f);
                        pesoRedon=pesoRedon-(pesoRedon%10);
                    }
                }else if(pesoRedon<=10&&pesoRedon>5){
                    if(pesoRedon%5==0){
                        coste=(coste+5f*2.5f);
                        pesoRedon=pesoRedon-5;
                    }else{
                        coste=coste+(pesoRedon%5f*2.5f);
                        pesoRedon=pesoRedon-(pesoRedon%5);
                    }
                }else if(pesoRedon<=5&&pesoRedon>1){
                    if(pesoRedon/1==5){
                        coste=coste+(4f*3f);
                        pesoRedon=pesoRedon-4;
                    }else{
                        coste=coste+(pesoRedon%1f*3f);
                        pesoRedon=pesoRedon-(pesoRedon/1);
                    }
                }else{
                    coste=coste+4;
                    pesoRedon=0;
                }
            }else if(codPais!=4){
                if(pesoRedon>10){
                    if(pesoRedon%10==0){
                        coste=coste+(10f*2f);
                        pesoRedon=pesoRedon-10;
                    }else{
                        coste=coste+(pesoRedon%10f*2.5f);
                        pesoRedon=pesoRedon-(pesoRedon%10);
                    }
                }else if(pesoRedon<=10&&pesoRedon>5){
                    if(pesoRedon%5==0){
                        coste=(coste+5f*3f);
                        pesoRedon=pesoRedon-5;
                    }else{
                        coste=coste+(pesoRedon%5f*3f);
                        pesoRedon=pesoRedon-(pesoRedon%5);
                    }
                }else if(pesoRedon<=5&&pesoRedon>1){
                    if(pesoRedon/1==5){
                        coste=coste+(4f*3.5f);
                        pesoRedon=pesoRedon-4;
                    }else{
                        coste=coste+(pesoRedon%1f*3.5f);
                        pesoRedon=pesoRedon-(pesoRedon/1);
                    }
                }else{
                    coste=coste+5;
                    pesoRedon=0;
                }
            }
        }
        if(codPais>=5||codPais<=8){
            System.out.printf("El coste del envia del paquete con peso: "+"%2.1f"+"Kg a la Zona A"+" tiene un coste de: "+"%2.2f"+"€\n",peso,coste);
        }else if(codPais!=4){
            System.out.printf("El coste del envia del paquete con peso: "+"%2.1f"+"Kg a la Zona B"+" tiene un coste de: "+"%2.2f"+"€\n",peso,coste);
        }
    }
}
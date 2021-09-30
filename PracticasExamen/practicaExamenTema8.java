import java.util.Scanner;
public class practicaExamenTema8{
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float salarioBase,salarioNeto;
        int antiguedad;
        boolean plusProductividad;
        System.out.println("Introduzca el Salario Base (Semanal)");
        salarioBase=comprobarSalario(lector.nextLine());
        while(salarioBase<0){
            System.out.println("Introduce un Salario Base valido");
            salarioBase=comprobarSalario(lector.nextLine());
        }
        System.out.println(salarioBase);
        System.out.println("Introduce la antigüedad en años completos");
        antiguedad=lector.nextInt();
        lector.nextLine();
        System.out.print("Introduce si le corresponde plus de productividad\nSi/No: ");
        if(lector.nextLine().equalsIgnoreCase("Si")){
            plusProductividad=true;
        }else{
            plusProductividad=false;
        }
        if(antiguedad/3>=1){
            antiguedad/=3;
            salarioBase=salarioBase+(salarioBase-(antiguedad*7f*salarioBase/100f));
            if(antiguedad>=2&&plusProductividad==true){
                salarioBase=salarioBase+(salarioBase-(salarioBase*12f/100f));
            }
        }
        if(plusProductividad==true){
            salarioBase=salarioBase+(salarioBase-(salarioBase*19f/100f));
        }
        if(salarioBase<500f){
            salarioNeto=salarioBase-(salarioBase*20f/100f);
        }else if(salarioBase>500f&&salarioBase<700f){
            salarioNeto=salarioBase-(salarioBase*22f/100f);
        }else{
            salarioNeto=salarioBase-(salarioBase*24f/100f);
        }
        System.out.printf("El salario neto es: "+"%3.2f\n",salarioNeto);
    }
    public static float comprobarSalario(String salario){
        String[] salarios=salario.split(",");
        float[] conversion=new float[salarios.length];
        float salarioBase;
        for(int i=0;i<salarios.length;i++){
            conversion[i]=Float.parseFloat(salarios[i]);
        }
        conversion[0]+=conversion[1]/100f;
        salario=Float.toString(conversion[0]);
        salarioBase=Float.parseFloat(salario);
        return salarioBase;
    }
}
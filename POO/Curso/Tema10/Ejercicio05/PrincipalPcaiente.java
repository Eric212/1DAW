package como.ericsospedra.Tema10.Ejercicio05;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class PrincipalPcaiente {
    static Scanner lector = new Scanner(System.in);
    static Paciente[] personas={new Paciente(0,"Eric Sospedra Salort",LocalDate.of(1996,3,15),'M',1.72f,75f)
    ,new Paciente(0,"Mireia Saiz Boyer",LocalDate.of(1997,5,18),'F',1.68f,71.5f)
    ,new Paciente(0,"Monica Salort Cabot",LocalDate.of(1962,9,27),'F',1.65f,66f)
    ,new Paciente(0,"Luis Francisco Sospedra Martinez",LocalDate.of(1962,3,9),'M',1.78f,80f)
    ,new Paciente(0,"Dafne Sospedra Salort",LocalDate.of(1991,12,16),'F',1.70f,74f)};
    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static int opcion, cont = 0;
    static String respuesta;
    static boolean menorDeUnAnyo = false;
    public static void main(String[] args) {
        for (int i = 0; i < personas.length; i++) {
            pacientes.add(personas[i]);
            pacientes.get(i).setId(i+1);
            if(i== personas.length-1){
                for(int j=0;j<pacientes.size();j++){
                    System.out.printf("%3d" + "%5td-%tm-%tY" + "%3s" + "%7.1f" + "%5.1f\n", pacientes.get(j).getId()
                            , pacientes.get(j).getFechaDeNacimiento(), pacientes.get(j).getFechaDeNacimiento()
                            , pacientes.get(j).getFechaDeNacimiento(), pacientes.get(j).getSexo()
                            , pacientes.get(j).getPeso(), pacientes.get(j).getAltura());
                }
            }
        }
        int[] edades=menorMayor();
        System.out.print("PACIENTE MAYOR Edad: "+edades[0]+" Sexo: M\n"+"PACIENTE MAYOR Edad: "+edades[1]+" Sexo: F\n");
        int[] sexos=pacientesPorSexo();
        System.out.print("Cantidad de pacientes por sexo:\nHombres: "+sexos[0]+"\tMujeres: "+sexos[1]+"\n");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.printf("Paciente número:"+"%2d"+":"+"%2s",i,representarIMC(i));
        }

    }
    private static int[] menorMayor() {
        int mayorEdad=0;
        int menorEdad=200;
        for(int i=0;i<pacientes.size()-1;i++){
            if(calcularEdad(pacientes.get(i).getFechaDeNacimiento())>mayorEdad){
                mayorEdad=calcularEdad(pacientes.get(i).getFechaDeNacimiento());
            }else if(calcularEdad(pacientes.get(i).getFechaDeNacimiento())<menorEdad){
                menorEdad=calcularEdad(pacientes.get(i).getFechaDeNacimiento());
            }
        }
        return new int[]{mayorEdad,menorEdad};
    }
    private static int[] pacientesPorSexo() {
        int m=0;
        int f=0;
        for(int i=0;i<pacientes.size()-1;i++){
            if(Character.toString(pacientes.get(i).getSexo()).equalsIgnoreCase("m")){
                m++;
            }else{
                f++;
            }
        }
        return new int[]{m,f};
    }
    private static double cacularIMC(int index) {
        return pacientes.get(index).getPeso()/(pacientes.get(index).getAltura()*pacientes.get(index).getAltura());
    }
    private static String representarIMC(int i) {
        double imc=cacularIMC(i);
        if(imc<18.5){
            return ("Peso insuficiente\n");
        }else if(imc>=18.5&&imc<=24.9){
            return ("Peso normal\n");
        }else if(imc>=25&&imc<=26.9){
            return ("Sobrepeso grado I\n");
        }else if(imc>=27&&imc<29.9){
            return ("Sobrepeso grado II\n");
        }else{
            return ("Sobrepeso grado III\n");
        }
    }
    private static int calcularEdad(LocalDate fechaN) {
        int edad;
        LocalDate hoy = LocalDate.now();
        edad = (hoy.getYear() - fechaN.getYear());
        if (fechaN.getMonthValue() > hoy.getMonthValue()) {
            edad -= 1;
        }else if(fechaN.getMonthValue()== hoy.getMonthValue()&&fechaN.getDayOfMonth()<hoy.getDayOfMonth()){
            edad -= 1;
        }
        if (edad <= 0) {
            menorDeUnAnyo = true;
            if (hoy.getMonthValue() > fechaN.getMonthValue()) {
                edad = hoy.getMonthValue() - fechaN.getMonthValue();
                if (hoy.getDayOfMonth() < fechaN.getDayOfMonth()) {
                    edad -= 1;
                }
            } else {
                edad = hoy.getMonthValue() + 12 - fechaN.getMonthValue();
                if (fechaN.getDayOfMonth() < hoy.getDayOfMonth()) {
                    edad -= 1;
                }
            }
        }
        if (menorDeUnAnyo) {
            return edad;
        } else {
            return edad;
        }
    }
    public static String comprobarNombre(String nombre) {
        do {
            System.out.print(nombre + " es correcto Si/No?\nRespuesta: ");
            respuesta = lector.nextLine();
            if (comprobarRespuesta(respuesta).equalsIgnoreCase("No")) {
                System.out.print("Introduzca el nombre del nuevo paciente Ej(\"Eric Sospedra Salort\")\nNombre: ");
                nombre = lector.nextLine();
            }
        }
        while (!respuesta.equalsIgnoreCase("Si"));
        return nombre;
    }
    public static String comprobarRespuesta(String respuesta) {
        while (!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {
            System.out.print("Introduce Si o No\nRespuesta: ");
            respuesta = lector.nextLine();
        }
        return respuesta;
    }
}
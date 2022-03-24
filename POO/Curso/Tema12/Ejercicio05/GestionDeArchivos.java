package como.ericsospedra.Tema12.Ejercicio05;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GestionDeArchivos {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        String ruta;
        int opcion;
        File fichero;
        System.out.print("Introduce la ruta del archivo\nRuta: ");
        ruta=comprobarRuta(lector.nextLine());
        fichero=new File(ruta);
        System.out.print("""
                ***********************
                **GESTION DE ARCHIVOS**
                ***********************
                1.Crear Archivo.
                2.Listar Contenido del directorio
                3.Informacion de la ruta
                Opcion: \s""");
        opcion=Integer.parseInt(lector.nextLine());
        switch (opcion){
            case 1:
                System.out.print("Introduce el nombre del archivo\nNombre archivo: ");
                if(crearArchivo(fichero.getAbsolutePath(),lector.nextLine())){
                    System.out.println("Creado con exito");
                }else{
                    System.out.println("Fallo al crear el archivo");
                }
            break;
            case 2:
                listarDirectorio(ruta);
            break;
            case 3:
                System.out.print("Introduce el nombre del archivo\nNombre archivo: ");
                verInfo(fichero.getAbsolutePath(),lector.nextLine());
            break;
        }

    }
    public static String comprobarRuta(String ruta){
        File comprobante=new File(ruta);
        String respuesta;
        if(comprobante.exists()){
            if(comprobante.isDirectory()){
                System.out.println("La ruta es correcta");
                return ruta;
            }else{
                System.out.print("La ruta es correcta, pero ten encuenta que es una "
                        +"archivo, no podras gestionar nuevas carpetas"+
                        " deseas cambiar la ruta\nSi/No: ");
                respuesta=lector.nextLine();
                while(!respuesta.equalsIgnoreCase("Si")&&!respuesta.equalsIgnoreCase("No")) {
                    System.out.print("Introduce Si o No\nRespuesta: ");
                    respuesta= lector.nextLine();
                }
                if(respuesta.equalsIgnoreCase("Si")){
                    System.out.print("Introduce la nueva ruta\nNueva Ruta: ");
                    return lector.nextLine();
                }else{
                    return ruta;
                }
            }
        }else{
            return null;
        }
    }
    public static boolean crearArchivo(String directorio,String archivo){
        for(int i=0;i<archivo.length();i++){
            if(archivo.charAt(i)==' '||archivo.charAt(i)=='/'||archivo.charAt(i)=='\\'){
                return false;
            }
        }
        File fichero=new File(directorio,archivo);
        if(fichero.exists()){
            return false;
        }
        try {
            return fichero.createNewFile();
        }catch (IOException ex){
            return false;
        }
    }
    public static void listarDirectorio(String directorio){
        File fichero=new File(directorio);
        String[] contenido= fichero.list();
        for(int i =0;i< contenido.length;i++) {
            System.out.printf("%-25s" + "%-5s" + "%-10d" + "%-10s"+"%-1s\n",contenido[i]
                    ,comprobarSiEsArchivo(new File(directorio,contenido[i]))
                    ,new File(directorio,contenido[i]).length()
                    ,"bytes",comprobarPermisos(new File(directorio,contenido[i])));
        }
    }
    public static char comprobarSiEsArchivo(File fichero){
        if(fichero.isDirectory()){
            return 'd';
        }else{
            return 'f';
        }
    }
    public static String comprobarPermisos(File fichero){
        StringBuilder permisos=new StringBuilder();
        if(fichero.canRead()){
            permisos.insert(permisos.length(),"r");
        }else{
            permisos.insert(permisos.length(),"-");
        }
        if(fichero.canWrite()){
            permisos.insert(permisos.length(),"w");
        }else{
            permisos.insert(permisos.length(),"-");
        }
        if(fichero.canExecute()){
            permisos.insert(permisos.length(),"x");
        }else{
            permisos.insert(permisos.length(),"-");
        }
        return permisos.toString();
    }
    public static void verInfo(String directorio,String archivo){
        File fichero=new File(directorio,archivo);
        System.out.printf("%-10s" + "%-65s" + "%-5s" + "%-15s"+"%-1s\n",fichero.getName()
                ,fichero.getAbsolutePath(),comprobarPermisos(fichero),fichero.length()+" bytes"
                ,comprobarSiEsArchivo(fichero));
    }
}

package como.ericsospedra.Tema10.Ejercicio11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GestionAlumnos {
    static Scanner lector=new Scanner(System.in);
    static HashMap<Student, HashMap<Group,ArrayList<Subject>>>students=new HashMap<>();
    static HashMap<Teacher,ArrayList<Subject>>teachers=new HashMap<>();
    static HashMap<Group,ClassRoom>groups=new HashMap<>();
    static int option,modifyOption;
    static boolean control;
    static String checkSubject;
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        do {
            do {
                try {
                    control=false;
                    System.out.print(
                        """
                        *********************
                        * GESTIÓN EMPLEADOS *
                        *********************
                         1. Alta de alumno.
                         2. Alta de profesor.
                         3. Alta de asignatura.
                         4. Alta de grupo.
                         5. Alta de clase.
                         6. Modificación de alumno.
                         7. Modificación de profesor.
                         8. Modificación de asignatura.
                         9. Modificación de grupo.
                        10. Modificación de clase.
                        11. Borrar alumno.
                        12. Borrar profesor.
                        13. Borrar asignatura.
                        14. Borrar grupo.
                        15. Borrar clase.
                        16. Consultas.
                        ---------------------
                        0. Salir
                        Opcion:\s""");
                    switch (option){
                        case 1:
                            addStudent();
                        break;
                        case 2:
                            addTeacher();
                        break;
                        case 3:
                            addSubject();
                        break;
                        case 4:
                            addGroup();
                        break;
                        case 5:
                            addClassroom();
                        break;
                        case 6:
                            modifyStudent();
                        break;
                        case 7:
                            modifyTeacher();
                        break;
                        case 8:
                            modifySubject();
                        break;
                        case 9:
                            //modifyGroup();
                        break;
                        case 10:
                            //modifyClassroom();
                        break;
                        case 11:
                            //removeStudent();
                        break;
                        case 12:
                            //removeTeacher();
                        break;
                        case 13:
                            //removeSubject();
                        break;
                        case 14:
                            //removeGroup();
                        break;
                        case 15:
                            //removeClassroom();
                        break;
                        case 16:
                            //query();
                        break;
                        default:
                            while (option < 0 || option > 16) {
                                System.out.print("Introduce una opcion valida, entre 0 y 6\nOpcion: ");
                                option = Integer.parseInt(lector.nextLine());
                            }
                        break;
                    }
                } catch (NumberFormatException NFex) {
                    System.out.println("No has introducido una opcion");
                    System.out.println("Presione enter para continuar...");
                    lector.nextLine();
                    control=true;
                }
            }while (control);
        }while(option!=0);
    }
    public static void addStudent(){
        if(!teachers.isEmpty()){
            if(!groups.isEmpty()) {
                String name, surName, group;
                System.out.print("Introduce el nombre del alumno\nNombre: ");
                name = lector.nextLine();
                System.out.print("Introduce los apellidos del alumno\nApellidos: ");
                surName = lector.nextLine();
                System.out.print("Introduce las asignaturas a las que quieres matricular al alumno" +
                        "Ej.(Matemáticas,Castellano ...)" + "\nAsignaturas: ");
                showSubjects();
                String[] wildCard = lector.nextLine().split(",");
                if (checkSubjects(wildCard)) {
                    System.out.println("La/las asignatura/asignaturas " + checkSubject + " no existe/existen");
                }
                System.out.print("Introduce el grupo al que pertenece el alumno\nGrupo: ");
                showGroups();
                group = lector.nextLine();
                if (!checkGroup(group)) {
                    System.out.println("El grupo introducido no existe");
                }
                if(studentExist(name,surName,group,wildCard)){
                HashMap<Group,ArrayList<Subject>> courses = new HashMap<>();
                courses.put(insertGroup(group),insertSubjects(wildCard));
                students.put(new Student(name, surName), courses);
                }else{
                    System.out.println("El estudiante ya existe");
                }
            }
        }
    }
    public static void addTeacher(){
        String name,surName,dni;
        float salary;
        System.out.print("Introduce el DNI del profesor\nDNI: ");
        dni= lector.nextLine();
        if (validateDni(dni,dni.charAt(dni.length()-1))) {
            if (!teacherExist(dni)) {
                System.out.print("Introduce el nombre del profesor\nNombre: ");
                name = lector.nextLine();
                System.out.print("Introduce los apellidos del profesor\nApellidos: ");
                surName = lector.nextLine();
                System.out.print("Introduce lel sueldo del profesor\nSueldo: ");
                salary = Float.parseFloat(lector.nextLine());
                System.out.print("¿Desea introducir las asignaturas que impartira?\nSi/No: ");
                if (lector.nextLine().equalsIgnoreCase("No")) {
                    teachers.put(new Teacher(dni, name, surName, salary), null);
                } else {
                    showSubjects();
                    System.out.print("Introduce las asignaturas que quieres que imparta el profresor" +
                            "Ej.(Matemáticas,Castellano ...)" + "\nAsignaturas: ");
                    showSubjects();
                    String[] wildCard = lector.nextLine().split(",");
                    if (checkSubjects(wildCard)) {
                        System.out.println("La/las asignatura/asignaturas " + checkSubject + " no existe/existen");
                    }
                    teachers.put(new Teacher(dni, name, surName, salary), insertSubjects(wildCard));
                }
            } else {
                System.out.println("Este profesor ya existe");
            }
        }else {
            System.out.println("El DNI introducido no es valido");
        }
    }
    public static void addSubject(){
        int id,counter;
        String name,dni;
        ArrayList<Subject> subjects=new ArrayList<>();
        System.out.print("Introduce el numero de asignatura que desea introducir\nNumero de asignaturas: ");
        counter=Integer.parseInt(lector.nextLine());
        do {
            System.out.print("Introduce el numero de identificación de la asignatura\nNumero de identificación: ");
            id = Integer.parseInt(lector.nextLine());
            if (!subjectExist(id)) {
                System.out.print("Introduce el nombre de la asignatura\nNombre: ");
                name = lector.nextLine();
                System.out.print("Introduce el DNI del profesor que impartira esta asignatura\nDNI: ");
                dni = lector.nextLine();
                validateDni(dni, dni.charAt(dni.length() - 1));
                subjects.add(new Subject(id,name));
                if(subjects.size()-1==counter){
                    teachers.replace(searchTeacher(dni),subjects);
                }
            } else {
                System.out.println("Esta asignatura ya existe");
            }
        }while (subjects.size()<counter);
    }
    public static void addGroup(){
        int id,idClass;
        String name;
        System.out.print("Introduce el numero de identificación del grupo\nNumero de identificación: ");
        id=Integer.parseInt(lector.nextLine());
        if(!groupExist(id)){
            System.out.print("Introduce el nombre del grupo\nNombre: ");
            name= lector.nextLine();
            System.out.print("¿Desea introducir el aula del grupo?\nSi/No: ");
            if(lector.nextLine().equalsIgnoreCase("No")) {
                groups.put(new Group(id, name), null);
            }else{
                System.out.print("Introduce el numero del aula\nNumero: ");
                idClass=Integer.parseInt(lector.nextLine());
                groups.put(new Group(id, name),insertClassroom(idClass));
            }
        }else{
            System.out.println("El grupo ya existe");
        }
    }
    public static void addClassroom(){
        int id;
        float squareMeter;
        System.out.print("Introduce el numero de identificación del grupo\nNumero de identificación: ");
        id=Integer.parseInt(lector.nextLine());
        if(!classroomExist(id)){
            System.out.print("Introduce los m\u33A1 del aula\nm\u33A1: ");
            squareMeter=Float.parseFloat(lector.nextLine());
            System.out.print("¿A que grupo pertenece el aula\nNumero de grupo: ");
            groups.replace(searchGroup(Integer.parseInt(lector.nextLine())),new ClassRoom(id,squareMeter));
        }else {
            System.out.println("La clase ya existe");
        }
    }
    public static void modifyStudent(){
        System.out.print(
            """
            ********************
            *  GESTION ALUMNO  *
            ********************
             1. Modificar nombre.
             2. Modificar apellidos.
             3. Modificar grupo.
            ---------------------
            0. Salir
            Opcion:\s""");
        modifyOption=Integer.parseInt(lector.nextLine());
        switch (modifyOption){
            case 1:
                for(Map.Entry<Student,HashMap<Group,ArrayList<Subject>>>entry:students.entrySet()){
                    if(entry.getKey().getName().equalsIgnoreCase(searchStudent().getName())){
                        System.out.print("¿Que nombre desea introducir?\nNombre: ");
                        entry.getKey().setName(lector.nextLine());
                    }
                }
            break;
            case 2:
                for(Map.Entry<Student,HashMap<Group,ArrayList<Subject>>>entry:students.entrySet()){
                    if(entry.getKey().getSurName().equalsIgnoreCase(searchStudent().getSurName())){
                        System.out.print("¿Que apellidos desea introducir?\nApellidos: ");
                        entry.getKey().setSurName(lector.nextLine());
                    }
                }
            break;
            case 3:
                for(Map.Entry<Student,HashMap<Group,ArrayList<Subject>>>entry:students.entrySet()){
                    if(entry.getKey().getName().equalsIgnoreCase(searchStudent().getName())){
                        for(Map.Entry<Group,ArrayList<Subject>>entry1:entry.getValue().entrySet()){
                            System.out.print("Introduce el grupo al cual quieres cambiar al alumno\nGrupo: ");
                            HashMap<Group,ArrayList<Subject>>wildCard=new HashMap<>();
                            wildCard.put(new Group(entry1.getKey().getId(), lector.nextLine()),entry1.getValue());
                            students.replace(entry.getKey(),wildCard);
                        }
                    }
                }
            break;
            default:
                while(modifyOption<0||modifyOption>3){
                    System.out.print("Introduce una opcion valida, entre 0 y 3\nOpcion: ");
                    modifyOption=Integer.parseInt(lector.nextLine());
                }
            break;
        }
    }
    public static void modifyTeacher(){
        String dni;
        System.out.print("Introduce el Dni del profesor a modificar\nDNI: ");
        dni=lector.nextLine();
        System.out.print(
            """
            ********************
            * GESTION PROFESOR *
            ********************
             1. Modificar nombre.
             2. Modificar apellidos.
             3. Modificar grupo.
             4. Modificar salario.
            ---------------------
            0. Salir
            Opcion:\s""");
        modifyOption=Integer.parseInt(lector.nextLine());
        switch (modifyOption){
            case 1:
                for(Map.Entry<Teacher,ArrayList<Subject>>entry: teachers.entrySet()){
                    if(entry.getKey().getDni().equalsIgnoreCase(dni)){
                        System.out.print("Introduce el nombre a modificar del profesor\nNombre: ");
                        entry.getKey().setName(lector.nextLine());
                    }
                }
                break;
            case 2:
                for(Map.Entry<Teacher,ArrayList<Subject>>entry: teachers.entrySet()){
                    if(entry.getKey().getDni().equalsIgnoreCase(dni)){
                        System.out.print("Introduce los apellidos a modificar del profesor\n ");
                        entry.getKey().setSurName(lector.nextLine());
                    }
                }
                break;
            case 3:
                for(Map.Entry<Teacher,ArrayList<Subject>>entry: teachers.entrySet()){
                    if(entry.getKey().getDni().equalsIgnoreCase(dni)){
                        System.out.print("Introduce el nombre a modificar del profesor\nNombre: ");

                    }
                }
                break;
            default:
                while(modifyOption<0||modifyOption>3){
                    System.out.print("Introduce una opcion valida, entre 0 y 3\nOpcion: ");
                    modifyOption=Integer.parseInt(lector.nextLine());
                }
                break;
        }
    }
    public static void modifySubject(){
        int counter=0;
        System.out.print("""
            **********************
            * GESTION ASIGNATURA *
            **********************
             1. Modificar id.
             2. Modificar nombre.
            ---------------------
            0. Salir
            Opcion:\s""");
        modifyOption=Integer.parseInt(lector.nextLine());
        /*switch (modifyOption) {
            case 1:
                System.out.print("Introduce el numero de identificacón de la asignatura");
                for(Map.Entry<Student,HashMap<Group,ArrayList<Subject>>>entry:students.entrySet()){
                    for(Map.Entry<Group,ArrayList<Subject>>entry1:entry.getValue().entrySet()){

                        if(entry1.getValue().get(counter).getId()==id){

                        }
                    }
                }
                for (Map.Entry<Teacher,ArrayList<Subject>> entry : students.entrySet()) {
                    if (entry.getKey().getName().equalsIgnoreCase(searchStudent().getName())) {
                        System.out.print("¿Que nombre desea introducir?\nNombre: ");
                        entry.getKey().setName(lector.nextLine());
                    }
                }
                break;
            case 2:
                for (Map.Entry<Student, HashMap<Group, ArrayList<Subject>>> entry : students.entrySet()) {
                    if (entry.getKey().getSurName().equalsIgnoreCase(searchStudent().getSurName())) {
                        System.out.print("¿Que apellidos desea introducir?\nApellidos: ");
                        entry.getKey().setSurName(lector.nextLine());
                    }
                }
                break;
            default:
                while(modifyOption<0||modifyOption>3){
                    System.out.print("Introduce una opcion valida, entre 0 y 3\nOpcion: ");
                    modifyOption=Integer.parseInt(lector.nextLine());
                }
                break;
        }*/
    }
    public static ArrayList<Subject> insertSubjects(String[] subjects) {
        return null;
    }
    public static Group insertGroup(String group){
        return null;
    }
    public static ClassRoom insertClassroom(int id){
        return null;
    }
    public static void showSubjects(){
    }
    public static void showGroups(){
    }
    public static boolean checkSubjects(String[] subjects){
        return true;
    }
    public static boolean checkGroup(String group){
        return false;
    }
    public static boolean studentExist(String name,String surName,String group,String[] subjects){
        return false;
    }
    public static boolean teacherExist(String dni){
        return false;
    }public static boolean subjectExist(int id){
        return false;
    }
    public static boolean groupExist(int id){
        return false;
    }
    public static boolean classroomExist(int id){
        return false;
    }
    public static Student searchStudent(){
        int id;
        String name,group;
        System.out.print("Introduce el nombre del alumno\nNombre: ");
        name= lector.nextLine();
        System.out.print("Introduce el nombre del grupo del alumno\nGrupo: ");
        group= lector.nextLine();
        for(Map.Entry<Student,HashMap<Group,ArrayList<Subject>>>entry:students.entrySet()){
            for(Map.Entry<Group,ArrayList<Subject>>entry1:entry.getValue().entrySet()){
                if(entry.getKey().getName().equalsIgnoreCase(name)&&entry1.getKey().getName().equalsIgnoreCase(group)){
                    System.out.printf("%-5d"+"%-10s"+"%-10s"+"%-10s",entry.getKey().getId(),entry.getKey().getName(),entry.getKey().getSurName(),entry1.getKey().getName());
                }
            }
        }
        System.out.print("Introduce el numero de identificación del alumno que desseas modificar\nNumero de identificación");
        id=Integer.parseInt(lector.nextLine());
        for(Map.Entry<Student,HashMap<Group,ArrayList<Subject>>>studentEntry:students.entrySet()){
            if(studentEntry.getKey().getId()==id){
                return studentEntry.getKey();
            }
        }
        return null;
    }
    public static Teacher searchTeacher(String dni){
        for(Map.Entry<Teacher,ArrayList<Subject>>entry: teachers.entrySet()){
            if(entry.getKey().getDni().equalsIgnoreCase(dni)){
                return entry.getKey();
            }
        }
        return null;
    }
    public static Group searchGroup(int id){
        return null;
    }
    public static boolean validateDni (String dni,char letraDni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        StringBuilder shortDni = new StringBuilder();
        for (int i = 0; i < dni.length() - 1; i++) {
            int x = 0;
            for (int k = 0; k < dni.length(); k++) {
                if (dni.charAt(i) == letras[k]) {
                    x++;
                }
            }
            if (x == 0) {
                shortDni.insert(shortDni.length(), dni.charAt(i));
            } else {
                System.out.print("Dni invalido\n");
                System.out.println("Presione enter para continuar...");
                lector.nextLine();
            }
        }
        int numDni = Integer.parseInt(shortDni.toString()) % 23;
        return letraDni == letras[numDni];
    }
}
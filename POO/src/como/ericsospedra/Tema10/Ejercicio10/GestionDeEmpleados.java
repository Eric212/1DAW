package como.ericsospedra.Tema10.Ejercicio10;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;
public class GestionDeEmpleados {
    static Scanner lector = new Scanner(System.in);
    static HashMap<Employee, ArrayList<Son>> employees = new HashMap<>();
    static ArrayList<Son> sons = new ArrayList<>();
    static int option, queryOption;
    static String wildcard;
    static boolean control,mode;
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.print("En que modo desea ejecutar el programa\n1:Automatico\n2:Manual\nModo: ");
        mode=Integer.parseInt(lector.nextLine())==1;
        do {
            do {
                try {
                    control=false;
                    System.out.print(
                            """
                                    *********************
                                    * GESTIÓN EMPLEADOS *
                                    *********************
                                    1. Nuevo empleado
                                    2. Nuevo hijo
                                    3. Modificar sueldo
                                    4. Borrar empleado
                                    5. Borrar hijo
                                    6. Consultas
                                    ---------------------
                                    0. Salir
                                    Opcion:\s""");
                    option = Integer.parseInt(lector.nextLine());
                    switch (option) {
                        case 1:
                            addEmployee();
                            break;
                        case 2:
                            addSon();
                            break;
                        case 3:
                            modifySalary();
                            break;
                        case 4:
                            deleteEmployee();
                            break;
                        case 5:
                            deleteSon();
                            break;
                        case 6:
                            query();
                            break;
                        default:
                            while (option < 0 || option > 6) {
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
        }
        while (option != 0);
    }
    public static void addEmployee() {
        if (mode) {
            for(int i=0;i<(new Random().nextInt(20)+1);i++){
                DataAutomation automaticEmployee=new DataAutomation();
                employees.put(automaticEmployee.getEmployee(),automaticEmployee.getChildren());
            }
        } else {
            System.out.print("Introduce el DNI\nDNI: ");
            String dni = lector.nextLine();
            if (validateDni(dni, dni.charAt(dni.length() - 1))) {
                if (!isExist(dni)) {
                    do {
                        try {
                            control = false;
                            System.out.print("Introduce el nombre del empleado\nNombre: ");
                            String name = lector.nextLine();
                            System.out.print("Introduce los apellidos del empleado\nApellidos: ");
                            String surName = lector.nextLine();
                            System.out.print("Introduce la fecha de nacimiento del empleado, Ej.(dd mm yyyy)\nFecha de nacimiento: ");
                            int[] a = {lector.nextInt(), lector.nextInt(), lector.nextInt()};
                            lector.nextLine();
                            LocalDate birthday = LocalDate.of(a[2], a[1], a[0]);
                            System.out.print("Introduce el salario del empleado\nSalario: ");
                            float salary = Float.parseFloat(lector.nextLine());
                            System.out.print("¿El empleado tiene hijos?\nSi/No: ");
                            String answer = lector.nextLine().trim();
                            while (!answer.equalsIgnoreCase("Si") && !answer.equalsIgnoreCase("No")) {
                                System.out.print("Introduce una respuesta valida, Si o No\nSi/No");
                                answer = lector.nextLine();
                            }
                            if (answer.equalsIgnoreCase("Si")) {
                                wildcard = dni;
                                addSon();
                                employees.put(new Employee(dni, name, surName, birthday, salary), sons);
                                wildcard = " ";
                            } else {
                                employees.put(new Employee(dni, name, surName, birthday, salary), null);
                            }
                        } catch (NumberFormatException exNF) {
                            System.out.print("Error al introducir al introducir los datos\nPresione enter para continuar...");
                            lector.nextLine();
                            control = true;
                        } catch (DateTimeException exDT) {
                            System.out.print("Error al introducir la fecha\nPresione enter para continuar...");
                            lector.nextLine();
                            control = true;
                        }
                    } while (control);
                }
            } else {
                System.out.println("El Dni no es valido");
                System.out.println("Presione enter para continuar...");
                lector.nextLine();
            }
        }
    }
    public static ArrayList<Son> addSon() {
        System.out.print("¿Cuantos hijos quieres agregar?\nNumero de hijos: ");
        int numberOfSons = Integer.parseInt(lector.nextLine());
        do {
            try {
                if (!wildcard.equalsIgnoreCase(" ")) {
                    System.out.print("Introduce el nombre del hijo\nNombre: ");
                    String name = lector.nextLine();
                    System.out.print("Introduce la edad del hijo\nEdad: ");
                    int age = Integer.parseInt(lector.nextLine());
                    sons.add(new Son(age, name));
                } else {
                    System.out.print("Introduce el DNI del padre\nDni: ");
                    String dni = lector.nextLine();
                    if (isExist(dni)) {
                        System.out.print("Introduce el nombre del hijo\nNombre: ");
                        String name = lector.nextLine();
                        System.out.print("Introduce la edad del hijo\nEdad: ");
                        int age = Integer.parseInt(lector.nextLine());
                        sons.add(new Son(age, name));
                    }
                }
            } catch (StringIndexOutOfBoundsException SIOOex) {
                System.out.print("Error");
                lector.nextLine();
            }
        }
        while (sons.size() < numberOfSons);
        return sons;
    }

    public static void modifySalary() {
        if (!employees.isEmpty()) {
            System.out.print("Introduce el DNI\nDNI: ");
            String dni = lector.nextLine();
            do {
                try {
                    control = false;
                    if (isExist(dni)) {
                        System.out.print("Introduce el nuevo importe del salario\nSalario: ");
                        float salary = Float.parseFloat(lector.nextLine());
                        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
                            if (dni.equalsIgnoreCase(entry.getKey().getDni())) {
                                entry.getKey().setSalary(salary);
                            }
                        }
                    } else {
                        System.out.println("El Dni no existe");
                    }
                } catch (NumberFormatException NFex) {
                    System.out.print("Error al introducir al introducir los datos\nPresione enter para continuar...");
                    lector.nextLine();
                    control = true;
                }
            } while (control);
        } else {
            System.out.println("No hay empleados");
            System.out.println("Presione enter para continuar...");
            lector.nextLine();
        }
    }

    public static void deleteEmployee() {
        if (!employees.isEmpty()) {
            System.out.print("Introduce el dni del empleado a borrar\nDni: ");
            String dni = lector.nextLine();
            if (isExist(dni)) {
                for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
                    if (dni.equalsIgnoreCase(entry.getKey().getDni())) {
                        employees.remove(entry.getKey(), entry.getValue());
                    }
                }
            }
        } else {
            System.out.println("No hay empleados");
            System.out.println("Presione enter para continuar...");
            lector.nextLine();
        }
    }

    public static void deleteSon() {
        if (!employees.isEmpty()) {
            System.out.print("Introduce el dni del padre\nDni: ");
            String dni = lector.nextLine();
            if (isExist(dni)) {
                for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
                    if (dni.equalsIgnoreCase(entry.getKey().getDni())) {
                        if (entry.getValue() != null) {
                            System.out.print("Introduce el nombre del hijo\nNombre del hijo: ");
                            String sonName = lector.nextLine();
                            if (!entry.getValue().isEmpty()) {
                                for (int i = 0; i < entry.getValue().size() - 1; i++) {
                                    if (entry.getValue().get(i).getNombre().equalsIgnoreCase(sonName)) {
                                        entry.getValue().remove(i);
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("No hay empleados");
                            System.out.println("Presione enter para continuar...");
                            lector.nextLine();
                        }
                    }
                }
            }
        }
    }
    public static void query () {
        if (!employees.isEmpty()) {
            do {
                do {
                    try {
                        control = false;
                        System.out.print(
                                """
                                        ***********************
                                        * CONSULTAS EMPLEADOS *
                                        ***********************
                                        1. Buscar por NIF.
                                        2. Buscar por nombre.
                                        3. Buscar por rango de edad.
                                        4. Buscar por rango de sueldo.
                                        5. Buscar por hijos menores de edad.
                                        -----------------------------
                                        0. Volver al menú principal
                                        Opcion:\s""");
                        queryOption = Integer.parseInt(lector.nextLine());
                        switch (queryOption) {
                            case 1:
                                searchByDni();
                                break;
                            case 2:
                                searchByName();
                                break;
                            case 3:
                                searchByAgeRange();
                                break;
                            case 4:
                                searchBySalaryRange();
                                break;
                            case 5:
                                searchByYoungestChild();
                                break;
                            case 6:
                                showAllEmployees();
                                break;
                            default:
                                while (queryOption < 0 || queryOption > 5) {
                                    System.out.print("Introduce una opcion valida, entre 0 y 5\nOpcion: ");
                                    queryOption = Integer.parseInt(lector.nextLine());
                                }
                                break;
                        }
                    } catch (NumberFormatException NFex) {
                        control = true;
                        System.out.println("No has introducido una opcion");
                        System.out.println("Presione enter para continuar...");
                        lector.nextLine();
                    }
                }while (control);
            }
            while (queryOption != 0) ;
        }else{
            System.out.println("No hay empleados");
            System.out.println("Presione enter para continuar...");
            lector.nextLine();
        }
    }
    public static void searchByDni () {
        System.out.print("Introduce el DNI\nDNI: ");
        String dni = lector.nextLine();
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            if (entry.getKey().getDni().equalsIgnoreCase(dni)) {
                showInformation(entry.getKey());
            }
        }
        System.out.println("Presione enter para continuar...");
        lector.nextLine();
    }
    public static void searchByName () {
        System.out.print("Introduce el nombre o parte del nombre del empleado\nNombre: ");
        String name = lector.nextLine();
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            if (entry.getKey().getName().contains(name)) {
                showInformation(entry.getKey());
            }
        }
        System.out.println("Presione enter para continuar...");
        lector.nextLine();
    }
    public static void searchByAgeRange () {
        System.out.print("Introduce la edad mínima y máxima entre la que deseas buscar, Ej(20 50)\nEdad[min-max]: ");
        int min = lector.nextInt();
        int max = lector.nextInt();
        lector.nextLine();
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            if (checkAge(entry.getKey().getbirthday()) >= min || checkAge(entry.getKey().getbirthday()) <= max) {
                showInformation(entry.getKey());
            }
        }
        System.out.println("Presione enter para continuar...");
        lector.nextLine();
    }
    public static void searchBySalaryRange () {
        System.out.print("Introduce el sueldo mínimo y máximo entre la que deseas buscar, Ej(1000 1500)\nSueldo[min-max]: ");
        int min = lector.nextInt();
        int max = lector.nextInt();
        lector.nextLine();
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            if (entry.getKey().getSalary() >= min && entry.getKey().getSalary() <= max) {
                showInformation(entry.getKey());
            }
        }
        System.out.println("Presione enter para continuar...");
        lector.nextLine();
    }
    public static void searchByYoungestChild () {
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            for (int i = 0; i < entry.getValue().size() - 1; i++) {
                if (entry.getValue().get(i).getEdad() < 18) {
                    showInformation(entry.getKey());
                }
            }
        }
        System.out.println("Presione enter para continuar...");
        lector.nextLine();
    }
    public static boolean isExist (String dni){
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            if (entry.getKey().getDni().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return false;
    }
    public static boolean validateDni (String dni,char letraDni){
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
    public static int checkAge (LocalDate fechaN){
        int edad;
        LocalDate hoy = LocalDate.now();
        edad = (hoy.getYear() - fechaN.getYear() - 1);
        if (fechaN.getMonthValue() < hoy.getMonthValue()) {
            edad += 1;
        } else {
            if (fechaN.getMonthValue() == hoy.getMonthValue() && hoy.getDayOfMonth() == fechaN.getDayOfMonth()) {
                edad += 1;
            }
        }
        return edad;
    }
    public static void showInformation (Employee employee) {
        System.out.printf("%6s" + "%15s" + "%18s" + "%30s" + "%13s" + "%15s\n"+"%1s\n"
                + "%-15s" + "%-15s" + "%-20s" + "%-1td/%-1tm/%-20tY" + "%-16.2f"
                , "DNI", "Nombre", "Apellidos", "Fecha de Nacimiento"
                , "Sueldo", "Hijos"
                ,"-----------------------------------------------------------------------------------------------------------------------------"
                , employee.getDni(), employee.getName(), employee.getSurNames()
                , employee.getbirthday(), employee.getbirthday()
                , employee.getbirthday(), employee.getSalary());
        for (Map.Entry<Employee, ArrayList<Son>> entry : employees.entrySet()) {
            if(entry.getKey().getDni().equals(employee.getDni())) {
                for (int i = 0; i < entry.getValue().size() - 1; i++) {
                    System.out.printf("%-10s", entry.getValue().get(i).getNombre());
                }
            }
        }
        System.out.println();
        System.out.println();
    }
    public static void showAllEmployees(){
        for(Map.Entry<Employee,ArrayList<Son>>entry : employees.entrySet()){
            showInformation(entry.getKey());
        }
        System.out.println("Presione enter para continuar...");
        lector.nextLine();
    }
}
package como.ericsospedra.Tema10.Ejercicio10;
import java.time.LocalDate;
public class Employee {
    private String dni,name,surNames;
    private float salary;
    private LocalDate birthday;
    public Employee(String dni, String name, String surNames, LocalDate birthday,float salary) {
        this.dni = dni;
        this.name = name;
        this.surNames = surNames;
        this.birthday = birthday;
        this.salary=salary;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurNames() {
        return surNames;
    }
    public void setSurNames(String surNames) {
        this.surNames = surNames;
    }
    public LocalDate getbirthday() {
        return birthday;
    }
    public void setbirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}

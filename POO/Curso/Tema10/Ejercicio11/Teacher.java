package como.ericsospedra.Tema10.Ejercicio11;
public class Teacher {
    private String dni;
    private String name;
    private String surName;
    private float salary;
    public Teacher(String dni, String name, String surName, float salary) {
        this.dni = dni;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
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
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
}

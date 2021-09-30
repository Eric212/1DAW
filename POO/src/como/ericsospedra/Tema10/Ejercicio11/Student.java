package como.ericsospedra.Tema10.Ejercicio11;
public class Student {
    private int id=0;
    private String name;
    private String surName;
    Student(String name,String surName){
        this.id++;
        this.name=name;
        this.surName=surName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
}

package como.ericsospedra.Tema10.Ejercicio10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
public class DataAutomation {
    private Employee employee;
    private ArrayList<Son> children;
    DataAutomation(){
        this.employee=new Employee(new GeneratorDni().generateDni(),randomName()
                ,randomSurName(),randomBirthday(),randomSalary());
        this.children=randomSons();
    }
    public String randomName(){
        String[] names={"Eric","Mireia","Ainhoa","Miguel","Vicente","Angel"
                ,"Antonio","Ramon","Federico","Paloma","Monica"};
        return names[new Random().nextInt(names.length)];
    }
    public String randomSurName(){
        String[] surNames={"Sospedra","Salort","Saiz","Boyer","Lopez","Gonzalez","Padilla"
                ,"Cento","Roig","Matinez","Bru","Dandi","Frau","Setien","Cabot"};
        return surNames[new Random().nextInt(surNames.length)]+" "+surNames[new Random().nextInt(surNames.length)];
    }
    public LocalDate randomBirthday() {
        GregorianCalendar date = new GregorianCalendar();
        int year = randomBetween(1980, 2020);
        date.set(Calendar.YEAR, year);
        int dayOfYear = randomBetween(1, date.getActualMaximum(Calendar.DAY_OF_YEAR));
        date.set(Calendar.DAY_OF_YEAR, dayOfYear);
        return LocalDate.of(date.get(Calendar.YEAR), date.get(Calendar.MONTH)+1, date.get(Calendar.DAY_OF_MONTH));
    }
    public int randomBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
    public float randomSalary(){
        return new Random().nextFloat()*3000f;
    }
    public ArrayList<Son> randomSons(){
        ArrayList<Son> children=new ArrayList<>();
        for(int i=0;i<(new Random().nextInt(4)+1);i++){
            children.add(new Son(new Random().nextInt(26)+15,randomName()));
        }
        return children;
    }
    public Employee getEmployee() {
        return employee;
    }
    public ArrayList<Son> getChildren() {
        return children;
    }
}

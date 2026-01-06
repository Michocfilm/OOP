package packA;
import java.util.ArrayList;
public class Programmer extends Employee {
    private ArrayList<String> skills;

    public Programmer(String name, int experience, int salary){
        super(name, experience, salary);
        this.skills = new ArrayList<>();
    }
    public ArrayList<String> getSkill(){
        return this.skills;
    }

    @Override
    public void sayHi(){
        System.out.println("hi from " + getName());
    }

    public String coding(){return "I am coding";}

    public void addSkill(String skill){
        this.skills.add(skill);
    }
}
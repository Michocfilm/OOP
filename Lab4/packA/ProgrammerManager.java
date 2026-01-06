package packA;
public class ProgrammerManager extends Programmer implements ManagerRoles {
    public ProgrammerManager(String name,int experience,int salary){
        super(name,experience,salary);
    }
    @Override
    public void sayHi(){
        System.out.println("From sayHi, I know " + getSkill());
    }

    @Override
    public int evaluate(Programmer p){
        int old = p.getSalary();
        int increase = (int)(old * 0.15);
        int newSalary = old + increase;

        p.setSalary(newSalary);

        return newSalary;
    }

    @Override
    public String toString(){
        return "MangerProgrammer [name = " + name +", experience = "+ experience +", salary = " + salary +"]";
    }
}

package packA;
public class Salesperson extends Employee implements SalesRole {
    private int target;

    public Salesperson(String n, int exp, int sal, int assignedTarget){
        super(n, exp, sal);
        this.target = assignedTarget;
    }

    public void setTarget(int target){
        this.target = target;
    }

    public int getTarget(){
        return target;
    }

    //@Override
    public void setSalary(int increasedAmount){
        this.salary += increasedAmount;
    }

    public void setSalary(){
        this.salary = (int)(this.salary * 1.10);
    }

    @Override
    public String makeQuotation(){
        int rand = (int)(Math.random() * 1000);
        return "Dear value customer, " + rand + " is my best offer.";
    }
    @Override
    public void sayHi(){
        System.out.println(getName() +" a salesperson");
    }
}

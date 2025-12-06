package PackA;

public class Salesperson extends Programmer {
    private int target;

    public Salesperson(String n, int exp, int sal, int assignedTarget){
        super(n, exp, sal);
        this.target = assignedTarget;
    }

    public Salesperson(String n, int exp){
        super(n);
    }

    public void setTarget(int target){
        this.target = target;
    }

    public int getTarget(){
        return target;
    }

    @Override
    public void setSalary(int increasedAmount){
        this.salary = this.salary + increasedAmount;
    }

    public void setSalary(){
        this.salary = (int)(this.salary * 1.10);
    }

    public String makeQuotation(){
        int rand = (int)(Math.random() * 1000);
        return "Dear value customer, " + rand + " is my best offer.";
    }

    @Override
    public String toString(){
        return "Salesperson [target=" + target + " " + super.toString() + " ]";
    }
}
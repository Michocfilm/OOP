package PackA;

public class Programmer extends EmpTmp{
    public Programmer(String n, int exp, int sal){
        super(n, exp, sal);
    }

    public Programmer(String n){
        super(n);
    }

    public Programmer(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    public int getSalary(){
        return salary;
    }

    public void setExperience(int exp){
        this.experience = exp;
    }

    public int getExperience(){
        return experience;
    }

    public void sayHi(){
        System.out.printf("hi from %s\n",getName());
    }

    public String toString(){
        return "Programmer [name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
    }

    public String coding(){
        return "I am coding.";
    }    
}

package packA;
public abstract class Employee {
    protected String name;
    protected int experience;
    protected int salary;
    
    public Employee(String name,int experience,int salary){
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public abstract void sayHi();
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setSalary(int salary) {this.salary = salary;}
    public int getSalary() {return salary;}
}
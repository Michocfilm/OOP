package packA;

public class Accountant extends Employee {
    private static String companyName = "berk barn jamkad";
    private String specialty;
    
    public Accountant(String name,int experience, int salary, String talent){
        super(name,experience,salary);
        this.specialty = talent;
    }
    
    public void setAccountExperience(int exp){
        this.experience = exp;
    }

    public int getAccountExperience(){
        return this.experience;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    public static String tellMyRole(){
        return "I am an accountant at " + companyName;
    }

    public String tellProfit(){
        int profit = (int)(Math.random() * 1000);
        return companyName + "'s profit is " + profit + ". My salary is " + getSalary();
    }

    @Override
    public void sayHi(){
        System.out.println(getName() + ", an accountant, says hello");
    }
}

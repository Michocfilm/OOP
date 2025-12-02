package q1_MyGame.model;
public class Hero {
    //private
    private String name;
    private int health;

    public void introduce(){
        System.out.println("I am "+name+" with HP: "+health);
    }
    // Contructor
    public Hero(String name){
        this.name = name;
        this.health = 100; // default
    }
    // Getter
    public int getHealth(){
        return this.health;
    }
    //setter
    public void setHealth(int health){
        if(health < 0){
            System.out.println("Error: Health connot be negative. Setting to 0.");
            this.health = 0;
        }else if(health > 100){
            System.out.println("Error: Health cannot exceed 100. Setting to 100.");
            this.health = 100;
        }else{
            this.health = health;
        }
    }

    public String getName(){
        return name;
    }
}

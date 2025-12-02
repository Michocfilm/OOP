package q1_MyGame.app;
import q1_MyGame.model.Hero;
public class GameRunner{
    public static void main(String[] args){
        q2_1();
    }
    static void q1_1(){
        // Hero myHero = new Hero();
        // myHero.name = "Archer";
        // myHero.introduce();
        // myHero.health = 100;
        // myHero.introduce();
    }
    static void q2_1(){
        Hero myHero = new Hero("Mage");
        
        // Validation
        System.out.println("Testing negative health: ");
        myHero.setHealth(-50);
        System.out.println("Current HP: "+myHero.getHealth());

        System.out.println("\nTesting excessive health");
        myHero.setHealth(500);
        System.out.println("Current HP: "+myHero.getHealth());

    }
}
import packA.*;

public class Main1_1{
    static void q1(){
        Lec4Fish fish = new Lec4Fish();
        fish.swim();
        fish.fishMethod();

        Lec4Duck duck = new Lec4Duck();
        duck.swim();
        duck.duckMethod();
    }
    
    public static void main(String[] args){
        q1();
    }
}

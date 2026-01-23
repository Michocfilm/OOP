// package TTT;
import java.util.ArrayList;
import java.util.List;


public class T1 {
    public static void main(String[] args){
        // demo1();
        demo2();
        // demo3();
    }
    public static void demo1(){
        Animal a1 = new dog(); // upcast
        a1.makeSound();
        // a1.eat();
    }
    public static void demo2(){
        Animal a1 =new dog(); // upcast
        dog a2;
        a1.makeSound();
        if(a1 instanceof dog){
            a2=(dog)a1; // downcast
            a2.makeSound();
        }
    }
    public static void demo3(){
        Animal [] arr = {new dog(),new cat(),new cat(),new dog()};//upcast
        ArrayList<Animal> list = new ArrayList<>(List.of(arr));
        for(Animal a:list){
            a.makeSound();

        }
    }
}


class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
    public void eat(){
        System.out.println("eatt!");
    }
}

class dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("hong!");
    }
    public void touch(){
        System.out.println("Don't touch");
    }
}

class cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meo!");
    }
    public void touch(){
        System.out.println("can touch");
    }
}

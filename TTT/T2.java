public class T2 {
    public static void main(String[] args){
        demo1();
    }
    public static void demo1(){
        Animal a1=new dog();
        a1.sound();
    }
}


abstract class Animal{
    public void sound(){
        System.out.print("getClass()");
    };
    public abstract void eat();
}

class dog extends Animal {

    @Override 
    public void eat(){
        System.out.println("bone");
    }
}

class cat extends Animal{

    public void eat(){
        System.out.println("fish");
    }
}

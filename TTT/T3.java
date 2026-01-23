public class T3 {
    public static void main(String[] args){
        phone a1 =new smartphone();
        a1.call();
    }
}

interface phone{
    public void call();
}

class smartphone implements phone{
    public void call(){
        System.out.println("I can call");
    }
}
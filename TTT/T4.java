public class T4 {
    public static void main(String[] args){
        demo1("film");
    }
    public static void demo1(String a){
        hello h = (name) -> System.out.println("Hello "+name);
        h.sayhello(a);
    }
}

interface hello{
    void sayhello(String a);
}


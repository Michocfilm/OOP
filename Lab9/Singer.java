public class Singer {
    String name;
    Style style;

    public Singer(String n, Style s) {
        name = n;
        style = s;
    }

    public Singer(String n) {
        this(n, Style.POP);
    }

    public String getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style new_style) {
        style = new_style;
    }

    public void staticSayHi(String n) {
        System.out.println("Hi " + n);
    }

    public void shakeHand(String n) {
        System.out.println(name + " shakes hand with " + n + ".");
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }

    /* for deep copy */
    public Singer(Singer other) { // copy constructor
        this.name = other.name;
        this.style = other.style;
    }
}

enum Style {
    POP, ROCK
}
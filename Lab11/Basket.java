import java.util.ArrayList;

class Basket {
    private ArrayList<LineItem> item;

    public Basket() {
        item = new ArrayList<>();
    }

    public void putInBasket(LineItem line) {
        item.add(line);
    }

    public void showItemInBasket() {
        System.out.println("This basket contains");
        loopLineItem("SHOW");
    }

    public void printInvoice() {
        System.out.println("Invoice header");
        loopLineItem("CAL");
    }

    public void loopLineItem(String sec) {
        int total = 0;
        for (LineItem item : item) {
            String name = item.getProduct().getpName();
            int qty = item.getquantity();
            int price = item.getPrice();
            int amount = item.calculateAmount();

            if (sec == "SHOW") {
                System.out.println(qty + " of " + name + " @ " + price);
            } else if (sec == "CAL") {
                System.out.println(name + " x " + qty + " " + amount);
                total += amount;
            }
        }
        if (sec == "CAL") {
            System.out.println("Total is: " + total);
        }
    }
}
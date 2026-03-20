import java.util.ArrayList;

class Shop {
    private String name;
    private Catalog catalog;
    private ArrayList<Basket> ordersToday;

    public Shop(String n) {
        name = n;
        catalog = new Catalog();
        ordersToday = new ArrayList<>();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungray"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);

        System.out.println("Shop " + name + " has been created.");
        System.out.println("Welcome To " + name);
        catalog.showCatalog();
    }

    public Product getProduct(String pName) {
        return catalog.retrieveProduct(pName);
    }

    public int getPrice(String pName) {
        return catalog.retrievePrice(pName);
    }

    public Basket newCustomerArrives() {
        return new Basket();
    }

    public void checkOut(Basket b) {
        System.out.println("I am cashier");
        b.printInvoice();
        ordersToday.add(b);
    }

    public void checkOut(Basket b, String pName) {
        System.out.println("Quickly put it in his shopping bag");
        Product p = getProduct(pName);
        int price = getPrice(pName);
        int quantity = 1;
        b.putInBasket(new LineItem(p, quantity, price));
        b.printInvoice();
        System.out.println("leave the store");
        ordersToday.add(b);
    }
}
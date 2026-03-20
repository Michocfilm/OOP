public class Main {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        demo4();
    }

    static void demo1() {
        Catalog catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("latasoy", "less hungray"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        catalog.add(new Noodles("mama", "duplicate"), 9);

        catalog.showCatalog();
    }

    static void demo2() {
        Catalog catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungray"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);

        String pName;
        int quantity;
        Basket b = new Basket();
        pName = "mama";
        quantity = 1;
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), quantity, catalog.retrievePrice(pName)));
        pName = "lactasoy";
        quantity = 2;
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), quantity, catalog.retrievePrice(pName)));
        b.showItemInBasket();
        b.printInvoice();
    }

    static void demo3() {
        Shop csShop = new Shop("CS");
        System.out.println("ans: " + csShop.getProduct("mama"));
        System.out.println("It price is: " + csShop.getPrice("mama"));

        Basket b1 = csShop.newCustomerArrives();
        String picked;
        int quantity;
        picked = "mama";
        quantity = 1;
        b1.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        picked = "lactasoy";
        quantity = 2;
        b1.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        b1.showItemInBasket();
        csShop.checkOut(b1);

        Basket b2 = csShop.newCustomerArrives();
        picked = "mix veggies";
        quantity = 3;
        b2.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        picked = "korean";
        quantity = 4;
        b2.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        b2.showItemInBasket();
        csShop.checkOut(b2);
    }

    static void demo4() {
        Shop csShop = new Shop("CS");
        Basket b1 = csShop.newCustomerArrives();
        String picked = "mama";
        csShop.checkOut(b1, picked);
    }
}
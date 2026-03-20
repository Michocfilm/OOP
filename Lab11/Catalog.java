import java.util.HashMap;
import java.util.Map;

class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public void add(Product item, int p) { // เช็คว่าซ้ำมั้ย
        String name = item.getpName();
        if (!productList.containsKey(name)) {
            productList.put(name, item);
            priceList.put(name, p);
        }
    }

    public Product retrieveProduct(String pName) {
        return productList.get(pName);
    }

    public int retrievePrice(String pName) {
        return priceList.getOrDefault(pName, 0);
    }

    public void showCatalog() {
        for (String key : productList.keySet()) {
            System.out.println(key + " @ " + retrievePrice(key));
        }
    }
}
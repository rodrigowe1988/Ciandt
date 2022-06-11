import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

    public static void main(String[] args) {

        Map<Product, Double> cookies = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1400.0);
        Product p3 = new Product("Tablet", 299.0);

        cookies.put(p1, 10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));
        System.out.println(p2.getValue());
        System.out.println(cookies.values());

    }
}

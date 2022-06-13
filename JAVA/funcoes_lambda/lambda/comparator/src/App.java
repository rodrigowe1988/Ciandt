import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Hard Disk", 99.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        System.out.println("Imprimindo o getName e o getValue");
        for (Product prod: list) {
            System.out.println(prod.getName()+ " " + prod.getValue());
        }

        System.out.println("Imprimindo usando o método toString da classe Product");
        for (Product prod: list) {
            System.out.println(prod);
        }
    }
}

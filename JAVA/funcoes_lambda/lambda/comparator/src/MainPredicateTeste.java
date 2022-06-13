import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicateTeste {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Hard Disk", 99.00));

		double min = 1000.00;

		Predicate<Product> pred = p -> p.getValue() >= min;

		list.removeIf(pred);

		for (Product p: list) {
			System.out.println(p);
		}

	}
}

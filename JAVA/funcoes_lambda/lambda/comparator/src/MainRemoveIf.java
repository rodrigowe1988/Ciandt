import java.util.ArrayList;
import java.util.List;

public class MainRemoveIf {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 49.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Hard Disk", 99.00));

		list.removeIf(p -> p.getValue() >= 100);

		System.out.println(list);
	}
}

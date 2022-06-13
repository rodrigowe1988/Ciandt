import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getValue() >= 100.00;
	}

}

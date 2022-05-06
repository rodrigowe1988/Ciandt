package product;

public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product("notebook", 4000.00, 3);

        product1.addProducts(1);
        product1.removeProducts(3);

        System.out.println(product1);
    }
}

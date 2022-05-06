package product;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalValueInStock();
    }
    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
        info();
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
        info();
    }

    public void info() {
        System.out.printf("Product name: %s.\n" +
                "Product price: $%.2f.\n" +
                "Product quantity: %d.\n" +
                "Product totalValueInStock: $%.2f.\n", this.name, this.price, this.quantity, totalValueInStock());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", total value in stock=" + totalValueInStock() +
                '}';
    }
}

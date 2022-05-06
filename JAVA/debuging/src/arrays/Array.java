package arrays;

public class Array {
    public String name;
    public double price;

    public Array(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Array{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

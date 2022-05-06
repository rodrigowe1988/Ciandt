package triangle;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle x = new Triangle(5, 6, 7);
        Triangle y = new Triangle(3, 2, 4);

        System.out.printf("%.2f\n" , x.area());
        System.out.printf("%.2f\n" , y.area());

    }
}

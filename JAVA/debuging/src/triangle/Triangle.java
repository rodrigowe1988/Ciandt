package triangle;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a + b + c);
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}

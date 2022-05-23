package entities;

import entities.enums.Color;

public class Circle extends Shape {

   private Double radius;
   public final double PI = 3.14;

    public Circle(Double radius, Color color) {
       this.radius = radius;
        setColor(color);
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI + " " + super.getColor() +
                '}';
    }
}

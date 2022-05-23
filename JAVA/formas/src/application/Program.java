package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();

        Circle circle = new Circle(3.0, Color.BLACK);
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle(4.0, 5.0, Color.RED);
        System.out.println(rectangle.area());

        list.add(circle);
        list.add(rectangle);

        System.out.println(list);
    }
}

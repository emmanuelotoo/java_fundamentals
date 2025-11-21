package dev.emmanuelotoo.abstraction;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3.0, 4.0);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}

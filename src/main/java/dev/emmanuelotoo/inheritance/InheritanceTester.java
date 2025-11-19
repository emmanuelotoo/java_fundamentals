package dev.emmanuelotoo.inheritance;

import dev.emmanuelotoo.objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
//        Square square = new Square();
//        square.setSides(2);
//        square.setLength(4);
//
//        System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Emma");

    }
}

package dev.emmanuelotoo.inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
        Square square = new Square();
        square.setSides(2);
        square.setLength(4);

        System.out.println(square.calculatePerimeter());

    }
}

package dev.emmanuelotoo.data_structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
        listDemo();
    }
    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.remove("lemon");
        System.out.println(fruits);

        System.out.println("contains apple? " + fruits.contains("apple"));

        System.out.println("size: " + fruits.size());

        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);

    }
    public static void listDemo() {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("pear");

        fruits.set(1, "grape");
        fruits.add("lemon");
        fruits.remove("pear"); // removes first instance of object found
        System.out.println("index 1: " + fruits.get(1));
        System.out.println(fruits.indexOf("grape"));
        System.out.println(fruits.lastIndexOf("lemon"));

        List moreFruits = List.of("cherry", "plum");
        System.out.println(moreFruits);
    }
}

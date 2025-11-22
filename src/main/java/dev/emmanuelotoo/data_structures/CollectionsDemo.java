package dev.emmanuelotoo.data_structures;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
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
}

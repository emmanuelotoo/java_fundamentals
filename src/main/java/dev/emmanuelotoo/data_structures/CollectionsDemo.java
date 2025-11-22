package dev.emmanuelotoo.data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
//        listDemo();
//        queueDemo();
//        mapDemo();
    }
    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }


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
    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("pear");
        fruits.add("apple");

        var removed = fruits.remove();
        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());
        System.out.println(fruits);

    }
    public static void mapDemo() {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 17);
        fruitCalories.remove("lemon");

        System.out.println(fruitCalories);
        System.out.println("banana calories? " + fruitCalories.get("banana"));
        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));

        Map immutableFruitCalories = Map.of(
                "apple", 31,
                "banana", 313,
                "orange", 21
        );

        System.out.println(immutableFruitCalories);
    }
}

package dev.emmanuelotoo.streams;

import java.util.List;

public class StreamOperations {

    static List<String> veggies = List.of(
      "spinach",
      "cabbage",
      "peas",
      "green beans",
      "brussel sprouts",
      "carrot"
    );

    public static void main(String[] args) {
//        anyMatchDemo();
//        allMatch();
        filterDemo();
    }




    private static void anyMatchDemo() {
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatch() {
        boolean allMatches = veggies.stream().allMatch(v-> v.contains("s"));
        System.out.println(allMatches);
    }

    public static void filterDemo(){
        veggies.stream()
                .filter(v-> v.startsWith("c"))
                .forEach(System.out::println);
    }
}

package dev.emmanuelotoo.decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter score");

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // Using the enhanced switch statement

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work harder";
            case "F" -> "Uh oh!";
            default -> "Invalid grade";
        };

        System.out.println(message);
    }
}

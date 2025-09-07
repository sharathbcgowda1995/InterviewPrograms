package com.java.programming.automationengineer;

public class ToggleCaseExample {
    public static void main(String[] args) {
        String input = "HexAwarE";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Convert to lowercase
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                // Convert to uppercase
                result.append(Character.toUpperCase(c));
            } else {
                // Non-alphabetic characters remain unchanged
                result.append(c);
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Converted: " + result.toString());
    }
}

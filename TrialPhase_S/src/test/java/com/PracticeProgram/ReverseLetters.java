package com.PracticeProgram;

public class ReverseLetters {
    public static void main(String[] args) {
        // Input string
        String input = "java92thon145pos";

        // Step 1: Extract all the letters from the input string
        StringBuilder letters = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }

        // Step 2: Reverse the collected letters
        letters.reverse();
        
        System.out.println(letters.toString());

        // Step 3: Rebuild the output string
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                // Replace the letter with the next character from the reversed letters
                result.append(letters.charAt(letterIndex++));
            } else {
                // Keep non-letter characters as they are
                result.append(c);
            }
        }

        // Output the final result
        System.out.println("Output: " + result.toString());
    }
}

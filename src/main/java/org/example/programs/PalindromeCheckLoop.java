package org.example.programs;

public class PalindromeCheckLoop {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String sanitizedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = "";

        for (int i = sanitizedInput.length() - 1; i >= 0; i--) {
            reversed += sanitizedInput.charAt(i);
        }

        if (sanitizedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
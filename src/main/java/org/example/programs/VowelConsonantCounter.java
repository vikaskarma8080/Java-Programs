package org.example.programs;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello, World!"; // Change this to count in a different string
        countVowelsAndConsonants(input);
    }
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if the character is a letter
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++; // Character is a vowel
                } else {
                    consonantCount++; // Character is a consonant
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
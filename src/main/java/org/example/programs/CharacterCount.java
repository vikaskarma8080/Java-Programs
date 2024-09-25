package org.example.programs;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello world";
        char targetChar = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("Character '" + targetChar + "' occurs " + count + " times.");
    }
}
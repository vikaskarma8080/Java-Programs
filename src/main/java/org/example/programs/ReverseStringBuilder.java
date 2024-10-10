package org.example.programs;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String input = "Hello, World!";
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        System.out.println(reversed.toString());
    }
}
package org.example.programs;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10;
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " "); // Print the first two numbers

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
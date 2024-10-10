package org.example.programs;

public class FactorialRecursive {
    public static void main(String[] args) {
        int number = 5; // Change this to compute a different factorial
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Base case
        }
        return num * factorial(num - 1); // Recursive case
    }
}
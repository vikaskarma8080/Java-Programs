package org.example.programs;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // Power of two must be positive
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int num = 16; // Change this to test other numbers
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}
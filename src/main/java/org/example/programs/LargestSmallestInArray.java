package org.example.programs;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, -2, 7}; // Change this array to test with different values
        findLargestAndSmallest(numbers);
    }

    public static void findLargestAndSmallest(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = array[0]; // Assume the first element is the largest
        int min = array[0]; // Assume the first element is the smallest

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is larger
            }
            if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
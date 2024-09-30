package org.example.programs;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {-1,-2,-3,0,64, 34, 25, 12, 22, 11, 90}; // Change this array to test with different values
        bubbleSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Track whether a swap occurred

            for (int j = 0; j < n - 1 - i; j++) { // Last i elements are already sorted
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
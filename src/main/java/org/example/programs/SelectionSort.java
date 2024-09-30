package org.example.programs;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11, 90}; // Change this array to test with different values
        selectionSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i; // Assume the first unsorted element is the minimum

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first unsorted element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
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

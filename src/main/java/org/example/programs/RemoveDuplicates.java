package org.example.programs;

import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 2, 4, 3, 5, 1};
        int[] uniqueArray = removeDuplicates(arrayWithDuplicates);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        return uniqueArray;
    }
}
/* Output
 *
 * Array without duplicates: [1, 2, 3, 4, 5]
 *
 * */
package org.example.programs;
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = 6;
        int missingNumber = findMissingNumber(nums, n);
        System.out.println("Missing Number: " + missingNumber);
    }
    public static int findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
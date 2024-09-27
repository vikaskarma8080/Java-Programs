package org.example.programs;
public class SubsetSum {
    public static boolean isSubsetSum(int[] nums, int n, int sum) {
        // Base Cases
        if (sum == 0) return true;
        if (n == 0) return false;
        if (nums[n - 1] > sum) {
            return isSubsetSum(nums, n - 1, sum);
        }
        return isSubsetSum(nums, n - 1, sum) ||
                isSubsetSum(nums, n - 1, sum - nums[n - 1]);
    }
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = nums.length;
        if (isSubsetSum(nums, n, sum)) {
            System.out.println("Found a subset with the given sum");
        } else {
            System.out.println("No subset with the given sum");
        }
    }
}
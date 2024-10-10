package org.example.programs;

import java.util.Arrays;
public class BulbChainProblem {
    public static void main(String[] args) {
        boolean[] bulbs = {true, false, true, false, true};
        int minSwitchFlips = minSwitchFlips(bulbs);
        System.out.println("Minimum number of switch flips required: " + minSwitchFlips);
    }

    public static int minSwitchFlips(boolean[] bulbs) {
        int n = bulbs.length;
        int[][] dp = new int[n][n];

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {
                    int cost = (bulbs[i] ? 0 : 1) + (bulbs[j] ? 0 : 1);
                    if (k > i) {
                        cost += dp[i][k - 1];
                    }
                    if (k < j) {
                        cost += dp[k + 1][j];
                    }
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[0][n - 1];
    }
}
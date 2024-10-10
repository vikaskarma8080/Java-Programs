package org.example.programs;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        permuteHelper("", str, result);
        return result;
    }

    private static void permuteHelper(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                // Generate new remaining string by excluding the current character
                permuteHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), result);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = permute(input);
        System.out.println("Permutations of the string \"" + input + "\":");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
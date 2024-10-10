package org.example.programs;
import java.util.Arrays;
public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);
        return Arrays.equals(sortedStr1, sortedStr2);
    }
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println(areAnagrams(str1, str2)); // Output: true
    }
}
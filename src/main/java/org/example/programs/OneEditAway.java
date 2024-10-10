package org.example.programs;
public class OneEditAway {
    public static boolean isOneEditAway(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (Math.abs(len1 - len2) > 1) {
            return false;
        }
        if (len1 > len2) {
            return isOneEditAway(str2, str1);
        }
        int index1 = 0, index2 = 0;
        boolean foundDifference = false;
        while (index1 < len1 && index2 < len2) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
                if (len1 == len2) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ple";
        System.out.println(isOneEditAway(str1, str2));
//        str1 = "pales";
//        str2 = "pal";
//        System.out.println(isOneEditAway(str1, str2));
//        str1 = "pale";
//        str2 = "bake";
//        System.out.println(isOneEditAway(str1, str2));
    }
}
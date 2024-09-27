package org.example.programs;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabbccdd";
        String compressed = compressString(input);
        System.out.println("Compressed String: " + compressed);
    }
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            compressed.append(entry.getKey());
            compressed.append(entry.getValue());
        }
        return compressed.toString();
    }
}
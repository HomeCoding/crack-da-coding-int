package com.example.demo.ch1arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ch_1_2_StringPermutations {

    public static void main(String[] args) {
        System.out.println(isPermV1("adf", "adfa"));
        System.out.println(isPermV1("adaf", "fdaa"));
        System.out.println(isPermV2("adf", "adfa"));
        System.out.println(isPermV2("adaf", "fdaa"));
    }

    public static boolean isPermV2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            updateCounter(counts, 1, str1.charAt(i));
            updateCounter(counts, -1, str2.charAt(i));
        }

        return counts.values().stream().anyMatch(i -> i.equals(0));
    }

    private static void updateCounter(Map<Character, Integer> counts, int increment, char ch) {
        Integer count = counts.getOrDefault(ch, 0);
        counts.put(ch, count + increment);
    }


    public static boolean isPermV1(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;
        return sortString(str1).equals(sortString(str2)); // Wat O() is equals? it is O(N)
    }

    private static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}

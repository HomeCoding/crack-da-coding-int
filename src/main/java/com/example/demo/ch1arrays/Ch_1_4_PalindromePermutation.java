package com.example.demo.ch1arrays;

import java.util.HashSet;
import java.util.Set;

public class Ch_1_4_PalindromePermutation {
    public static void main(String[] args) {

//        String str = "tackmmo cat k";
        String str = "mnmmn";
        System.out.println(isPalindromePermutation(str));

    }

    public static boolean isPalindromePermutation(String str) {
        Set<Character> odds = new HashSet<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            if (odds.contains(ch)) {
                odds.remove(ch);
            } else {
                odds.add(ch);
            }
        }
        return odds.size() < 2;
    }
}

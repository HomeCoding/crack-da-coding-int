package com.example.demo.ch1arrays;

import java.util.HashSet;
import java.util.Set;

public class Ch_1_1_IsUniqueCharsString {
    public static void main(String[] args) {

        String str = "afsfdefdefdtfedt";
        String str2 = "acvbjdleig";

        System.out.println(str);
        System.out.println(isStrUniqueChars(str));
        System.out.println("------------------");

        System.out.println(str2);
        System.out.println(isStrUniqueChars(str2));
    }

    public static boolean isStrUniqueChars(String str) {
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (chars.contains(charAt)) {
                return false;
            }
            chars.add(charAt);
        }

        return true;
    }
}

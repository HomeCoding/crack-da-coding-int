package com.example.demo.ch1arrays;

public class Ch_1_5_OneEditDiff {
    public static void main(String[] args) {
        test("pale", "ple", true);
        test("pales", "pale", true);
        test("pale", "bale", true);
        test("pale", "bake", false);
    }

    public static void test(String s1, String s2, boolean expected) {
        System.out.println("=======================");
        System.out.println(s1 + '|' + s2);
        boolean actual = isOneEditDiff(s1, s2);
        System.out.println(actual);
        if (actual == expected) {
            System.out.println("PASS");
        } else {
            System.err.println("FAIL");
        }
    }

    public static boolean isOneEditDiff(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        String smaller;
        String bigger;
        if (s1.length() > s2.length()) {
            bigger = s1;
            smaller = s2;
        } else {
            bigger = s2;
            smaller = s1;
        }

        int iBigger = 0;
        int iSmaller = 0;

        boolean foundDiff = false;
        while (iBigger < bigger.length() && iSmaller < smaller.length()) {
            if (bigger.charAt(iBigger) != smaller.charAt(iSmaller)) {
                if (foundDiff) {
                    return false;
                } else {
                    foundDiff = true;
                }
                if (smaller.length() == bigger.length()) {
                    iSmaller++;
                }
            } else {
                iSmaller++;
            }
            iBigger++;
        }

        return true;
    }
}

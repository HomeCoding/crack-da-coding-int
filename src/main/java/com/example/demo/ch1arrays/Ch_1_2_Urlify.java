package com.example.demo.ch1arrays;

public class Ch_1_2_Urlify {
    private static final char SPACE = ' ';

    public static void main(String[] args) {
        var chars = "abc d  hello world  it is me                                        ".toCharArray();
        urlify(chars, 28);
        System.out.println(chars);
    }

    private static void urlify(char[] chars, int length) {
        int countSpaces = countSpaces(chars, length);
        int newLength = countSpaces * 3 + (length - countSpaces);

        int currIndex = newLength;
        for (int i = length - 1; i >= 0; i--) {
            char ch = chars[i];
            if (ch == SPACE) {
                currIndex -= 3;
                chars[currIndex] = '%';
                chars[currIndex + 1] = '2';
                chars[currIndex + 2] = '0';
            } else {
                currIndex--;
                chars[currIndex] = ch;
            }
        }
    }

    private static int countSpaces(char[] chars, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == SPACE) {
                count++;
            }
        }
        return count;
    }


}

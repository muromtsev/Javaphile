package org.pozvezd.math_strings_tasks.strings;

import java.util.stream.IntStream;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static boolean isPalindrome4(String str) {
        return IntStream.range(0, str.length() / 2)
                .noneMatch(idx -> str.charAt(idx) != str.charAt(str.length() - idx - 1));
    }

}

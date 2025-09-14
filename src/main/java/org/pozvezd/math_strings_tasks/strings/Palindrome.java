package org.pozvezd.math_strings_tasks.strings;

import java.util.stream.IntStream;

/**
 * Проверка, что строка является палиндромом
 *
 * @author muromtsev
 * @since 2025
 *
 **/

public class Palindrome {

    /**
     * Проверка, что строка является палиндромом с походом "встретится в середине"
     * @param str
     * @return boolean
     *
     **/

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

    /**
     * Проверка, что строка является палиндромом с походом "встретится в середине" с циклм for
     * @param str
     * @return boolean
     *
     **/

    public static boolean isPalindrome2(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверка, что строка является палиндромом с методом StringBuilder.reverse()
     * @param str
     * @return boolean
     *
     **/

    public static boolean isPalindrome3(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    /**
     * Проверка, что строка является палиндромом StreamAPI
     * @param str
     * @return boolean
     *
     **/

    public static boolean isPalindrome4(String str) {
        return IntStream.range(0, str.length() / 2)
                .noneMatch(idx -> str.charAt(idx) != str.charAt(str.length() - idx - 1));
    }

}

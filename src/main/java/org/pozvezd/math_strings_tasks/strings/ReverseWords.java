package org.pozvezd.math_strings_tasks.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Инвертирование букв и слов
 *
 * @author muromtsev
 * @since 2025
 *
 **/

public class ReverseWords {

    private static final String WHITESPACE = " ";
    private static final Pattern PATTERN = Pattern.compile(" +");

    /**
     *  Инвертирование букв и слов с помощью StringBuilder
     * @param str строка
     * @return String
     *
     **/

    public String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0 ; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITESPACE);
        }
        return reversedString.toString();
    }

    /**
     *  Инвертирование букв и слов с помощью StreamAPI
     * @param str строка
     * @return String
     *
     **/

    public String reverseWordsJava8(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    /**
     *  Инвертирование букв и слов с помощью метода StringBuilder.reverse()
     * @param str строка
     * @return String
     *
     **/

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}

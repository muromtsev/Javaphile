package org.pozvezd.math_strings_tasks.strings;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Подсчет гласных и согласных
 *
 * @author muromtsev
 * @since 2025
 *
 **/

public class VowelConsonantCounter {

    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    /**
     *  Подсчет гласных и согласных
     * @param str строка
     * @return Pair
     *
     **/

    public static AbstractMap.SimpleEntry<Integer, Integer> countVowelsAndConsonants(String str) {

        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
        return new AbstractMap.SimpleEntry<>(vowels, consonants);
    }

    /**
     *  Подсчет гласных и согласных StreamAPI
     * @param str строка
     * @return Pair
     *
     **/

    public static AbstractMap.SimpleEntry<Long, Long> countVowelsAndConsonantsJava8(String str) {
        str = str.toLowerCase();
        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return new AbstractMap.SimpleEntry<>(vowels, consonants);
    }
}

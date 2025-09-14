package org.pozvezd.math_strings_tasks.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Подсчет повторяющихся символов
 *
 * @author muromtsev
 * @since 2025
 *
 **/

public class StringCharacterCounter {

    /**
     *  Подсчет с помощью структуры Map
     * @param str строка
     * @return Map - Character против Integer
     *
     **/
    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }
        return map;
    }

    /**
     *  Подсчет с помощью StreamAPI
     * @param str строка
     * @return Map - Character против Longer
     *
     **/
    public Map<Character, Long> countDuplicateCharactersJava8(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

}

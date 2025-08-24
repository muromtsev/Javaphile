package org.pozvezd.math_strings_tasks.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

    private static final int EXTENDED_ASCII_CODES = 256;

    public char firstNonRepeatedCharacter(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        Arrays.fill(flags, -1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);

    }

    public char firstNonRepeatedCharacterForLinkedHashMap(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    public String firstNonRepeatedCharacterJava8(String str) {
        LinkedHashMap<Integer, Long> chars = str.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        int cp = chars.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        return String.valueOf(Character.toChars(cp));
    }

}

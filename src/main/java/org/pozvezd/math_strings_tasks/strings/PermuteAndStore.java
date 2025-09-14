package org.pozvezd.math_strings_tasks.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Генерирование всех перестановок с помощью Set
 *
 * @author muromtsev
 * @since 2025
 */

public class PermuteAndStore {

    /**
     * Перегруженный метод вызывает другой перегруженный метод
     * @param str
     * @return Set
     */

    public static Set<String> permuteAndStore(String str) {
        return permuteAndStore("", str);
    }

    /**
     * Генерирование всех перестановок с помощью Set
     * @param prefix
     * @param str
     * @return Set
     */

    public static Set<String> permuteAndStore(String prefix, String str) {
        Set<String> permutations = new HashSet<>();
        int n = str.length();

        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndStore(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return permutations;
    }

    /**
     * Генерирование всех перестановок StreamAPI
     * @param prefix
     * @param str
     * @return void
     */

    public static void permuteAndPrintStream(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix + " ");
        } else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permuteAndPrintStream(prefix + str.charAt(i),
                            str.substring(i + 1, n) + str.substring(0, i)));
        }
    }

}

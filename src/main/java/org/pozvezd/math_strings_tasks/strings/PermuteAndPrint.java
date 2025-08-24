package org.pozvezd.math_strings_tasks.strings;

public class PermuteAndPrint {

    public static String permuteAndPrint(String str) {
        permuteAndPrint("", str);
        return str;
    }

    private static void permuteAndPrint(String prefix, String str) {

        int n = str.length();

        if (n == 0) {
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }

    }

}

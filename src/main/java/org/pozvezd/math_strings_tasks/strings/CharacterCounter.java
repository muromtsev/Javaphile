package org.pozvezd.math_strings_tasks.strings;

public class CharacterCounter {

    public static int countOccurrencesOfACertainCharacter(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static int countOccurrencesOfASingleCharacter2(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public static long countOccurrencesOfASingleCharacterJava8(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}

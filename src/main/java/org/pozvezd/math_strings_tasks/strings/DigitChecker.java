package org.pozvezd.math_strings_tasks.strings;

public class DigitChecker {

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigitsJava8(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    public static boolean containsOnlyDigitsMatches(String str) {
        return str.matches("[0-9]+");
    }

}

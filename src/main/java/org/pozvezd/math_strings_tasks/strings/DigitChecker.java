package org.pozvezd.math_strings_tasks.strings;

/**
 * Проверка, содержит ли строковое значение только цифры
 *
 * @author muromtsev
 * @since 2025
 *
 **/

public class DigitChecker {

    /**
     *  Проверка, содержит ли строковое значение только цифры c Character.isDigit()
     * @param str строка
     * @return boolean
     *
     **/

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     *  Проверка, содержит ли строковое значение только цифры StreamAPI
     * @param str строка
     * @return boolean
     *
     **/

    public static boolean containsOnlyDigitsJava8(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    /**
     *  Проверка, содержит ли строковое значение только цифры с String.matches()
     * @param str строка
     * @return boolean
     *
     **/

    public static boolean containsOnlyDigitsMatches(String str) {
        return str.matches("[0-9]+");
    }

}

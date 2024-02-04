package com.polcodex._01_string_array;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        var prefix = new StringBuilder();
        var longestPrefix = "";
        for (int i = 0; i < str1.length(); i++) {
            prefix.append(str1.charAt(i));
            if (isMultiplication(str1, prefix.toString())
                    && isMultiplication(str2, prefix.toString())) {
                longestPrefix = prefix.toString();
            }
        }
        return longestPrefix;

    }

    public static boolean isMultiplication(String str, String pattern) {
        int strLength = str.length();
        int patternLength = pattern.length();

        if (strLength % patternLength != 0) {
            // If the lengths are not divisible, it cannot be a multiplication
            return false;
        }

        int repetition = strLength / patternLength;

        // Check if the reconstructed string is equal to the original string
        return pattern.repeat(repetition)
                // Check if the reconstructed string is equal to the original string
                .equals(str);
    }

}

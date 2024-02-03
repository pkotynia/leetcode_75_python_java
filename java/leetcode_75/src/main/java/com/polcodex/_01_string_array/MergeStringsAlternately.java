package com.polcodex._01_string_array;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        var lengthOfLongerString = Math.max(word1.length(), word2.length());
        var stringBuilder = new StringBuilder();
        for (int i = 0; i < lengthOfLongerString; i++) {
            if(i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

}

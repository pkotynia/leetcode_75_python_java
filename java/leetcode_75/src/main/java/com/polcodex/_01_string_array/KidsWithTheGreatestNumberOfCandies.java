package com.polcodex._01_string_array;

import java.util.LinkedList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = getMaxNumberOfCandies(candies);
        return calculateIfKidWouldHaveMaxNoOfCandies(candies, extraCandies, max);
    }

    private static LinkedList<Boolean> calculateIfKidWouldHaveMaxNoOfCandies(int[] candies, int extraCandies, int max) {
        var resultList = new LinkedList<Boolean>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                resultList.add(true);
            } else {
                resultList.add(false);
            }
        }
        return resultList;
    }

    private static int getMaxNumberOfCandies(int[] candies) {
        var max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}

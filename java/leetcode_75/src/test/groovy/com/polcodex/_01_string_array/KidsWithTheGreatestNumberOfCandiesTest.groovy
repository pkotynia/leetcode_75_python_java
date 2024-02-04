package com.polcodex._01_string_array

import spock.lang.Specification

class KidsWithTheGreatestNumberOfCandiesTest extends Specification {
    def "should return list with boolean indicating if after receiving candy kid will have most candies"() {
        expect:
        KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extra) == expected

        where:
        candies                  | extra | expected
        [2, 3, 5, 1, 3] as int[] | 3     | [true, true, true, false, true]
        [4, 2, 1, 1, 2] as int[] | 1     | [true, false, false, false, false]
        [12, 1, 12] as int[]     | 10    | [true, false, true]
    }
}

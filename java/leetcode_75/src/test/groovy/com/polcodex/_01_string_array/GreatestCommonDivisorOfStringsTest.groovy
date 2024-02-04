package com.polcodex._01_string_array

import spock.lang.Specification

class GreatestCommonDivisorOfStringsTest extends Specification {
    def "should find common divisor"() {
        expect:
        GreatestCommonDivisorOfStrings.gcdOfStrings(s1, s2) == divisor

        where:
        s1       | s2     | divisor
        "ABCABC" | "ABC"  | "ABC"
        "ABABAB" | "ABAB" | "AB"
        "LEET"   | "CODE" | ""
    }
}

package com.polcodex._01_string_array

import spock.lang.Specification

class MergeStringsAlternatelyTest extends Specification {
    def "Should merge two strings"() {
        expect:
        MergeStringsAlternately.mergeAlternately(word1, word2) == word3

        where:
        word1 | word2  | word3
        "a"   | "a"    | "aa"
        "abc" | "pqr"  | "apbqcr"
        "ab"  | "pqrs" | "apbqrs"
    }

}

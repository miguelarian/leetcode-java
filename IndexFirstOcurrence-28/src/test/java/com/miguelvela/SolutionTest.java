package com.miguelvela;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static com.miguelvela.Solution.strStr;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    @Test
    public void strStr_needle_not_present_minusOne() {

        String haystack = "this_is_a_test";
        String needle = "none";

        int index = strStr(haystack, needle);

        assertThat("The needle is not present", index, Is.is(-1));
    }

    @Test
    public void strStr_needle_haystack_same_word_zero() {

        String haystack = "this_is_a_test";
        String needle = "this_is_a_test";

        int index = strStr(haystack, needle);

        assertThat("The needle is present", index, Is.is(0));
    }
}
package com.miguelvela;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static com.miguelvela.Solution.isPalindrome;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {

    @Test
    void isPalindrome_singleDigit_returnsTrue() {
        int number = 1;

        boolean result = isPalindrome(number);

        assertThat("The number should be palindrome", result, Is.is(true));
    }

    @Test
    void isPalindrome_singleNegativeDigit_returnsTrue() {
        int number = -1;

        boolean result = isPalindrome(number);

        assertThat("The number should not be palindrome", result, Is.is(false));
    }

    @Test
    void isPalindrome_twoEqualDigits_returnsTrue() {
        int number = 11;

        boolean result = isPalindrome(number);

        assertThat("The number should be palindrome", result, Is.is(true));
    }

    @Test
    void isPalindrome_twoNegativeEqualDigits_returnsTrue() {
        int number = -11;

        boolean result = isPalindrome(number);

        assertThat("The number should not be palindrome", result, Is.is(false));
    }

    @Test
    void isPalindrome_longPalindrome_returnsTrue() {
        int number = 1122332211;

        boolean result = isPalindrome(number);

        assertThat("The number should be palindrome", result, Is.is(true));
    }

    @Test
    void isPalindrome_oddDigitsLongPalindrome_returnsTrue() {
        int number = 112232211;

        boolean result = isPalindrome(number);

        assertThat("The number should be palindrome", result, Is.is(true));
    }
}
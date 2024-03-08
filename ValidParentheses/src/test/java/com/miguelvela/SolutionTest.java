package com.miguelvela;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;

public class SolutionTest {

    @Test
    public void isValid_withStandardParenthesisInCorrectOrder_returnsTrue() {
        String input = "()";

        boolean result = Solution.isValid(input);

        assertThat(result, is(true));
    }

    @Test
    public void isValid_withAllParenthesesTypesInCorrectOrder_returnsTrue() {
        String input = "()[]{}";

        boolean result = Solution.isValid(input);

        assertThat(result, is(true));
    }

    @Test
    public void isValid_withMixedParenthesisInWrongOrder_returnsFalse() {
        String input = "(]";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_singleOpenStandardParentheses_returnsFalse() {
        String input = "(";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_singleOpenCurlyParentheses_returnsFalse() {
        String input = "{";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_singleOpenSquareParentheses_returnsFalse() {
        String input = "[";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_singleCloseStandardParentheses_returnsFalse() {
        String input = ")";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_singleCloseCurlyParentheses_returnsFalse() {
        String input = "}";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_singleCloseSquareParentheses_returnsFalse() {
        String input = "]";

        boolean result = Solution.isValid(input);

        assertThat(result, is(false));
    }

    @Test
    public void isValid_emptyInput_returnsTrue() {
        String input = "";

        boolean result = Solution.isValid(input);

        assertThat(result, is(true));
    }
}
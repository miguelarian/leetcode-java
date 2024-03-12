package com.miguelvela;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static com.miguelvela.Solution.fib;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    @Test
    public void fib_0_0() {
        int number = 0;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(0));
    }

    @Test
    public void fib_1_1() {
        int number = 1;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(1));
    }

    @Test
    public void fib_2_1() {
        int number = 2;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(1));
    }
}
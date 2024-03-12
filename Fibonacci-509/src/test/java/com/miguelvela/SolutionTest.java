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

    @Test
    public void fib_3_2() {
        int number = 3;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(2));
    }

    @Test
    public void fib_4_3() {
        int number = 4;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(3));
    }

    @Test
    public void fib_5_5() {
        int number = 5;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(5));
    }

    @Test
    public void fib_6_5() {
        int number = 6;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(8));
    }

    @Test
    public void fib_7_13() {
        int number = 7;

        int result = fib(number);

        assertThat("The result is wrong", result, Is.is(13));
    }
}
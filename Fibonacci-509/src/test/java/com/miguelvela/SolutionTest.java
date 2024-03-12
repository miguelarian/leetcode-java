package com.miguelvela;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static com.miguelvela.Solution.fib;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    @Test
    public void fib_1_1() {
        int number = 1;

        int result = fib(1);

        assertThat("The result is wrong", result, Is.is(1));
    }
}
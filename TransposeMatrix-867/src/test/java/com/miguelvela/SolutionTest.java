package com.miguelvela;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static com.miguelvela.Solution.transpose;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    @Test
    public void transpose_1x1_1x1() {

        int[][] matrix = { { 1 } };

        int[][] result = transpose(matrix);
        int[][] expected = { { 1 } };

        assertThat(result, Is.is(expected));
    }
}
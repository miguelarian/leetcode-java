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

    @Test
    public void transpose_2x2_2x2() {

        int[][] matrix = {
            { 1, 2 },
            { 1, 2 }
        };

        int[][] result = transpose(matrix);

        int[][] expected = {
                { 1, 1 },
                { 2, 2 }
        };

        assertThat(result, Is.is(expected));
    }

    @Test
    public void transpose_3x3_3x3() {

        int[][] matrix = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 }
        };

        int[][] result = transpose(matrix);

        int[][] expected = {
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 }
        };

        assertThat(result, Is.is(expected));
    }
}
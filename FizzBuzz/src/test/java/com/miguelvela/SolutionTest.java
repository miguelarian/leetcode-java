package com.miguelvela;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void fizzBuzz_nIs1_returns1() {

        var expected = new ArrayList<>(List.of("1"));

        var result = Solution.fizzBuzz(1);

        assertEquals(result, expected);
    }

    @Test
    public void fizzBuzz_nIs2_returns1_2() {

        var expected = new ArrayList<>(List.of("1", "2"));

        var result = Solution.fizzBuzz(2);

        assertEquals(result, expected);
    }
}
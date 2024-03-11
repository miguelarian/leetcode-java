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

    @Test
    public void fizzBuzz_nIs3_returns1_2_Fizz() {

        var expected = new ArrayList<>(List.of("1", "2", "Fizz"));

        var result = Solution.fizzBuzz(3);

        assertEquals(result, expected);
    }

    @Test
    public void fizzBuzz_nIs4_returns1_2_Fizz_4() {

        var expected = new ArrayList<>(List.of("1", "2", "Fizz", "4"));

        var result = Solution.fizzBuzz(4);

        assertEquals(result, expected);
    }
}
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

        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_nIs2_returns1_2() {

        var expected = new ArrayList<>(List.of("1", "2"));

        var result = Solution.fizzBuzz(2);

        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_nIs3_returns1_2_Fizz() {

        var expected = new ArrayList<>(List.of("1", "2", "Fizz"));

        var result = Solution.fizzBuzz(3);

        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_nIs4_returns1_2_Fizz_4() {

        var expected = new ArrayList<>(List.of("1", "2", "Fizz", "4"));

        var result = Solution.fizzBuzz(4);

        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_nIs5_returns1_2_Fizz_4_Buzz() {

        var expected = new ArrayList<>(List.of("1", "2", "Fizz", "4", "Buzz"));

        var result = Solution.fizzBuzz(5);

        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_nIs15_returnsNumbers_Fizz_Buzz_Alan_FizzBuzz() {

        var expected = new ArrayList<>(List.of("1","2","Fizz","4","Buzz","Fizz","Alan","8","Fizz","Buzz","11","Fizz","13","Alan","FizzBuzz"));

        var result = Solution.fizzBuzz(15);

        assertEquals(expected, result);
    }
}
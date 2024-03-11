package com.miguelvela;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void fizzBuzz_with1_returns1() {

        var expected = new ArrayList<>(List.of("1"));

        var result = Solution.fizzBuzz(1);

        assertEquals(result, expected);
    }
}
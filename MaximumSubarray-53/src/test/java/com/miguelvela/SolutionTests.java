package com.miguelvela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {

    @Test
    public void maxSubArray_withEmptyInputArray_returnsZero()
    {
        int expectedValue = 0;
        int[] input = new int[0];

        int result = Solution.maxSubArray(input);

        assertEquals(expectedValue, result);
    }

    @Test
    public void maxSubArray_withOneItemArrayIsOne_returnsItemValueOne()
    {
        int expectedValue = 1;
        int[] input = new int[] { expectedValue };

        int result = Solution.maxSubArray(input);

        assertEquals(expectedValue, result);
    }

    @Test
    public void maxSubArray_withOneItemArrayIsTwo_returnsItemValueTwo()
    {
        int expectedValue = 2;
        int[] input = new int[] { expectedValue };

        int result = Solution.maxSubArray(input);

        assertEquals(expectedValue, result);
    }

    @Test
    public void maxSubArray_withTwoItemsAndASingleValueIsPositive_returnsPositiveValue()
    {
        int[] input = new int[] { -1, 1 };

        int result = Solution.maxSubArray(input);

        assertEquals(1, result);
    }

    @Test
    public void maxSubArray_withTwoPositiveItems_returnsSumOfBothValues()
    {
        int[] input = new int[] { 1, 1 };

        int result = Solution.maxSubArray(input);

        assertEquals(2, result);
    }

    @Test
    public void maxSubArray_withThreePositiveItems_returnsSumOfAllValues()
    {
        int[] input = new int[] { 1, 1, 1 };

        int result = Solution.maxSubArray(input);

        assertEquals(3, result);
    }

    @Test
    public void maxSubArray_withThreeItemsAndOneNegativeValueInBetween_returnsFirstMaxValueFoundAtBeginning()
    {
        int[] input = new int[] { 10, -1, 1 };

        int result = Solution.maxSubArray(input);

        assertEquals(10, result);
    }

    @Test
    public void maxSubArray_withThreeItemsAndOneNegativeValueInBetween_returnsFirstMaxValueFoundAtEnd()
    {
        int[] input = new int[] { 1, -1, 11 };

        int result = Solution.maxSubArray(input);

        assertEquals(11, result);
    }

    @Test
    public void random_test()
    {
        int[] input = new int[] { -6, -5, 10 };

        int result = Solution.maxSubArray(input);

        assertEquals(10, result);
    }
}
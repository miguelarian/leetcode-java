package com.miguelvela;

import java.util.Arrays;

public class Solution {

    public static int maxSubArray(int[] input) {

        int n = input.length;
        if(n == 0) {
            return 0;
        }

        int currentMaxValue = input[0];
        int result = input[0];

        for(int index = 1; index < n; index++){
            currentMaxValue = Math.max(currentMaxValue + input[index], input[index]);
            result = Math.max(result, currentMaxValue);
        }

        return result;
    }

    public static int maxSubArray_slow(int[] nums) {

        int n = nums.length;

        if(n <= 0) {
            return 0;
        }

        int result = Integer.MIN_VALUE;

        for (int size = 1; size <= n; size++)
        {
            for(int index = 0;  index + size <= n; index++)
            {
                int[] subString = Arrays.copyOfRange(nums, index, index+size);
                int currentMaxValue = Arrays.stream(subString).sum();
                result = Math.max(result, currentMaxValue);
            }
        }

        return result;
    }
}

package com.miguelvela;

import java.util.Arrays;

public class Solution {
    public static void rotate(int[] nums, int k) {

        int[] splitArrayPart1 = Arrays.copyOfRange(nums, 0, nums.length-k);
        int[] splitArrayPart2 = Arrays.copyOfRange(nums, nums.length-k, nums.length);

        System.arraycopy(splitArrayPart1, 0, nums, splitArrayPart2.length, splitArrayPart1.length);
        System.arraycopy(splitArrayPart2, 0, nums, 0, splitArrayPart2.length);
        System.out.println(Arrays.toString(nums));
    }
}

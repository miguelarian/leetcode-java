package com.miguelvela;

import java.util.Arrays;

public class Solution {
    public static void rotate(int[] nums, int k) {

        int sanitizedK = k % nums.length;

        int[] splitArrayPart1 = Arrays.copyOfRange(nums, 0, nums.length-sanitizedK);
        int[] splitArrayPart2 = Arrays.copyOfRange(nums, nums.length-sanitizedK, nums.length);

        System.arraycopy(splitArrayPart1, 0, nums, splitArrayPart2.length, splitArrayPart1.length);
        System.arraycopy(splitArrayPart2, 0, nums, 0, splitArrayPart2.length);

        System.out.println(Arrays.toString(nums));
    }
}

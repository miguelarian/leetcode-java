package com.miguelvela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void rotate_Kis0_noRotation() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 0;

        Solution.rotate(nums, k);
        int[] expected = {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotate_Kis1_rotated1position() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 1;

        Solution.rotate(nums, k);
        int[] expected = {10,1,2,3,4,5,6,7,8,9};

        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotate_KisNumsLenght_originalNums() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = nums.length;

        Solution.rotate(nums, k);
        int[] expected = {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotate_KisBiggerThanNumsLenght_originalNums() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = nums.length + 1;

        Solution.rotate(nums, k);
        int[] expected = {10,1,2,3,4,5,6,7,8,9};

        assertArrayEquals(expected, nums);
    }
}
package com.miguelvela;

import java.util.Arrays;

public class Solution {
    public static boolean canJump(int[] nums) {

        if (nums.length == 0) {
            return true;
        }

        int jumps = nums[0];
        if (nums.length <= 1 || jumps >= nums.length-1) {
            return true;
        }

        if(jumps == 0) {
            return false;
        }

        for(int jump=jumps; jump>0; jump--) {
            int[] remainingArray = Arrays.copyOfRange(nums, jump, nums.length);
            if (canJump(remainingArray)) {
                return true;
            }
        }

        return false;
    }
}
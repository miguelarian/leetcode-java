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

//  [] -> true
//  [0] -> true
//  [99] -> true
//  [1,1] -> true
//  [0,x] -> false -> no llego al final
//  [1,x] -> true -> 1 < length del resto del array
//  [2,x] -> false -> me salgo del array

//  [1,0,x] -> false -> no llego
//  [2,0,x] -> true -> llega
//  [3,0,x] -> true -> porque los anteriores dieron true
//  [y,0,x] -> true...

//  [0,y,x] -> false siempre
//  [1,0,x] -> false => 1 + [0,x] => false

// go from right to left, and check if the problem is already solved

// use recursion
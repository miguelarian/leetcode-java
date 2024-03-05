package org.example;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result =  new int[2];
        boolean resolved = false;

        for(int i = 0; i < nums.length && !resolved; i++) {
            for(int j = 0; j < nums.length&& !resolved; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    resolved = true;
                }
            }
        }

        return result;
    }
}

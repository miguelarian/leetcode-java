package org.example;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsAndIndexes = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numsAndIndexes.put(nums[i], i);
        }

        for(int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
            int fistOperator = nums[firstIndex];
            int secondOperator = target - fistOperator;
            if(numsAndIndexes.containsKey((secondOperator)))
            {
                int secondIndex = numsAndIndexes.get(secondOperator);
                if (secondIndex == firstIndex) {
                    continue;
                }
                return new int[] { firstIndex, secondIndex };
            }
        }

        return null;
    }
}

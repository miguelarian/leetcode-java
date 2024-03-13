package org.example;

import java.util.HashMap;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> dictionary = new HashMap<>();

        for(int i : nums) {
            if (dictionary.containsKey(i)) {
                return true;
            }
            dictionary.put(i, true);
        }
        return false;
    }
}

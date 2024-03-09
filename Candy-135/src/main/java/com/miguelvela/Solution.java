package com.miguelvela;

public class Solution {
    public static int candy(int[] ratings) {

        int result = 0;

        for(int rate : ratings)
        {
            result++;
        }

        return result;
    }
}

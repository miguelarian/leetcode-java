package com.miguelvela;

public class Solution {
    public static int candy(int[] ratings) {

        int totalCandies = 0;

        for(int i = 0; i < ratings.length; i++)
        {
            int minimumCandyGiven = 1;
            int rate = ratings[i];
            int highScoreCandies = 0;

            totalCandies += minimumCandyGiven + highScoreCandies;
        }

        return totalCandies;
    }
}

package com.miguelvela;

public class Solution {
    public static int candy(int[] ratings) {

        int totalCandies = 0;

        for(int i = 0; i < ratings.length; i++)
        {
            int minimumCandiesGiven = 1;
            int rate = ratings[i];
            int highRateCandies = 0;

            boolean hasLeftNeighbour = i > 0;
            boolean hasRightLNeighbour = i < ratings.length-1;

            if(!hasLeftNeighbour && !hasRightLNeighbour) {
                highRateCandies = 0;
            }

            if(hasLeftNeighbour && !hasRightLNeighbour) {
                if(rate > ratings[i-1]) {
                    highRateCandies = ratings[i-1] + 1;
                }
            }

            if(!hasLeftNeighbour && hasRightLNeighbour) {
                if(rate > ratings[i+1]) {
                    highRateCandies = ratings[i+1] + 1;
                }
            }

            if(hasLeftNeighbour && hasRightLNeighbour) {
                if(rate > ratings[i+1]) {
                    highRateCandies = Math.min(ratings[i-1] + 1, ratings[i+1] + 1);
                }
            }

            totalCandies += minimumCandiesGiven + highRateCandies;
        }

        return totalCandies;
    }
}

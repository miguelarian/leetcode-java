package com.miguelvela;

public class Solution {
    public static int candy(int[] ratings) {

        int totalChildren = ratings.length;
        int minimumCandiesGiven = 1;

        // only one child
        if (totalChildren < 2) {
            return totalChildren;
        }

        // many children, all of them receive at least minimumCandiesGiven
        int[] candiesGiven = new int[totalChildren];
        for (int i = 0; i < totalChildren; i++) {
            candiesGiven[i] = minimumCandiesGiven;
        }

        // first pass giving candies comparing left neighbours
        for(int currentChild = 1; currentChild < totalChildren; currentChild++)
        {
            int rate = ratings[currentChild];
            if(rate > ratings[currentChild - 1]) {
                candiesGiven[currentChild] = 1 + candiesGiven[currentChild - 1];
            }
        }

        // second pass giving candies comparing right neighbours
        for (int currentChild = totalChildren - 2; currentChild >= 0; currentChild--) {
            int rate = ratings[currentChild];
            if(rate > ratings[currentChild + 1]) {
                candiesGiven[currentChild] = Math.max(candiesGiven[currentChild], 1 + candiesGiven[currentChild + 1]);
            }
        }

        return getTotalCandies(candiesGiven);
    }

    private static int getTotalCandies(int[] candies) {

        int totalCandies = 0;

        for(int i = 0; i < candies.length; i++)
        {
            totalCandies += candies[i];
        }

        return totalCandies;
    }
}

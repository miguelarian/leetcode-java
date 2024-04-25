package com.miguelvela;

import java.util.Arrays;

public class Solution {
    public static int candy(int[] ratings) {
        int n = ratings.length;

        // Special case: if all ratings are 0, each child gets one candy
        if (Arrays.stream(ratings).sum() == 0) {
            return n;
        }

        int[] candiesGiven = new int[n];

        // Initially assign one candy to each child
        Arrays.fill(candiesGiven, 1);

        // Iterate from left to right, updating the number of candies based on ratings
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candiesGiven[i] = candiesGiven[i - 1] + 1;
            }
        }

        // Iterate from right to left, update the number of candies considering ratings and already assigned candies
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candiesGiven[i] = Math.max(candiesGiven[i], candiesGiven[i + 1] + 1);
            }
        }

        // Sum up the candies array to get the total minimum number of candies needed
        int sum = 0;
        for (int candy : candiesGiven) {
            sum += candy;
        }

        return sum;
    }
}

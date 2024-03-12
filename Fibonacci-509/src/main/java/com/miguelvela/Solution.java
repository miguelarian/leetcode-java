package com.miguelvela;

public class Solution {
    private static int[] cache;

    public static int fib(int n) {
        cache = new int[n];

        return recursion(n);
    }

    public static int recursion(int n) {

        int result;

        if(n < 2) {
            result = n;
        }
        else if(cache[n-1] != 0) {
            result = cache[n-1];
        }
        else {
            result = recursion(n - 1) + recursion(n - 2);
            cache[n-1] = result;
        }

        return result;
    }
}

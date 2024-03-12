package com.miguelvela;

public class Solution {

    public static boolean isPalindrome(int number) {

        char[] digits = Integer.toString(number).toCharArray();

        int numberLength = digits.length;

        for(int leftPointer=0; leftPointer < numberLength/2; leftPointer++) {

            int rightPointer = numberLength - leftPointer - 1;

            if(digits[leftPointer] != digits[rightPointer]) {
                return false;
            }
        }

        return true;
    }
}

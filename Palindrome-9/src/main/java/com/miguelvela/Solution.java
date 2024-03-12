package com.miguelvela;

public class Solution {

    public static boolean isPalindrome(int number) {

        char[] digits = Integer.toString(number).toCharArray();

        for(int i = 0, j = digits.length-1; i < digits.length && j >= 0 && i < j; i++, j--)
        {
            if(digits[i] != digits[j]) {
                return false;
            }
        }

        return true;
    }
}

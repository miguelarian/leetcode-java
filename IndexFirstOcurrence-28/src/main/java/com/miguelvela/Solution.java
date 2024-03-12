package com.miguelvela;

public class Solution {
    public static int strStr(String haystack, String needle) {
        // AVOID: return haystack.indexOf(needle);

        if (needle.length() > haystack.length()) {
            return -1;
        }
        if(needle.equals(haystack)) {
            return 0;
        }


        return -1;
    }
}

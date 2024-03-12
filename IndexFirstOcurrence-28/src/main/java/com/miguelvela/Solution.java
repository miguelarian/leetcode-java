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

        for (int haystackIndex = 0; haystackIndex < haystack.length(); haystackIndex++)
        {
            int slowPointer = haystackIndex;
            int fastPointer = 0;
            boolean isContained = false;

            do
            {
                if (haystack.charAt(slowPointer) == needle.charAt(fastPointer))
                {
                    isContained = true;
                    fastPointer++;
                    slowPointer++;
                }
                else
                {
                    isContained = false;
                }

            } while(isContained && fastPointer < needle.length());

            if(isContained)
            {
                return haystackIndex;
            }
        }

        return -1;
    }
}

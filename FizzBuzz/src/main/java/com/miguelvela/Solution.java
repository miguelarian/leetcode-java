package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();
        for (int number = 1; number <= n; number++) {
            if(number % 3 == 0 && number % 5 == 0)
            {
                result.add("FizzBuzz");
            }
            else if(number % 3 == 0)
            {
                result.add("Fizz");
            }
            else if(number % 5 == 0)
            {
                result.add("Buzz");
            }
            else
            {
                result.add(String.valueOf(number));
            }
        }

        return result;
    }
}

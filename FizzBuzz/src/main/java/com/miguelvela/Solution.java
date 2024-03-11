package com.miguelvela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final HashMap<Integer, String> modules = new HashMap<>();

    public static List<String> fizzBuzz(int n) {

        initialiseModules();

        List<String> result = new ArrayList<>();
        for (int number = 1; number <= n; number++)
        {
            StringBuilder wordBuilder = new StringBuilder();

            updateWithWords(number, wordBuilder);

            updateWithNumbers(number, wordBuilder);

            result.add(wordBuilder.toString());
        }

        return result;
    }

    private static void updateWithNumbers(int number, StringBuilder wordBuilder) {
        if(wordBuilder.isEmpty())
        {
            wordBuilder.append(number);
        }
    }

    private static void updateWithWords(int number, StringBuilder wordBuilder) {
        for (Map.Entry<Integer, String> entry : modules.entrySet()) {
            int divisor = entry.getKey();

            if(isDivisible(number, divisor)) {
                wordBuilder.append(entry.getValue());
            }
        }
    }
    private static void initialiseModules() {
        modules.put(3, "Fizz");
        modules.put(5, "Buzz");
        modules.put(7, "Alan");
    }

    private static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}

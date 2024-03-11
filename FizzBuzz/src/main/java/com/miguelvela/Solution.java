package com.miguelvela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final HashMap<Integer, String> modules = new HashMap<>();

    private static void initialiseModules() {
        modules.put(3, "Fizz");
        modules.put(5, "Buzz");
        modules.put(7, "Alan");
    }
    public static List<String> fizzBuzz(int n) {

        initialiseModules();

        List<String> result = new ArrayList<>();
        for (int number = 1; number <= n; number++)
        {
            StringBuilder wordBuilder = new StringBuilder();

            for (Map.Entry<Integer, String> entry : modules.entrySet()) {
                int module = entry.getKey();

                if(number % module == 0) {
                    wordBuilder.append(entry.getValue());
                }
            }
            if(wordBuilder.isEmpty())
            {
                wordBuilder.append(number);
            }

            result.add(wordBuilder.toString());
        }

        return result;
    }
}

package com.miguelvela;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {

        Stack<Character> parentheses = new Stack<>();

        char[] input = s.toCharArray();


        for(char item : input) {
            char top = '\0';
            if (!parentheses.empty())
            {
                top = parentheses.peek();
            }

            switch(item) {
                case '(':
                case '{':
                case '[':
                    parentheses.push(item);
                    break;
                case ')':
                    if (top == '(')
                    {
                        parentheses.pop();
                        continue;
                    }
                    return false;
                case '}':
                    if (top == '{')
                    {
                        parentheses.pop();
                        continue;
                    }
                    return false;
                case ']':
                    if (top == '[')
                    {
                        parentheses.pop();
                        continue;
                    }
                    return false;
            }
        }

        return parentheses.empty();
    }
}
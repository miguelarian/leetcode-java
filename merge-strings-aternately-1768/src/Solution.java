public class Solution {
    public static String mergeAlternately(String word1, String word2) {

        if(word1.isEmpty()) {
            return word2;
        }

        if(word2.isEmpty()) {
            return word1;
        }

        StringBuilder result = new StringBuilder();
        for (int letterIndex = 0; letterIndex < word1.length(); letterIndex++)
        {
            char letter1 = word1.charAt(letterIndex);
            char letter2 = word2.charAt(letterIndex);
            String newAlternateLetters =  String.valueOf(letter1) + String.valueOf(letter2);
            result.append(newAlternateLetters);
        }

        return result.toString();
    }
}
public class Solution {
    public static String mergeAlternately(String word1, String word2) {

        if(word1.isEmpty()) {
            return word2;
        }

        if(word2.isEmpty()) {
            return word1;
        }

        return word1 + word2;
    }
}
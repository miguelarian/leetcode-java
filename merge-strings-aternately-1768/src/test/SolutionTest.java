import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void emptyWords_return_empty() {
        String word1 = "", word2 = "";

        String result = Solution.mergeAlternately(word1, word2);

        assertEquals("", result);
    }

    @Test
    public void emptyWord1_and_noEmptyWord2_return_word2() {
        String word1 = "", word2 = "123";

        String result = Solution.mergeAlternately(word1, word2);

        assertEquals("123", result);
    }

    @Test
    public void noEmptyWord1_and_emptyWord2_return_word2() {
        String word1 = "abc", word2 = "";

        String result = Solution.mergeAlternately(word1, word2);

        assertEquals("abc", result);
    }

    @Test
    public void twoWordsWithSingleLetter_return_bothLetters() {
        String word1 = "a", word2 = "1";

        String result = Solution.mergeAlternately(word1, word2);

        assertEquals("a1", result);
    }

    @Test
    public void twoWordsWithTwoLetters_return_alternateLetters() {
        String word1 = "ab", word2 = "12";

        String result = Solution.mergeAlternately(word1, word2);

        assertEquals("a1b2", result);
    }
}
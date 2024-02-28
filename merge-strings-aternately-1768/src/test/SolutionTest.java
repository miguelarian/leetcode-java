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
}
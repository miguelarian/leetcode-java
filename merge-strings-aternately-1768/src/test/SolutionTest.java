import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void emptyWords_return_empty() {
        String word1 = "", word2 = "";

        String result = Solution.mergeAlternately(word1, word2);

        Assertions.assertEquals("", result);
    }
}
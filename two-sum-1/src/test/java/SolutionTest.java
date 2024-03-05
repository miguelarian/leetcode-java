import org.example.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void twoSum_test1_Test() {
        int[] nums = { 3, 3 };
        int target = 6;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        int[] expected = {0, 1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void twoSum_test2_Test() {
        int[] nums = { 3,  2,  4 };
        int target = 6;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        int[] expected = {1, 2};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void twoSum_test3_Test() {
        int[] nums = { 2,7,11,15 };
        int target = 9;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        int[] expected = {0, 1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}

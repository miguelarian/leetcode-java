import org.example.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void twoSum_sameNumberTwice_validResult() {
        int[] nums = { 3, 3 };
        int target = 6;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, result, "The result is wrong");
    }

    @Test
    public void twoSum_threeDifferentNumbers_validResult() {
        int[] nums = { 3,  2,  4 };
        int target = 6;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, result, "The result is wrong");
    }

    @Test
    public void twoSum_fourDifferentNumbers_validResult() {
        int[] nums = { 2,7,11,15 };
        int target = 9;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, result, "The result is wrong");
    }
    @Test
    public void twoSum_impossibleOperation_null() {
        int[] nums = { 1,2,3 };
        int target = -1;

        Solution s  = new Solution();
        var result = s.twoSum(nums,target);

        Assertions.assertNull(result, "The sum should not be possible");
    }
}

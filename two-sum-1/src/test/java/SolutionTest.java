import org.example.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void initialiseSolution() {
        this.solution = new Solution();
    }

    @Test
    public void twoSum_sameNumberTwice_validResult() {
        int[] nums = {3, 3};
        int target = 6;

        var result = solution.twoSum(nums, target);

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, result, "The result is wrong");
    }

    @Test
    public void twoSum_threeDifferentNumbers_validResult() {
        int[] nums = {3, 2, 4};
        int target = 6;

        var result = solution.twoSum(nums, target);

        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, result, "The result is wrong");
    }

    @Test
    public void twoSum_fourDifferentNumbers_validResult() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        var result = solution.twoSum(nums, target);

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, result, "The result is wrong");
    }

    @Test
    public void twoSum_impossibleOperation_null() {
        int[] nums = {1, 2, 3};
        int target = -1;

        var result = solution.twoSum(nums, target);

        Assertions.assertNull(result, "The sum should not be possible");
    }

    @Test
    public void twoSum_emptyNums_null() {
        int[] nums = {};
        int target = 0;

        var result = solution.twoSum(nums, target);

        Assertions.assertNull(result, "The sum without nums should not be possible");
    }
}
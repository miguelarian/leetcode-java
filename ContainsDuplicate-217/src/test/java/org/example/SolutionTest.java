package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Solution.containsDuplicate;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    public void containsDuplicate_withSingleNum_returnsFalse() {
        int[] nums = {1};

        boolean result = containsDuplicate(nums);

        assertFalse(result, "The result is wrong");
    }

    @Test
    public void containsDuplicate_withDuplicates_returnsTrue() {
        int[] nums = {1,2,3,1};

        boolean result = containsDuplicate(nums);

        assertTrue(result, "The result is wrong");
    }

    @Test
    public void containsDuplicate_withNoDuplicates_returnsFalse() {
        int[] nums = {1,2,3,4};

        boolean result = containsDuplicate(nums);

        assertFalse(result, "The result is wrong");
    }
}
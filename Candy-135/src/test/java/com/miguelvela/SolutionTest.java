package com.miguelvela;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolutionTest {

    @Test
    public void candy_noRating_zero() {

        int[] ratings = {};

        int result = Solution.candy(ratings);

        assertThat(result, equalTo(0));
    }

    @Test
    public void candy_oneChild_one() {

        int[] ratings = {10};

        int result = Solution.candy(ratings);

        assertThat(result, equalTo(1));
    }
}
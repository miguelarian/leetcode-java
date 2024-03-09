package com.miguelvela;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolutionTest {

    @Test
    public void candy_noRating_returnsZero() {

        int[] ratings = {};

        int result = Solution.candy(ratings);

        assertThat(result, equalTo(0));
    }

    @Test
    public void candy_oneChild_returnsOne() {

        int[] ratings = {10};

        int result = Solution.candy(ratings);

        assertThat(result, equalTo(1));
    }

    @Test
    public void candy_threeChildrenSameRating_returnsThree() {

        int[] ratings = {0,0,0};

        int result = Solution.candy(ratings);

        assertThat(result, equalTo(3));
    }

    @Test
    public void candy_threeChildrenDifferentRating_returnsFour() {

        int[] ratings = {0,1,0};

        int result = Solution.candy(ratings);

        assertThat(result, equalTo(4));
    }
}
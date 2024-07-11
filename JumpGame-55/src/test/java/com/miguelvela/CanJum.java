package com.miguelvela;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CanJumpTest {

    @Test
    void shouldReturnTrue_whenLengthIsZero() {
        assertThat(Solution.canJump(new int[0]), is(true));
    }

    @Test
    void shouldReturnTrue_whenLengthIsOne() {
        assertThat(Solution.canJump(new int[]{0}), is(true));
    }


    static Stream<int[]> getLengthTwoValidArrays() {
        return Stream.of(
        new int[]{2, 2},
                new int[]{1, 1},
                new int[]{1, 0}
        );
    }

    @ParameterizedTest
    @MethodSource("getLengthTwoValidArrays")
    void shouldReturnTrue_whenLengthIsTwoAndIsValid(int[] nums) {
        assertThat(Solution.canJump(nums), is(true));
    }

    @Test
    void shouldReturnFalse_whenLengthIsTwoAndIsNotValid() {
        assertThat(Solution.canJump(new int[]{0,1}), is(false));
    }

    static Stream<int[]> getLengthThreeValidArrays() {
        return Stream.of(
        new int[]{1,1,0},
                new int[]{1,1,99},
                new int[]{1,1,1},
                new int[]{2,1,1},
                new int[]{2,0,1},
                new int[]{2,0,0}
        );
    }

    @ParameterizedTest
    @MethodSource("getLengthThreeValidArrays")
    void shouldReturnTrue_whenLengthIsThreeAndIsValid(int[] nums) {
        assertThat(Solution.canJump(nums), is(true));
    }

    @Test
    void shouldReturnTrue_whenLengthIsFourAndIsValid() {
        assertThat(Solution.canJump(new int[]{2,5,0,0}), is(true));
    }
}
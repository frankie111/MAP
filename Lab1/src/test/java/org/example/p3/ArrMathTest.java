package org.example.p3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrMathTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";

    @Test
    void arrSum() {
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        assert Arrays.equals(expected, ArrMath.arrSum(a, b)) : SHOULD_BE_EQUAL;
    }

    @Test
    void arrDiff() {
        int[] a = {8, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {5, 4, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {2, 9, 0, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrDiff(a, b)) : SHOULD_BE_EQUAL;
    }

    @Test
    void arrMul() {
        int[] a = {2, 3, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {4, 7, 2, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrMul(a, 2)) : SHOULD_BE_EQUAL;
    }

    @Test
    void arrDiv() {
        int[] a = {2, 3, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 1, 8, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrDiv(a, 2)) : SHOULD_BE_EQUAL;
    }
}
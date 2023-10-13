package org.example.p3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrMathTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";

    @Test
    void arrSum() {
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrSum(a, b)) : SHOULD_BE_EQUAL;

        int[] c = {1, 3, 0, 0, 0, 0, 0};
        int[] d = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        assertThrows(IllegalArgumentException.class, () -> ArrMath.arrSum(c, d), "Arrays must be non-null, non-empty and of equal length");
    }

    @Test
    void arrDiff() {
        int[] a = {8, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {5, 4, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {2, 9, 0, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrDiff(a, b)) : SHOULD_BE_EQUAL;

        int[] c = {1, 3, 0, 0, 0, 0, 0};
        int[] d = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        assertThrows(IllegalArgumentException.class, () -> ArrMath.arrDiff(c, d), "Arrays must be non-null, non-empty and of equal length");
    }

    @Test
    void arrMul() {
        int[] a = {2, 3, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {4, 7, 2, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrMul(a, 2)) : SHOULD_BE_EQUAL;

        int[] b = {};
        assertThrows(IllegalArgumentException.class, () -> ArrMath.arrMul(b, 2), "Array must not be null or empty");
        assertThrows(IllegalArgumentException.class, () -> ArrMath.arrMul(a, 10), "Nr must be a single digit integer");
    }

    @Test
    void arrDiv() {
        int[] a = {2, 3, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 1, 8, 0, 0, 0, 0, 0, 0, 0};

        assert Arrays.equals(expected, ArrMath.arrDiv(a, 2)) : SHOULD_BE_EQUAL;

        int[] b = {};
        assertThrows(IllegalArgumentException.class, () -> ArrMath.arrDiv(b, 2), "Array must not be null or empty");
        assertThrows(IllegalArgumentException.class, () -> ArrMath.arrDiv(a, 10), "Nr must be a single digit integer");
    }
}

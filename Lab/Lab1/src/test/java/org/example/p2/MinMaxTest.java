package org.example.p2;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";

    @org.junit.jupiter.api.Test
    void minNr() {
        int[] arr = {4, 2, 3, 4, 5};
        int expected = 2;
        assert expected == MinMax.minNr(arr) : SHOULD_BE_EQUAL;
    }

    @org.junit.jupiter.api.Test
    void maxNr() {
        int[] arr = {4, 2, 3, 5, 4};
        int expected = 5;
        assert expected == MinMax.maxNr(arr) : SHOULD_BE_EQUAL;
    }

    @org.junit.jupiter.api.Test
    void minSum() {
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 25;
        assert expected == MinMax.minSum(arr): SHOULD_BE_EQUAL;
    }

    @org.junit.jupiter.api.Test
    void maxSum() {
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 39;
        assert expected == MinMax.maxSum(arr): SHOULD_BE_EQUAL;
    }
}
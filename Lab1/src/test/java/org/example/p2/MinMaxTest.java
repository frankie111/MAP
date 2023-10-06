package org.example.p2;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    @org.junit.jupiter.api.Test
    void minNr() {
        int[] arr = {4, 2, 3, 4, 5};
        assert MinMax.minNr(arr) == 2 : "Should be 2";
    }

    @org.junit.jupiter.api.Test
    void maxNr() {
        int[] arr = {4, 2, 3, 5, 4};
        assert MinMax.maxNr(arr) == 5 : "Should be 5";
    }

    @org.junit.jupiter.api.Test
    void minSum() {
        int[] arr = {4, 8, 3, 10, 17};
        assert MinMax.minSum(arr) == 25 : "Should be 25";
    }

    @org.junit.jupiter.api.Test
    void maxSum() {
        int[] arr = {4, 8, 3, 10, 17};
        assert MinMax.maxSum(arr) == 39 : "Should be 39";
    }
}
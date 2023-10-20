package org.example.p1.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotenProzessorTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";

    @Test
    void nichtAusreichendeNoten() {
        int[] noten = {25, 39, 48, 88, 12};
        int[] result = NotenProzessor.nichtAusreichendeNoten(noten);
        int[] expected = {25, 39, 12};

        assertArrayEquals(expected, result);

        int[] emptyNoten = {};

        assertThrows(IllegalArgumentException.class, () -> NotenProzessor.nichtAusreichendeNoten(emptyNoten), "Array must be non-null");
    }

    @Test
    void average() {
        int[] noten = {25, 39, 48, 88, 12};
        double expected = 42.4;
        double result = NotenProzessor.average(noten);

        assert expected == result : SHOULD_BE_EQUAL;

        int[] emptyNoten = {};
        assertThrows(IllegalArgumentException.class, () -> NotenProzessor.average(emptyNoten), "Array must be non-null and non-empty");
    }

    @Test
    void roundedGrades() {
        int[] noten = {73, 67, 38, 33};
        int[] expected = {75, 67, 40, 33};
        int[] result = NotenProzessor.roundedGrades(noten);

        assertArrayEquals(expected, result);

        int[] emptyGrades = {};
        assertThrows(IllegalArgumentException.class, () -> NotenProzessor.roundedGrades(emptyGrades), "Array must be non-null and non-empty");
    }

    @Test
    void getMaxRoundedGrade() {
        int[] noten = {73, 67, 38, 33};
        int expected = 75;

        assert expected == NotenProzessor.getMaxRoundedGrade(noten) : SHOULD_BE_EQUAL;

        int[] emptyGrades = {};
        assertThrows(IllegalArgumentException.class, () -> NotenProzessor.getMaxRoundedGrade(emptyGrades), "Array must be non-null and non-empty");
    }
}
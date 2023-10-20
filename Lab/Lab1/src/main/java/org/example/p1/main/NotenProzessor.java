package org.example.p1.main;

import java.util.Arrays;

public class NotenProzessor {


    /**
     * returns failing grades
     */
    public static int[] nichtAusreichendeNoten(int[] noten) {

        if (noten == null || noten.length == 0)
            throw new IllegalArgumentException("Array must be non-null and non-empty");

        int failCount = 0;
        for (int note : noten) {
            if (note < 40) {
                failCount++;
            }
        }

        int[] result = new int[failCount];
        int index = 0;
        for (int note : noten) {
            if (note < 40) {
                result[index++] = note;
            }
        }

        return result;
    }


    /**
     * returns the average grade
     */
    public static double average(int[] noten) {
        if (noten == null || noten.length == 0)
            throw new IllegalArgumentException("Array must be non-null and non-empty");

        double sum = 0;
        for (int n : noten)
            sum += n;

        return sum / noten.length;
    }


    /**
     * returns the rounded grades
     */
    public static int[] roundedGrades(int[] noten) {
        if (noten == null || noten.length == 0)
            throw new IllegalArgumentException("Array must be non-null and non-empty");

        int[] rounded = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            int grade = noten[i];
            if (grade < 38 || grade % 5 < 3) {
                rounded[i] = grade;
            } else {
                rounded[i] = grade + (5 - grade % 5);
            }
        }

        return rounded;
    }


    /**
     * return the maximum rounded grade
     */
    public static int getMaxRoundedGrade(int[] grades) {
        if (grades == null || grades.length == 0)
            throw new IllegalArgumentException("Array must be non-null and non-empty");

        int maxRoundedGrade = Integer.MIN_VALUE;

        for (int grade : grades) {
            if (grade >= 38 && grade % 5 >= 3){
                grade = grade + (5 - grade % 5);
                maxRoundedGrade = Math.max(maxRoundedGrade, grade);
            }
        }

        return maxRoundedGrade;
    }

}

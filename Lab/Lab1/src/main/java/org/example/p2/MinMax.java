package org.example.p2;

public class MinMax {
    /**
     * Finds the minimum number in arr
     */
    public static int minNr(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");

        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    /**
     * Finds the maximum number in arr
     */
    public static int maxNr(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    /**
     * Finds the minimum Sum of len-1 elements in arr
     */
    public static int minSum(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");

        int max = maxNr(arr);
        int sum = 0;

        for (int i : arr)
            if (i != max)
                sum += i;

        return sum;
    }

    /**
     * Finds the maximum Sum of len-1 elements in arr
     */
    public static int maxSum(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");

        int min = minNr(arr);
        int sum = 0;

        for (int i : arr)
            if (i != min)
                sum += i;

        return sum;
    }
}

package org.example.p2;

public class MinMax {
    public static int minNr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    public static int maxNr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    /**
     * Find the minimum Sum of len-1 elements in arr
     */
    public static int minSum(int[] arr) {
        int max = maxNr(arr);
        int sum = 0;

        for (int i : arr)
            if (i != max)
                sum += i;

        return sum;
    }

    /**
     * Find the maximum Sum of len-1 elements in arr
     */
    public static int maxSum(int[] arr) {
        int min = minNr(arr);
        int sum = 0;

        for (int i : arr)
            if (i != min)
                sum += i;

        return sum;
    }
}

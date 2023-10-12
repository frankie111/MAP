package org.example;

public class WetterStation {
    public static int[] temps = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};

    public static int average() {
        int sum = 0;
        for (int i : temps)
            sum += i;

        return sum / temps.length;
    }

    public static int maxTemp() {
        int max = Integer.MIN_VALUE;
        for (int temp : temps)
            max = Integer.max(max, temp);

        return max;
    }

    public static int minTemp() {
        int min = Integer.MAX_VALUE;

        for (int temp : temps)
            min = Integer.min(min, temp);

        return min;
    }

    public static int[] maxDifference() {
        int i1, i2, maxDiff = 0;
        int m1 = 0, m2 = 1;
        for (int i = 0; i < temps.length - 1; i++) {
            i1 = i;
            i2 = i + 1;
            int diff = Math.abs(temps[i2] - temps[i1]);
            if (diff > maxDiff) {
                maxDiff = diff;
                m1 = i1;
                m2 = i2;
            }
        }

        return new int[]{m1 + 1, m2 + 1};
    }

    public static void table() {
        for (int i = 0; i < temps.length; i++) {
            System.out.println(i + 1 + ". " + temps[i]);
        }
    }
}

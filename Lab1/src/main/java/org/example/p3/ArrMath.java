package org.example.p3;

public class ArrMath {
    public static int[] arrSum(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0 || a.length != b.length)
            throw new IllegalArgumentException("Arrays must be of equal length");

        int[] result = new int[a.length + 1];
        int sum = 0, carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            sum = a[i] + b[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }

    public static int[] arrDiff(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0 || a.length != b.length)
            throw new IllegalArgumentException("Arrays must be of equal length");

        int[] result = new int[a.length];
        int diff = 0, carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            diff = a[i] - b[i] - carry;
            if (diff < 0) {
                diff += 10;
                carry = 1;
            } else
                carry = 0;

            result[i] = diff;
        }

        return result;
    }

    public static int[] arrMul(int[] arr, int nr) {
        int[] result = new int[arr.length + 1];
        int mul = 0, carry = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            mul = arr[i] * nr + carry;
            result[i+1] = mul % 10;
            carry = mul / 10;
        }

        result[0] = carry;
        return result;
    }
}

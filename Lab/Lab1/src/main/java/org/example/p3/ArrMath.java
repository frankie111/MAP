package org.example.p3;

public class ArrMath {

    /**
     * Computes the sum of two array-represented numbers
     *
     * @param a an array of single digit integers representing a number
     * @param b the same as a
     * @return an array representing the sum of a and b
     */

    public static int[] arrSum(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length != b.length)
            throw new IllegalArgumentException("Arrays must be non-null, non-empty and of equal length");

        int[] result = new int[a.length + 1];
        int sum, carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            sum = a[i] + b[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }

    /**
     * Computes the difference of two array-represented numbers
     *
     * @param a an array of single digit integers representing a number
     * @param b the same as a
     * @return an array representing the difference of a and b
     */
    public static int[] arrDiff(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length != b.length)
            throw new IllegalArgumentException("Arrays must be non-null, non-empty and of equal length");

        int[] result = new int[a.length];
        int diff, carry = 0;

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

    /**
     * Computes the product of an array-represented number and a single digit integer
     *
     * @param arr an array of single digit integers representing a number
     * @param nr  a single digit integer
     * @return an array representing the product of arr and nr
     */
    public static int[] arrMul(int[] arr, int nr) {
        if (nr > 9 || nr < 0)
            throw new IllegalArgumentException("Nr must be a single digit");

        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");

        int[] result = new int[arr.length];
        int mul, carry = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            mul = arr[i] * nr + carry;
            result[i] = mul % 10;
            carry = mul / 10;
        }

        return result;
    }

    /**
     * Computes the quotient of an array-represented number and a single digit integer
     *
     * @param arr an array of single digit integers representing a number
     * @param nr  a single digit integer
     * @return an array representing the product of arr and nr
     */
    public static int[] arrDiv(int[] arr, int nr) {
        if (nr > 9 || nr < 0)
            throw new IllegalArgumentException("Nr must be a single digit");

        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");

        int[] result = new int[arr.length];
        int remainder = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = remainder * 10 + arr[i];
            result[i] = current / nr;
            remainder = current % nr;
        }

        return result;
    }
}

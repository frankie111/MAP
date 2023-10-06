package org.example.p3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] a2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] sum = ArrMath.arrSum(a1, a2);

        System.out.println(Arrays.toString(sum));

        int[] a3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] a4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] diff = ArrMath.arrDiff(a3, a4);

        System.out.println(Arrays.toString(diff));

        int[] a5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] mul = ArrMath.arrMul(a5, 2);

        System.out.println(Arrays.toString(mul));
    }
}

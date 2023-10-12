package org.example;

public class Operations {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public boolean isPerfect(int x) {
        int sum = 0;
        for (int i = 1; i <= x/2; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        return sum == x;
    }
}

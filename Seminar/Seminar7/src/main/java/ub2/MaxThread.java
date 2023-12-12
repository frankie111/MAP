package ub2;

import java.util.List;

public class MaxThread extends Thread {
    private int start, end, max = 0;
    private List<Integer> numbers;

    public MaxThread(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

    }

    public int getMax() {
        return max;
    }
}

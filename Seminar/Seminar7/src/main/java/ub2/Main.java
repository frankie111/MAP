package ub2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Statistics stats = new Statistics(numbers);
        try {
            System.out.println(stats.computeMax());
            System.out.println(stats.computeSum());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package ub2;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Integer> numbersList;
    private final int THREAD_COUNT = 2;

    public Statistics(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public Integer computeSum() throws InterruptedException {
        List<Thread> sumThreads = new ArrayList<>();

        int chunkSize = numbersList.size() / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            if (end > numbersList.size())
                end = numbersList.size();
            SumThread sumThread = new SumThread(numbersList, start, end);
            sumThreads.add(sumThread);
            sumThread.start();
        }
        int sum = 0;
        for (Thread thread : sumThreads) {
            thread.join();
            sum += ((SumThread) thread).getSum();
        }

        return sum;
    }

    public Integer computeMax() throws InterruptedException {
        List<Thread> maxThreads = new ArrayList<>();

        int chunkSize = numbersList.size() / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            if (end > numbersList.size())
                end = numbersList.size();
            MaxThread maxThread = new MaxThread(numbersList, start, end);
            maxThreads.add(maxThread);
            maxThread.start();
        }

        int max = 0;
        for (Thread thread : maxThreads) {
            thread.join();
            max = Math.max(max, ((MaxThread) thread).getMax());
        }

        return max;
    }

    public List<Integer> getNumbersList() {
        return numbersList;
    }
}

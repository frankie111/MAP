package ub2;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {

    private volatile AtomicInteger currentValue;
    private int limit;

    public SharedCounter(int limit) {
        this.currentValue = new AtomicInteger(0);
        this.limit = limit;
    }

    public void increment() {
        for (int i = 0; i < limit; i++)
            currentValue.incrementAndGet();
    }

    public int getCurrentValue() {
        return currentValue.get();
    }
}

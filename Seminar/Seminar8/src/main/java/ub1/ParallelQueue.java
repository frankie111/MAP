package ub1;

import java.util.LinkedList;
import java.util.Queue;

public class ParallelQueue {
    private Queue<Integer> queue;

    public ParallelQueue() {
        this.queue = new LinkedList<>();
    }

    public synchronized boolean isEmpty() {
        return queue.isEmpty();
    }

    public synchronized void enqueue(int value) {
        queue.add(value);
        notify();
    }

    public synchronized int dequeue() throws InterruptedException {
        while (queue.isEmpty())
            wait();
        return queue.poll();
    }
}

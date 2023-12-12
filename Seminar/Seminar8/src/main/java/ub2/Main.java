package ub2;

public class Main {
    public static void main(String[] args) {
        int limit = 100_000;
        SharedCounter counter = new SharedCounter(limit);

        Thread thread1 = new Thread(() -> {
            counter.increment();
        });

        Thread thread2 = new Thread(()->{
            counter.increment();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final counter: " + counter.getCurrentValue());
    }
}

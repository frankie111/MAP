package ub3;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int THREAD_COUNT = 50;

    public static void main(String[] args) {
        List<Thread> singletonThreads = new LinkedList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread singleton = new Thread(() -> System.out.println(Singleton.getInstance()));
            singletonThreads.add(singleton);
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            singletonThreads.get(i).start();
        }
    }
}

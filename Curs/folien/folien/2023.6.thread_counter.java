// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public final static int N = 50;

    public static Object lock = new Object();
    public static Boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
            Thread T1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 2; i < N; i+=2) {
                        synchronized (lock) {
                            while (!flag) {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            System.out.println("Par: " + i);
                            flag = false;
                            lock.notify();
                        }
                    }
                }
            });

            Thread T2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i < N; i+=2) {
                        synchronized (lock) {
                            while (flag) {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            System.out.println("Impar: " + i);
                            flag = true;
                            lock.notify();
                        }
                    }
                }
            });

            T1.start();
            //T1.join();
            T2.start();
        }
}
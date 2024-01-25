import java.util.List;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread started:::" + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread ended:::" + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();

        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All threads are dead");

        Vogel vogel = new Vogel();
        Adler adler = new Adler();

        Jager jager = new Jager();

        jager.hunt(adler);

        List<Vogel> vogelList = List.of(new Vogel(1), new Vogel(2), new Vogel(3));
        Zoo zoo = new Zoo(vogelList);
        zoo.changeAge(vogelList1 -> vogelList.forEach(vogel -> vogel.setAge(10)));
        vogelList.forEach(vogel -> System.out.println(vogel.getAge()));
    }

}
import java.util.ArrayList;

public class CustomerThread extends Thread {
    private final ArrayList<MenuItem> items;
    private boolean running = true;

    public CustomerThread(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (items) {
                if(items.isEmpty())
                    running = true;
            }

            if (running){
                for (int i = 0; i < 3; i++) {
                    System.out.println("CustomerThread: Placing order and waiting 1 second");
                    synchronized (items) {
                        items.add(new Spaghetti(i));
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                running = false;
            }
        }
    }
}

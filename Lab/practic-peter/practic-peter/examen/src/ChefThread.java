import java.util.ArrayList;

public class ChefThread extends Thread {
    private final ArrayList<MenuItem> items;

    public ChefThread(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (items){
                if (items.size() == 3){
                    System.out.println("ChefThread: preparing orders!");
                    items.clear();
                }
            }
        }
    }
}

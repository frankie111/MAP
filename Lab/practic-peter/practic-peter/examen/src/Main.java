import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void testFactoryPattern(){
        assert Objects.requireNonNull(Kitchen.getMenuItem("Spaghetti")).getCategory().equals("Breakfast");
        assert Objects.equals(Objects.requireNonNull(Kitchen.getMenuItem("Salad")).getCategory(), "Dinner");
        assert Kitchen.getMenuItem("Test") == null;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<MenuItem> items = ItemUtils.readItems("menu_items.csv");
        for (MenuItem item : items){
            System.out.println(item.toString());
        }

        System.out.println();
        ItemUtils.countItems(items);

        ItemUtils.saveAvailabilityFalse(items, "unavailable_items.txt");

        testFactoryPattern();


        ArrayList<MenuItem> menuItems = new ArrayList<>();
        CustomerThread customer = new CustomerThread(menuItems);
        ChefThread chef = new ChefThread(menuItems);

        customer.start();
        chef.start();
    }
}
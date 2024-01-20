import java.awt.*;

public class Kitchen {
    public static MenuItem getMenuItem(String name){
        if (name.equals("Spaghetti")){
            return new Spaghetti(1);
        } else if (name.equals("Salad")) {
            return new Salad(1);
        }
        else return null;
    }
}

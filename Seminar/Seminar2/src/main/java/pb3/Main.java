package pb3;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderLine orderLine1 = new OrderLine(10, new ComedyMovie("Scary Movie", 10), new ComedyMovieDiscounter());
        OrderLine orderLine2 = new OrderLine(7, new SciFiMovie("Star Wars", 12), new SciFiMovieDiscounter());
        OrderLine orderLine3 = new OrderLine(5, new HorrorMovie("The Conjuring", 6), new SciFiMovieDiscounter());
        List<OrderLine> orderLines = List.of(orderLine1, orderLine2, orderLine3);
        Order order = new Order(orderLines);

        System.out.println(order.calculateTotalPrice());
    }
}


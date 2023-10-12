package pb3;

import java.util.Date;
import java.util.List;

public class Order {
    private List<OrderLine> orderLines;

    public Order(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice() {
        double price = 0.0;
        for (OrderLine orderLine: orderLines){
            price += orderLine.calculatePrice();
        }

        return price;
    }
}

package challenges.Food2Door;

import java.util.List;

public class OrderProcessor {

    public void processOrder(Vendor vendor, List<Product> products){

        Order order = new Order(products, 10);

        boolean isOK = vendor.process(order);

        if (isOK) {
            System.out.println("Order finished");
        } else {
            System.out.println("Failed during order. Try again");
        }
    }
}

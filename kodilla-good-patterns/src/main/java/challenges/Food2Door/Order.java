package challenges.Food2Door;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private List<Product> products;
    private int orderNumber;

    public Order(List<Product> products, int orderNumber) {
        this.products = products;
        this.orderNumber = orderNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}

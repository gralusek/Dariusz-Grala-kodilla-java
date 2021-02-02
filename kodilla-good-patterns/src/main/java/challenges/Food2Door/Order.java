package challenges.Food2Door;

import java.time.LocalDate;

public class Order {

    private Product product;
    private int orderNumber;
    private Vendor vendor;

    public Order(Product product, int orderNumber, Vendor vendor) {
        this.product = product;
        this.orderNumber = orderNumber;
        this.vendor = vendor;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Vendor getVendor() {
        return vendor;
    }
}

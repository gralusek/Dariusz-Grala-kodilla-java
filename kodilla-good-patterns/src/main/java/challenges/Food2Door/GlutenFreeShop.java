package challenges.Food2Door;

public class GlutenFreeShop implements Vendor {
    @Override
    public String name() {
        return "GlutenFreeShop";
    }

    @Override
    public void process(Order order) {

        System.out.println("Order has been completed");
        System.out.println("You bought " + order.getProduct().getName() + " for "
        + order.getProduct().getPrice());
        System.out.println("Thank you for your order");
        System.out.println(name());
    }
}

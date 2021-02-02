package challenges.Food2Door;

public class HealthyShop implements Vendor {
    @Override
    public String name() {
        return "HealthyShop";
    }

    @Override
    public void process(Order order) {

        System.out.println("Hello customer! This is " + name() + "!");
        System.out.println("You have just bought " + order.getProduct().getName() + " for "
        + order.getProduct().getPrice());
        System.out.println("(Order number: " + order.getOrderNumber() + ")");
        System.out.println("Thank you and stay healthy :)");
    }
}

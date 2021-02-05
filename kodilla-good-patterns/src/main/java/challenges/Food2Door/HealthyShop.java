package challenges.Food2Door;

public class HealthyShop implements Vendor {
    @Override
    public String name() {
        return "HealthyShop";
    }

    @Override
    public boolean process(Order order) {

        boolean newOrder = true;

        if (newOrder) {

            System.out.println("Hello customer! This is " + name() + "!");
            System.out.println("(Order number: " + order.getOrderNumber() + ")");
            System.out.println("Thank you and stay healthy :)");
            return true;
        } else {
            System.out.println("Dear customer, we have trouble with processing your order. Please try again");
            return false;
        }
    }
}

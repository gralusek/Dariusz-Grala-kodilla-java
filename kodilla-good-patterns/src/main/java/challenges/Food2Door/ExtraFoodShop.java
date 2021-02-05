package challenges.Food2Door;

public class ExtraFoodShop implements Vendor {
    @Override
    public String name() {
        return "ExtraFoodShop";
    }

    @Override
    public boolean process(Order order) {

        boolean newOrder = true;

        if (newOrder) {

            System.out.println("Thank you for your order in " + name() + "!");
            System.out.println("Order number: " + order.getOrderNumber());
            return true;
        } else {
            System.out.println("Order failed. Ply try again");
            return false;
        }
    }
}
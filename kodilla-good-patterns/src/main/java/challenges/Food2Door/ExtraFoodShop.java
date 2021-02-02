package challenges.Food2Door;

public class ExtraFoodShop implements Vendor {
    @Override
    public String name() {
        return "ExtraFoodShop";
    }

    @Override
    public void process(Order order) {

        System.out.println("Thank you for your order in " + name() + "!");
        System.out.println("Your ordered product: " + order.getProduct().getName() + ". Order number: "
        + order.getOrderNumber());
        System.out.println("Cost of order = " + order.getProduct().getPrice());

    }
}

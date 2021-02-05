package challenges.Food2Door;

public class GlutenFreeShop implements Vendor {
    @Override
    public String name() {
        return "GlutenFreeShop";
    }

    @Override
    public boolean process(Order order) {

        boolean newOrder = true;

        if (newOrder) {

            System.out.println("Order has been completed");
            System.out.println("Thank you for your order");
            System.out.println(name());
            return true;
        } else {
            System.out.println("We are sorry, some error occured. Ply try again");
            return false;
        }
    }
}

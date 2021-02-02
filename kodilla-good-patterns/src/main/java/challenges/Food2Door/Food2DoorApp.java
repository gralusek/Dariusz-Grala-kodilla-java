package challenges.Food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {
        ExampleOrder exampleOrder = new ExampleOrder();
        ProductDatabase productDatabase = new ProductDatabase();
        Order randOrder = exampleOrder.exampleOrder();

        randOrder.getVendor().process(randOrder);

    }
}

package challenges.Food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        ProductDatabase productDatabase = new ProductDatabase();

        orderProcessor.processOrder(extraFoodShop, productDatabase.getExtraDatabase());

    }
}

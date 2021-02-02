package challenges.Food2Door;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ExampleOrder {

    public Product product;
    public int orderNumber;
    public Vendor vendor;

    ProductDatabase productDatabase = new ProductDatabase();

    List<Product> extraList = productDatabase.getExtraDatabase();
    List<Product> glutenList = productDatabase.getGlutenDatabase();
    List<Product> healthyList = productDatabase.getHealthyDatabase();
    Random random = new Random();


    public Order exampleOrder() {

        List<List<Product>> vendors = new LinkedList<>();
        vendors.add(extraList);
        vendors.add(glutenList);
        vendors.add(healthyList);

        int randomNumber = random.nextInt(3);
        List<Product> randVendor = vendors.get(randomNumber);
        Product randomProduct = randVendor.get(randomNumber);
        int orderNumber = random.nextInt(2000);

        if (randVendor == extraList) {
            vendor = new ExtraFoodShop();
        } else if (randVendor == glutenList) {
            vendor = new GlutenFreeShop();
        } else {
            vendor = new HealthyShop();
        }

        return new Order(randomProduct, orderNumber, vendor);
    }
}

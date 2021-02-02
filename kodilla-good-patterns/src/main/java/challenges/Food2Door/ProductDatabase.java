package challenges.Food2Door;

import java.util.LinkedList;
import java.util.List;

public class ProductDatabase {

    private List<Product> extraDatabase = new LinkedList<>();
    private List<Product> glutenDatabase = new LinkedList<>();
    private List<Product> healthyDatabase = new LinkedList<>();

    public void createExtraDatabase() {
        extraDatabase.add(new Product("Super bowl",  40.00, "piece"));
        extraDatabase.add(new Product("Energy bar",  12.50, "piece"));
        extraDatabase.add(new Product("Extra grain mix",  86.55, "kg"));
    }

    public void createGlutenDatabase() {
        glutenDatabase.add(new Product("Cake", 25.10, "piece"));
        glutenDatabase.add(new Product("Juice", 8.10, "l"));
        glutenDatabase.add(new Product("Candies", 65.10, "kg"));
    }

    public void createHealthyDatabase() {
        healthyDatabase.add(new Product("Dried apples", 39.90, "kg"));
        healthyDatabase.add(new Product("Honey", 18.50, "jar"));
        healthyDatabase.add(new Product("Eco Milk", 5.850, "l"));
    }

    public List<Product> getExtraDatabase() {
        return extraDatabase;
    }

    public List<Product> getGlutenDatabase() {
        return glutenDatabase;
    }

    public List<Product> getHealthyDatabase() {
        return healthyDatabase;
    }
}

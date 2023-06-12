import java.util.*;


public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new WaterBottle("Nestle", 15, 500));
        products.add(new Snack("Lays", 25));
        products.add(new Drink("Coca-Cola", 35));
        products.add(new HotDrink("Tea", 20, 85, 150));
        products.add(new HotDrink("Coffee", 30, 90, 200));
        products.add(new HotDrink("Hot Chocolate", 40, 95, 250));

        WaterBottleVendingMachine waterVendingMachine = new WaterBottleVendingMachine();
        waterVendingMachine.initProducts(products);

        System.out.println("All products: " + waterVendingMachine.getAllProducts());
        System.out.println("Product: " + waterVendingMachine.getProduct("Nestle"));
        System.out.println("All products: " + waterVendingMachine.getAllProducts());

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProducts(products);

        System.out.println("All products: " + hotDrinkVendingMachine.getAllProducts());
        System.out.println("Product by name, volume and temperature: " +
                hotDrinkVendingMachine.getProduct("Coffee", 200, 90));

        System.out.println("All products: " + hotDrinkVendingMachine.getAllProducts());
        System.out.println("Total price of all products: " + hotDrinkVendingMachine.getAllProducts()
                .stream()
                .mapToLong(Product::getPrice)
                .sum());

        hotDrinkVendingMachine.getAllProducts()
                .stream()
                .filter(product -> product instanceof HotDrink)
                .forEach(System.out::println);
    }
}
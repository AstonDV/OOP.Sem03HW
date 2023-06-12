import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new WaterBottle("Evian", 1.50, 500));
        products.add(new Snack("Snickers", 0.75, "Mars"));
        products.add(new Drink("Coca-Cola", 1.00, "Regular"));
        products.add(new HotDrink("Coffee", 1.50, 80));
        products.add(new HotDrink("Tea", 1.00, 70));
        products.add(new HotDrink("Hot Chocolate", 2.00, 75));

        DrinkVendingMachine vendingMachine1 = new DrinkVendingMachine();
        vendingMachine1.initProducts(products);

        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine();
        vendingMachine2.initProducts(products);

        // Получение продуктов по имени
        System.out.println(vendingMachine1.getProduct("Coca-Cola"));
        System.out.println(vendingMachine1.getProduct("Snickers"));

        // Получение воды по имени и объему
        System.out.println(vendingMachine1.getProduct("Evian", 500));

        // Получение горячего напитка по имени, объему и температуре
        System.out.println(vendingMachine2.getProduct("Coffee", 0, 80));
        System.out.println(vendingMachine2.getProduct("Tea", 0, 70));
        System.out.println(vendingMachine2.getProduct("Hot Chocolate", 0, 75));

    }
}
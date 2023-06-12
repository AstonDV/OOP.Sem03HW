import java.util.*;


public class HotDrinkVendingMachine implements VendingMachine, Comparable<HotDrinkVendingMachine> {
    private List<Product> products = new ArrayList<>();

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product instanceof HotDrink) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name, long volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume) {
                    products.remove(product);
                    return hotDrink;
                }
            }
        }
        return null;
    }

    @Override
    public int compareTo(HotDrinkVendingMachine otherHotDrinkVendingMachine) {
        long sumPrice = 0;
        long otherSumPrice = 0;

        for (Product product : products) {
            sumPrice += product.getPrice();
        }

        for (Product product : otherHotDrinkVendingMachine.getAllProducts()) {
            otherSumPrice += product.getPrice();
        }

        return Long.compare(sumPrice, otherSumPrice);
    }
}
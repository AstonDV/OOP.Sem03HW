import java.util.*;

public class DrinkVendingMachine implements VendingMachine, Comparable<DrinkVendingMachine> {

    private List<Product> products = new ArrayList<>();

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product instanceof Drink) {
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

    @Override
    public int compareTo(DrinkVendingMachine o) {
        long sumPrice = 0;
        long oSumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        for (Product product : o.getAllProducts()) {
            oSumPrice += product.getPrice();
        }
        return Long.compare(sumPrice, oSumPrice);
    }
}

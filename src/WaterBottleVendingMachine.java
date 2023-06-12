import java.util.ArrayList;
import java.util.List;

public class WaterBottleVendingMachine implements VendingMachine {
    private List<Product> products = new ArrayList<>();

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
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
}
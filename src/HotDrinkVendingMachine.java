import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private List<Product> products;

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                if (product instanceof HotDrink && ((HotDrink)product).getTemperature() == temperature) {
                    return  product;
                }
            }
        }
        return null;
    }
}

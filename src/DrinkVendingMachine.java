import java.util.List;

public class DrinkVendingMachine implements VendingMachine{
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

    public Product getProduct(String name, int volume) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                if (product instanceof WaterBottle && ((WaterBottle)product).getVolume() == volume) {
                    return product;
                }
                else if (product instanceof Drink && ((Drink)product).getFlavor().equalsIgnoreCase(name)) {
                    return product;
                }
            }
        }
        return null;
    }


}

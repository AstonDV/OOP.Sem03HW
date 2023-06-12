public class Snack extends Product{
    private String brand;

    public Snack(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", brand='" + brand + '\'' +
                '}';
    }
}

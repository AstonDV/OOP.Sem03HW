public class Drink extends Product{
    private String flavor;

    public Drink(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}

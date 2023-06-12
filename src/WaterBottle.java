public class WaterBottle extends Product{
    private int volume;

    public WaterBottle(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return  volume;
    }

    public void setVolume() {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "WaterBottle{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", volume=" + volume +
                '}';
    }
}

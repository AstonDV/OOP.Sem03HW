public class WaterBottle extends Product {
    private long volume;

    public WaterBottle(String name, long price, long volume) {
        super(name, price);
        this.volume = volume;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.getName() + " " + volume + "ml, " + super.getPrice() + "p";
    }
}
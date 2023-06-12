public class HotDrink extends Product {
    private int temperature;
    private long volume;

    public HotDrink(String name, long price, int temperature, long volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + volume + "ml, " + temperature + " degrees, " + super.getPrice() + "p";
    }
}
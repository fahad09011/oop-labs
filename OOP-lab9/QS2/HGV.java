
public class HGV extends RoadVehicle {
    private double loadCapacity;
    private double price;

    // Constructor
    public HGV(int wheels, int passengers, double loadCapacity, double price) {
        super(wheels, passengers);
        this.loadCapacity = loadCapacity;
        this.price = price;
    }

    // Implementation of calculateDuty
    @Override
    public double calculateDuty() {
        return price * hgvtTaxRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + " tons, Price: $" + price + ", Duty: $" + calculateDuty();
    }
}

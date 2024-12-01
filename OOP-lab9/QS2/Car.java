
public class Car extends RoadVehicle {
    private double price;

    // Constructor
    public Car(int wheels, int passengers, double price) {
        super(wheels, passengers);
        this.price = price;
    }

    // Implementation of calculateDuty
    @Override
    public double calculateDuty() {
        return price * carTaxRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Price: $" + price + ", Duty: $" + calculateDuty();
    }
}

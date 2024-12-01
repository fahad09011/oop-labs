// RoadVehicle.java
public abstract class RoadVehicle implements ImportDuty {
    private int wheels;
    private int passengers;

    // Constructor
    public RoadVehicle(int wheels, int passengers) {
        this.wheels = wheels;
        this.passengers = passengers;
    }

    // Getters for wheels and passengers
    public int getWheels() {
        return wheels;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + ", Passengers: " + passengers;
    }
}

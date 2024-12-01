// Driver.java
public class Driver {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(4, 5, 25000);
        System.out.println("Car Details:");
        System.out.println(car);

        // Create an HGV object
        HGV hgv = new HGV(8, 2, 15, 75000);
        System.out.println("\nHGV Details:");
        System.out.println(hgv);
    }
}

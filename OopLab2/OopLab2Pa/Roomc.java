public class Roomc {
    private int roomNumber;
    private String roomType;
    private boolean occupied;
    private double rate;


    public Roomc() {
        this.roomNumber = 0;
        this.roomType = "";
        this.occupied = false;
        this.rate = 0.0;
    }

    public Roomc(int roomNumber, String roomType, boolean occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean getisOccupied() {
        return occupied;
    }

    public double getRate() {
        return rate;
    }
    
    public static void main(String[] args) {
        
        Roomc roomC = new Roomc(202, "Single", false, 90.0);


        System.out.println("Room Number: " + roomC.getRoomNumber());
        System.out.println("Room Type: " + roomC.getRoomType());
        System.out.println("Occupied: " + roomC.getisOccupied());
        System.out.println("Rate: $" + roomC.getRate());
    }
}

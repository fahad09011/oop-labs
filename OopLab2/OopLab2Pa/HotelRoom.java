
public class HotelRoom {

    private int roomnumber;
    private String roomType;
    private int roomstatus;
    private double roomrate;
    private boolean occupied;
    
    // Room number//
    public int getroomnumber() {
        return roomnumber;
    }

    public void setroomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    // Room Type//
    public String getroomType() {
        return roomType;
    }

    public void setroomType(String roomType) {
        this.roomType = roomType;
    }

    // Room status//
    public int getroomstatus() {
        return roomstatus;
    }

    public void setroomstatus(int roomstatus) {
        this.roomstatus = roomstatus;
    }

    // Room Rate//
    public double getroomrate() {
        return roomrate;
    }

    public void setroomrate(double roomrate) {
        this.roomrate = roomrate;
    }

// occupied status 
    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        if (!this.isOccupied()) {
            this.occupied = occupied;
            System.out.println("Room " + this.getroomnumber() + " is now occupied.");
        } else {
            System.out.println("Room " + this.getroomnumber() + " is already occupied.");
        }
    }
}
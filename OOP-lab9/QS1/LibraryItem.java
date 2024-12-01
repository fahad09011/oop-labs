
public class LibraryItem {
    protected String type;
    protected String ID;

    // Constructor
    public LibraryItem(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }

    // toString method to display details
    @Override
    public String toString() {
        return "Type: " + type + ", ID: " + ID;
    }
}

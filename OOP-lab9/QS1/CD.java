
public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    // Constructor
    public CD(String ID, String band, String title, int numTracks) {
        super("CD", ID); // Call to LibraryItem constructor
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    // Implementation of calculatePrice
    @Override
    public double calculatePrice() {
        return numTracks * 1.50; // Example: $1.50 per track
    }

    @Override
    public String toString() {
        return super.toString() + ", Band: " + band + ", Title: " + title + ", Tracks: " + numTracks;
    }
}

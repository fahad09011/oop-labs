
public class Driver {
    public static void main(String[] args) {
        // Create an array of LibraryItem references
        LibraryItem[] libraryItems = new LibraryItem[2];

        // Create a Book and a CD
        libraryItems[0] = new Book("B001", "George Orwell", "1984", 328);
        libraryItems[1] = new CD("C001", "The Beatles", "Abbey Road", 17);

        // Display details and calculate price for each item
        for (LibraryItem item : libraryItems) {
            System.out.println(item);
            if (item instanceof LoanItem) { // Ensure item implements LoanItem
                System.out.println("Price: $" + ((LoanItem) item).calculatePrice());
            }
            System.out.println("---");
        }
    }
}

public class rectangle {
    private double length;
    private double width;

    public rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        if (length > 0 && length <= 40) {
            this.length = length;
        } else {
            System.out.println("length must be greater than 0 and less than equal to 40");
        }

    }

    public double getwidth() {
        return width;
    }

    public void setwidth(double width) {

        if (width > 0 && width <= 40) {
            this.width = width;
        } else {
            System.out.println("width must be greater than 0 and less than equal to 40");
        }

    }

    // question 2 getarea and perameter
    public double getarea() {
        return length * width;
    }

    public double getperimeter() {
        return 2 * (length + width);
    }

    // question 3 print rectangle with ***
    public void printrectangle() {
        int intlength = (int) length;
        int intwidth = (int) width;

        // to print top row
        for (int i = 0; i < intwidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // to print left right sides
        for (int i = 0; i < intlength - 2; i++) {
            System.out.print("*"); // left
            for (int j = 0; j < intwidth - 2; j++) {
                System.out.print(" "); // center
            }
            System.out.println("*"); // right
        }

        // to print botton row
        if (intlength > 1) {
            for (int i = 0; i < intwidth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "length = " + length + " width = " + width;
    }

}
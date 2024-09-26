class rectangle {
    private int length;
    private int width;

    public rectangle() {

    }

    public int getlength() {
        return length;
    }

    public void setlength(int length) {
        if (length > 0 && length <= 40) {
            this.length = length;
        }

    }

    public int getwidth() {
        return width;
    }

    public void setwidth(int width) {

        if (width > 0 && width <= 40) {
            
            // System.out.println("width must be greater than 0 and less than equal to 40");
            this.width = width;
        }
        else{
            System.out.println("width must be greater than 0 and less than equal to 40");
        }

    }

}
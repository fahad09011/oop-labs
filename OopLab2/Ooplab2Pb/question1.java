public class question1 {
    public static void main(String[] args) {
        
        rectangle rect1 = new rectangle();
        System.out.println("default values of rectangle is "+rect1);
        
        // to check the program with wrong values
        // rect1.setlength(11);
        // rect1.setwidth(41);
        // System.out.println("wrong values of rectangle is "+rect1);
        
        
        // right values
        rect1.setlength(5);
        rect1.setwidth(35);
        System.out.println("right values of rectangle is "+rect1);

        

// System.out.println("length of rectangle is "+rectangle.getlength() +" and width is "+rectangle.getwidth());
    }
    
}

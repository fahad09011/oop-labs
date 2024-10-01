public class question1 {
    public static void main(String[] args) {

        rectangle rect1 = new rectangle();
        System.out.println("default values of rectangle is " + rect1);

        // to check the program with wrong values
        // rect1.setlength(11);
        // rect1.setwidth(41);
        // System.out.println("wrong values of rectangle is " + rect1);
        
        // to check the area and perimeter with wrong values
        // System.out.println("area" + rect1.getarea());
        // System.out.println("area" + rect1.getperimeter());

        // right values
        rect1.setlength(5);
        rect1.setwidth(35);
        System.out.println("right values of rectangle is " + rect1);

        System.out.println("area of rectangle is " + rect1.getarea());
        System.out.println("perimeter of rectangle is " + rect1.getperimeter());
    }

}


public class Main {
    public static void main(String[] args) {
        //constructor values
        System.out.println(" with default constructor values ");
        Point newpoint = new Point(10,20);
        Circle newcircle = new Circle(45, 8, 7);
        System.out.println("Point details : "+newpoint);
        System.out.println("circle details : "+newcircle +"\n");

// with change values
        System.out.println("with change values");
        newpoint.setX(12);
        newpoint.setY(11);

        newcircle.setX(12);
        newcircle.setY(11);
        newcircle.setRadius(87);

    System.out.println( "change Point values : "+newpoint );
    System.out.println( "change Circle values : "+newcircle );
    }
}

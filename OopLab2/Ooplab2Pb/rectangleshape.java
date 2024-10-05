public class rectangleshape {
    public static void main(String[] args) {
        // rectangle 1
        rectangle rect1 = new rectangle();
        rect1.setlength(7);
        rect1.setwidth(5);
        System.out.println("Rectangle 1:");
        rect1.printrectangle();


        // rectangle 2
        rectangle rect2 = new rectangle();
        rect2.setlength(4);
        rect2.setwidth(10);
        System.out.println("Rectangle 2: with lenght ");
        rect2.printrectangle();
    }
}

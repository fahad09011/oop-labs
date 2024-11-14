public class Triangle extends TwoDShape {
    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        this.base = base;
        this.height = height;
    }
public double area(){
    double result= base*height;
    return result;
}
public String toString(){
    String result = super.toString()+" base of triangle : "+base+" height of triange : "+height+" area of triangle : "+area() ;
    return result;
}
}

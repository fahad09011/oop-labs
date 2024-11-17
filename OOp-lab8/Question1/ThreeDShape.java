public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}

// Circle
class Circle extends ThreeDShape {
    private double radius;

    public Circle(String name, String colour ,double radius) {
        super(name, colour);
        this.radius = radius;
    }
	@Override
public double area(){
    return Math.PI * radius * radius;
}

public double volume() { 
    
    double volume = Math.PI * radius * radius ; 
    return volume; 
}
@Override
public String toString(){
    String result = super.toString()+"\n radius of circle : "+radius;
    return result;
}
}

// Rectanlge
class Rectangle extends ThreeDShape {
    private double length;
    private double breadth;

    public Rectangle(String name, String colour ,double length,double breadth) {
        super(name, colour);
		this.length=length;
		this.breadth=breadth;
    }
public double area(){
    return length+breadth;
}
public double volume(){
	return volume();
}

public String toString(){
    String result = super.toString()+"\n lenght = "+length+"\n breadth = "+breadth ;
    return result;
}
}

// Cylinder
class Cylinder extends ThreeDShape {
    public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);
		this.radius = radius;
		this.height = height;
	}
	private double radius;
    private double height;

	@Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
@Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
public String toString(){
    String result = super.toString()+"\n Radius = "+radius+"\n height = "+height ;
    return result;
}
}

// Sphere
class Sphere extends ThreeDShape {
    private double radius;

    public Sphere(String name, String colour ,double radius) {
        super(name, colour);
		this.radius=radius;
    }
	public double area() {
        return 4 * Math.PI * radius * radius;
    }
public double volume() {
	return (4.0 / 3.0) * Math.PI * radius * radius * radius;
}
public String toString(){
    String result = super.toString()+"\n radius = "+radius;
    return result;
}
}

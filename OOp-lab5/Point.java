public class Point {
       
        protected int x;
        protected int y;
        
        // constructor for x and 

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        // getter for x and y
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }

        public String toString(){
            String result= " Point `x` "+x+" Point `y` "+y;
            return result;
        }
        
    
}

class Circle extends Point{
    

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        String result = "super class : "+super.toString()+" radius : "+radius;

        return result;
    }
    

}

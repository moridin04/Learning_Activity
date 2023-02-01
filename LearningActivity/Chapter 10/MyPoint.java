public class MyPoint {
	// The data fields x and y that represents the coordinates with getter methods
    private double x;
    private double y;

    // A no-arg constructor that creates a point(0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // A constructor that constructs a point with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    // Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // A method named distance that returns the distance from this point to a
    // specified point of the MyPoint type.
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }

    // A method named distance that returns the distance from this point to
    // another point with specified x- and y-coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
}

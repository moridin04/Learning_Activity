public class Circle2D {
	// Two double data fields named x and y that specify the center of the circle
	// with getter methods
	double x;
	double y;

	// A data field radius with a getter method
	double radius;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
	
	// A constructor that creates a circle with the specified x, y, and radius
	public Circle2D(double x, double y, double d) {
		this.x = x;
		this.y = y;
		this.radius = d;
	}

	// A no-arg constructor that creates a default circle with (0,0) for (x,y) and 1
	// for radius
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	// A method getArea() that returns the area of the circle
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	// A method getPerimeter() that returns the perimeter of the circle
	public double getPerimeter() {
		return 2 * Math.PI * radius; // Perimeter = 2 * pi * r
	}

	// A method contains(double x, double y) that returns true if the specified
	// point (x,y) is inside this circle
	public boolean contains(double x, double y) {
		double distance = Math.sqrt(Math.pow(x - x, 2) + Math.pow(y - y, 2));
		return distance <= radius;
	}

	// A method contains(Circle2D circle) that returns true if the specified circle
	// is inside this circle
	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
		return distance + circle.getRadius() < radius;
	}

	// A method overlaps(Circle2D circle) that returns true if the specified circle
	// overlaps with this circle
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
		return distance < radius + circle.getRadius();
	}
}


public class MyRectangle2D {

	// Two double data fields named x and y that specify the center of the
	// rectangle with getter and setter methods. (Assume that the rectangle sides
	// are parallel to x- or y- axes.)
	double x;
	double y;
	double width;
	double height;

	// Getter
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// Setter
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// A no-arg constructor that creates a default rectangle with (0, 0) for (x,
	// y) and 1 for both width and height.
	public MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}

	// A constructor that creates a rectangle with the specified x, y, width and
	// height
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// A method getArea() that returns the area of the rectangle
	public double getArea() {
		return width * height;
	}

	// A method getPerimeter() that returns the area of the rectangle
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// A method contains(double x, double y) that returns true if the specified
	// point (x, y) is inside this rectangle
	public boolean contains(double x, double y) {
		return (x >= this.x - width / 2) && (x <= this.x + width / 2) && // Checks if point is within left or right
				(y >= this.y - height / 2) && (y <= this.y + height / 2); // Checks if point is within top or bottom
	}

	// A method contains(MyRectangle2D r) that returns true if the specified
	// rectangle is inside this rectangle
	public boolean contains(MyRectangle2D r) {
		return (r.getX() - r.getWidth() / 2 >= this.x - this.width / 2)
				&& (r.getX() + r.getWidth() / 2 <= this.x + this.width / 2)
				&& (r.getY() - r.getHeight() / 2 >= this.y - this.height / 2)
				&& (r.getY() + r.getHeight() / 2 <= this.y + this.height / 2);
	}

	// A method overlaps(MyRectangle2D r) that returns true if the specified
	// rectangle overlaps with this rectangle
	public boolean overlaps(MyRectangle2D r) {
		return (x - r.getX() < (this.width + r.getWidth()) / 2) && // Checks if within width of the two rectangles
				(y - r.getY() < (this.height + r.getHeight()) / 2); // Checks if within height of the two rectangles
	}

}

public class Triangle2D {
	/*
	 * Three points named p1, p2, and p3 of the type MyPoint with getter and setter
	 * methods. MyPoint is defined in Programming Exercise 10.4.A no-arg constructor
	 * that creates a default triangle with the points (0, 0), (1,1), and (2, 5).
	 */
	MyPoint p1;
	MyPoint p2;
	MyPoint p3;

	// Getter
	public MyPoint getP1() {
		return p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	// Setter
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	public Triangle2D() {
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);
	}

	// A constructor that creates a triangle with the specified points
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	// A method getArea() that returns the area of the triangle
	public double getArea() {
		double side1 = p1.distance(p2);
		double side2 = p2.distance(p3);
		double side3 = p3.distance(p1);
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// A method getPerimeter() that returns the perimeter of the triangle
	public double getPerimeter() {
		double side1 = p1.distance(p2); // distance from one point to another
		double side2 = p2.distance(p3);
		double side3 = p3.distance(p1);
		return side1 + side2 + side3; // perimeter = add all sides
	}

	// A method contains(MyPoint p) that returns true if the specified point p is
	// inside this triangle
	public boolean contains(MyPoint p) {
		double area1 = new Triangle2D(p, p1, p2).getArea();
		double area2 = new Triangle2D(p, p2, p3).getArea();
		double area3 = new Triangle2D(p, p3, p1).getArea();
		double areaTotal = new Triangle2D(p1, p2, p3).getArea();

		return (area1 + area2 + area3 == areaTotal);
	}

	// A method contains (Triangle2D t) that returns true if the specified triangle
	// is inside this triangle
	public boolean contains(Triangle2D t) {
		return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
	}

	// A method overlaps(Triangle2D t) that returns true if the specified triangle
	// overlaps with this triangle
	public boolean overlaps(Triangle2D t) {
		    return this.contains(t.getP1()) || this.contains(t.getP2()) || this.contains(t.getP3()) ||
		           t.contains(this.getP1()) || t.contains(this.getP2()) || t.contains(this.getP3());
	}

}

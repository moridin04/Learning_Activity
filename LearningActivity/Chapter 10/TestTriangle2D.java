public class TestTriangle2D {
	public static void main(String[] args) {

		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("Area of t1: " + t1.getArea());
		System.out.println("Perimeter of t1: " + t1.getPerimeter());
		System.out.println("t1.contains(3, 3): " + t1.contains(new MyPoint(3, 3)));

		Triangle2D t2 = new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4));
		System.out.println("t1.contains(t2): " + t1.contains(t2));
		
		Triangle2D t3 = new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5));
        System.out.println("c1.overlaps(c3): " + t1.overlaps(t3));

	}
}

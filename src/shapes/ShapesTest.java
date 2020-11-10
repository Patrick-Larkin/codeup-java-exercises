package shapes;

public class ShapesTest {
	public static void main(String[] args) {
		System.out.println("Hello, World!");

		Rectangle box1 = new Rectangle(5, 4);
		System.out.println("box1.getArea() = " + box1.getArea());
		System.out.println("box1.getPerimeter() = " + box1.getPerimeter());

		System.out.println();

		Square box2 = new Square(5);
		System.out.println("box2.getArea() = " + box2.getArea());
		System.out.println("box2.getPerimeter() = " + box2.getPerimeter());


		Quadrilateral[] group = new Quadrilateral[5];

		group[0] = new Rectangle(4, 5);
		group[1] = new Square(1);
		group[2] = new Square(70);
		group[3] = new Square(24);
		group[4] = new Square(8);

		for (Quadrilateral quad : group) {
			System.out.println("\nquad.getArea() = " + quad.getArea());
			System.out.println("quad.getPerimeter() = " + quad.getPerimeter());
		}


		Measurable myShape = new Rectangle(3,4);
		System.out.println("\n\nmyShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getArea() = " + myShape.getPerimeter());

		myShape = new Square(7);
		// myShape.getLength(5); // cannot access
		System.out.println("\nmyShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getArea() = " + myShape.getPerimeter());
	}
}

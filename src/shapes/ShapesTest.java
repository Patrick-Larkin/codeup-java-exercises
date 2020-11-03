package shapes;

public class ShapesTest {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(5, 4);
		System.out.println("box1.getArea() = " + box1.getArea());
		System.out.println("box1.getPerimeter() = " + box1.getPerimeter());

		Rectangle box2 = new Square(5);
		System.out.println("box2.getArea() = " + box2.getArea());
		System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
	}
}
//
//////    Rectangle[] group = new Rectangle[2];
////
//////    group[0] = new Rectangle(4, 5);
//////    group[1] = new Square(5);
////
//////    for (Rectangle rect : group) {
//////      System.out.println("rect.getArea() = " + rect.getArea());
//////      System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
//////    }
////
////
////    System.out.println("First with a rectangle");
////    Measurable myShape = new Rectangle(3, 4);
////    System.out.println(myShape.getArea());
////    System.out.println(myShape.getPerimeter());
////
////    System.out.println("Second with a square");
////    myShape = new Square(7);
////    System.out.println(myShape.getArea());
////    System.out.println(myShape.getPerimeter());
////  }
////}

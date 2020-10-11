package shapes;

////Todo 8: Create a new class, ShapesTest
public class ShapesTest {
  public static void main(String[] args) {
    //Todo 9.a: create a variable of the type Rectangle named box1
//    Rectangle box1 = new Rectangle(5, 4);
//
//    //Todo 9.b: and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//    System.out.println("box1.getArea() = " + box1.getArea());
//    System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//
//  //Todo 10.a: create a variable of the type Rectangle named box2
//  Rectangle box2 = new Square(5);
//    //Todo 10.b: Assign it a new instance of the Square class that has a side value of 5
//    System.out.println("box2.getArea() = " + box2.getArea());
//    System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//

    Rectangle[] group = new Rectangle[2];

        group[0] = new Rectangle(4,5);
        group[1] = new Square(5);

    for( Rectangle rect :group) {
      System.out.println("rect.getArea() = " + rect.getArea());
      System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
    }
  }
}

package shapes;
//Todo 1: create a class named Rectangle.
public class Rectangle {
  //Todo 2: protected properties for both length and width
  protected double length;
  protected double width;

  //Todo 3: define a constructor that accepts two numbers for length and width, and sets those properties.
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  //Todo 4: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
  public double getArea(double length, double width) {
    return length * width;
  }

  public double getPerimeter(double length, double width) {
    return (2 * length) + (2 * width);
  }
}


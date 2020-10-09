package shapes;
//Todo 1: create a class named Rectangle
public class Rectangle {
  //Todo 2: Should have protected properties for both length and width
  protected double length;
  protected double width;

  //Todo 3: Should define a constructor that accepts two numbers for length and width
  public Rectangle(double aLength, double aWidth) {
    this.length = aLength;
    this.width = aWidth;
  }

  //Todo 4.a:Methods getPerimeter that return the respective values.
  public double getPerimeter() {
    return (2 * this.length) + (2 * this.width);
  }
  //Todo 4.b:Methods getArea that return the respective values.
  public double getArea() {
    return this.length * this.width;
  }
}



package shapes;
//Todo 1: Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral { // implement Measurable causes error
  //Todo 3: Should define a constructor that accepts two numbers for length and width
  public Rectangle(double aLength, double aWidth) {
    this.length = aLength;
    this.width = aWidth;
  }
  @Override
  public double setLength() {
    return 0;
  }

  @Override
  public double setWidth() {
    return 0;
  }
}

  //
//  //Todo 4.a:Methods getPerimeter that return the respective values.
//  public double getPerimeter() {
//    return (2 * this.length) + (2 * this.width);
//  }
//  //Todo 4.b:Methods getArea that return the respective values.
//  public double getArea() {
//    return this.length * this.width;
//  }
//}



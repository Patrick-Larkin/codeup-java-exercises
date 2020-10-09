package shapes;
//Abstract Classes and Interfaces Todo 3.a: Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
  abstract class Quadrilateral extends Shape { //implements Measurable

  //Abstract Classes and Interfaces Todo 3.b: This class should have protected properties:
  protected double length;
  protected double width;

  public Quadrilateral(double aLength, double aWidth) {
    this.length = aLength;
    this.width = aWidth;
  }

  //Todo 3.c: methods for getting the length and width.
  public double getLength(){
    //??
  };

  public double getWidth(){
    //??
  };

  //  public double getPerimeter() {
//    return (2 * this.length) + (2 * this.width);
//  }
//  public double getArea() {
//    return this.length * this.width;
//  }

  //Todo 3.d: abstract methods for setting the length and width.
  public abstract double setLength();

  public abstract double setWidth();
}

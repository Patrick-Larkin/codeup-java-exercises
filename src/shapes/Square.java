package shapes;
//Todo 5: Create a class named Square that extends Quad.
public class Square extends Quadrilateral {
  public Square(side) {
    super(side);
    this.length = side;
    this.width = side;
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

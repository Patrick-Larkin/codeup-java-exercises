package shapes;
//Todo 5: Create a class named Square that extends Rectangle.
public class Square extends Rectangle {

  //Todo 7: Calls the parent's constructor to set both the length and width to the value of side
  public Square(double side) {
    super(side, side);
  }
}






//  public double Square(double side) {
//    return super.getPerimeter(side, side);
//  }
//}
////
////class Square extends Rectangle {
////  public Square(double side) {
////    super();
////  }
////}
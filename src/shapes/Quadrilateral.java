package shapes;
  abstract class Quadrilateral extends Shape implements Measurable {
		protected double length;
		protected double width;


	  public Quadrilateral(double length, double width) {
		  this.length = length;
		  this.width = width;
	  }

	  public double getLength() {
	  	return length;
	  }

	  public double getWidth() {
		  return width;
	  }

	  public void setLength(double length) {
	  	/*this.length = length;*/
	  }

	  public void setWidth(double width) {
		  /*this.width = width*/;
	  }
  }













































//  //Abstract Classes and Interfaces Todo 3.b: This class should have protected properties:
//  protected double length;
//  protected double width;
//
//  public Quadrilateral(double aLength, double aWidth) {
//    this.length = aLength;
//    this.width = aWidth;
//  }
//
//  //Todo 3.c: methods for getting the length and width.
//  public double getLength(){
//    return this.length;
//  };
//
//  public double getWidth(){
//    return this.width;
//  };
//
//  //Todo 3.d: abstract methods for setting the length and width.
//  public abstract void setLength(double length);
//  public abstract void setWidth(double width);
//}

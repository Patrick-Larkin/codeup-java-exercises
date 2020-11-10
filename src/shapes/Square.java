package shapes;

public class Square extends Quadrilateral {

	public Square(double sides) {
		super(sides, sides);
	}

	@Override
	public void setLength(double length) {
		this.length = length;
		this.width = length;
	}

	@Override
	public void setWidth(double width) {
		this.length = width;
		this.width = width;
	}

	@Override
	public double getArea() {
		return Math.pow(this.width, 2);
	}

	@Override
	public double getPerimeter() {
		return 4 * this.length;
	}
}


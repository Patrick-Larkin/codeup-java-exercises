package Retake;

public class Device {
	private String type;
	private String brand;
	private double price;

	public Device(String type, String brand, double price) {
		this.type = type;
		this.brand = brand;
		this.price = price;
	}
	/*Todo:Inside the constructor, if either of the passed brand or type arguments are null, or if the passed price
				is 0, the constructor should throw an IllegalArgumentException.
	*/

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

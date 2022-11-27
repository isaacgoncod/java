package fpoo01.project003.entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width + height) * 2;
	}

	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

	public String toString() {
		return String.format("Area: %.2f\nPerimeter: %.2f\nDiagonal: %.2f", area(), perimeter(), diagonal());
	}
}

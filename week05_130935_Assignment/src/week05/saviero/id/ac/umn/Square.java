package week05.saviero.id.ac.umn;

public class Square extends Shape{
	private double side;
	
	public Square(double side, String color) {
		super(color);
		this.side = side;
	}
	
	public double getSide() { return side; }
	public double getArea() { return side * side; }
	public double getPerimeter() { return 4 * side; }
}

package week05.saviero.id.ac.umn;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() { return length;}
	public double getWidth() { return width;}
	public double getArea() { return length * width;}
	public double getPerimeter() { return 2 * (length + width);}	
}

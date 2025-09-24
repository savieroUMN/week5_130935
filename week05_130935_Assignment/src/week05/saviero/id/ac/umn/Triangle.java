package week05.saviero.id.ac.umn;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base, double height, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getBase() { return base;}
	public double getHeigth() { return height;}
	public double getArea() { return 0.5 * base * height;}
	public double getPerimeter() { 
		double hypotenuse = Math.sqrt((base * base) + (height * height));
		return base + height + hypotenuse;
	}
}

package week05.saviero.id.ac.umn;

public class Circle extends Shape{
	private double radius;
	
	public Circle (double radius, String color) {
		super(color);
		this.radius = radius;
	}
	public double getRadius() {return radius;}
	public double getArea() {return Math.PI * radius * radius;}
	public double getPermeter() {return Math.PI * 2 * radius;}
}

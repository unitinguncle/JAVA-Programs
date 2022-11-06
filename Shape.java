package day06;

abstract class Shape {
	public abstract double getArea();
	public abstract void printDetails();
}

class Rectangle extends Shape {
	
	private double length;
	private double breadth;
	
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return (length * breadth);
	}
	public void printDetails() { 
		System.out.println("Type = Rectangle");
		System.out.println("Length = "+this.length);
		System.out.println("Breadth = "+this.breadth);
		System.out.println("Area: "+getArea());
	}
}

class Circle extends Shape {
	
	private double radius;
		
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (3.14*this.radius*this.radius);
	}
	public void printDetails() { 
		System.out.println("Type = Circle");
		System.out.println("Radius = "+this.radius);
		System.out.println("Area = "+getArea());
	}
	
}

class Triangle extends Shape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (0.5 * this.base * this.height);
	}
	public void printDetails() { 
		System.out.println("Type = Triangle");
		System.out.println("Base = "+this.base);
		System.out.println("Height = "+this.height);
		System.out.println("Area: "+getArea()+ "\n");
	}
}

public class Guided1 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle (30.3, 45.4);
		Circle cir = new Circle(23.2);
		Triangle tr = new Triangle(146.2, 40.0);
		
		rec.printDetails();
		System.out.println();
		cir.printDetails();
		System.out.println();
		tr.printDetails();
	}

}

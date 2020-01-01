package firstpart;

public class Circle extends Shape {
	public int x;
	public int y;
	public int radius;
	public Circle() {
		this(10,10,29);
		//super();
		/*
		x = 10;
		y = 10;
		radius = 20;
		*/
	}
	public Circle(int x, int y, int radius) {
		//super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	public Circle(int area) {
		super(area);
		System.out.println("default const"
				+ " from Circle class invoked");
		
	}
	public Circle(Circle c) {
		this.x = c.x;
		this.y = c.y;
		this.radius = c.radius;
	}
	public  double getArea() {
		return -1;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Circle is object include radius"+
				this.radius+" and x is :" + this.x + 
				" and y is : " +this.y;
	}
}

package last;

public class Circle implements Shape {
	int length, radius;
	
	public Circle(int length, int width) {
		this.length = length;
		this.radius = width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle has printed");
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}

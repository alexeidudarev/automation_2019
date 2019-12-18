package firstpart;

public class Shape {
	public int area ;
	public Shape() {
		System.out.println("default const"
				+ " from Shape class invoked");
	}
	public Shape(int area) {
		this.area = area;
		System.out.println("second constr"
				+ " Shape printed , area : " + area);
	}
	public double getArea() {
		return -1;
	}
}
